import java.io.*;
import java.net.*;

public class Servidor{  
    
    private int port;
    private ServerSocket ss;
    private Socket sc;
    private BufferedReader entrada;
    private PrintWriter salida;

    public Servidor(){
        port = 1234;
    }

    public Servidor(int p){
        port = p;
    }

    public void init(){
        try {
            ss = new ServerSocket(port);//Se crea el socket para el servidor en puerto 1234
            sc = new Socket(); //Socket para el cliente            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }
    }

    public void correrServidor() throws IOException{
        System.out.println("Esperando cliente");
        try {
            // Se bloquea hasta que recibe alguna petición de un cliente
            // abriendo un socket para el cliente
            sc = ss.accept();
            System.out.println("Connexión acceptada: "+ sc);
            
            // Establece canal de entrada
            entrada = new BufferedReader(new InputStreamReader(sc.getInputStream()));
            
            // Establece canal de salida
            salida = new PrintWriter(new BufferedWriter(
                new OutputStreamWriter(
                sc.getOutputStream())),true);
            
            // Hace eco de lo que le proporciona el cliente, hasta que recibe "Adios"
            while(true){
                String str = entrada.readLine();
                System.out.println("Cliente: " + str);
                salida.println(str);
                if (str.equals("Adios")) break;
            }

        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }  
        salida.close();
        entrada.close();
    }

    public void cerrar() throws IOException{
        sc.close();
        ss.close();
    }

    public static void main(String[] args) throws IOException{
        Servidor s = new Servidor();
        s.init();
        s.correrServidor();
        s.cerrar();
    }
}