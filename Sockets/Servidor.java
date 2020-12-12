import java.io.*;
import java.net.*;

public class Servidor{
    private int puerto;     // Puerto de conexión
    private String host;    // Host de conexión
    protected String msgDeCliente; //Mensajes entrantes (recibidos) en el servidor
    protected ServerSocket ss; //Socket del servidor
    protected Socket sc; //Socket del cliente
    protected DataOutputStream salidaServidor, salidaCliente; //Flujo de datos de salida

    public Servidor(){
        puerto = 1234;
        host = "localhost";
    }

    public Servidor(int p){
        puerto = p;
        host = "localhost";
    }

    public Servidor(int p, String h){
        puerto = p;
        host = h;
    }

    public void init(){
        try{
            ss = new ServerSocket(puerto);  // Inicia el socket del servidor en un puerto dado
            sc = new Socket();  // Socket para el cliente que quiera respuesta
            System.out.println("Conexion iniciada");   
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void cerrar(){
        try{
            System.out.println("Conexion finalizada");
            ss.close();   
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void correrServidor(){
        try {
            System.out.println("Esperando..."); //Esperando conexión
            sc = ss.accept(); //Accept comienza el socket del cliente y espera una conexión desde un cliente
            System.out.println("Cliente en línea");
            
            //Se obtiene el flujo de salida del cliente para enviarle mensajes
            salidaCliente = new DataOutputStream(sc.getOutputStream());
            
            //Se le envía un mensaje al cliente usando su flujo de salida
            salidaCliente.writeUTF("Petición recibida y aceptada");
            
            //Se obtiene el flujo entrante desde el cliente
            BufferedReader entrada = new BufferedReader(new InputStreamReader(sc.getInputStream()));
            
            //Mientras haya mensajes desde el cliente
            while((msgDeCliente = entrada.readLine()) != null){
                System.out.println(msgDeCliente); //Se muestra por pantalla el mensaje recibido
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args){
        Servidor server = new Servidor();
        server.init();
        server.correrServidor();
        server.cerrar();
    }

}