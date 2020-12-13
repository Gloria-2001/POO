import java.net.*;
import java.io.*;

public class Cliente{

    private String host;
    private int port;
    private Socket sc;
    private BufferedReader entrada;
    private PrintWriter salida;

    public Cliente(){
        port = 1234;
        host = "localhost";
    }

    public Cliente(int p){
        port = p;
        host = "localhost";
    }

    public Cliente(String h, int p){
        host = h;
        port = p;
    }

    public void init(){
        try {
            sc = new Socket(host,port); //Socket para el cliente
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }
    }

    public void correrCliente() throws IOException{
        try {
            // Obtenemos el canal de entrada
            entrada = new BufferedReader(new InputStreamReader(sc.getInputStream()));
            
            // Obtenemos el canal de salida
            salida = new PrintWriter(new BufferedWriter(new 
            OutputStreamWriter(sc.getOutputStream())),true);
        }catch (IOException e){
            System.err.println("No puede establer canales de E/S para la conexión");
            System.exit(0);
        }
        BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));

        String linea;

        // El programa cliente no analiza los mensajes enviados por el
        // usario, simplemente los reenvía al servidor hasta que este
        // se despide con "Adios"
        try {
            while (true) {
                // Leo la entrada del usuario
                System.out.print("Ingrese una palabra: ");
                linea = stdIn.readLine();

                // La envia al servidor
                salida.println(linea);
                
                // Envía a la salida estándar la respuesta del servidor
                linea = entrada.readLine();
                System.out.println("Respuesta del servidor: " + linea);
                
                // Si es "Adios" es que finaliza la comunicación
                if (linea.equals("Adios")) break;
            }
        }catch (IOException e){
            System.out.println("IOException: " + e.getMessage());
        }

        // Libera recursos
        salida.close();
        entrada.close();
        stdIn.close();
    }

    public void cerrar() throws IOException{
        sc.close();
    }

    public static void main(String[] args)  throws IOException{
        Cliente c = new Cliente();
        c.init();
        c.correrCliente();
        c.cerrar();
    }
}