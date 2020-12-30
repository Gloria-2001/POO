import java.net.*;
import java.io.*;

public class Cliente{

    private String host;    // IP
    private int port;       // puerto del servidor
    private Socket sc;      // Nuestro socket cliente
    private BufferedReader entrada, fromServer; // Lo que recibimos del servidor
    private PrintWriter salida; // Lo que mandamos al servidor

    public Cliente(){
        port = 1234;
        host = "localhost"; // 127.0.0.1
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
            entrada = new BufferedReader(new InputStreamReader(System.in));
            fromServer = new BufferedReader(new InputStreamReader(sc.getInputStream()));    // Lo que viene del servidor
            
            // Obtenemos el canal de salida
            salida = new PrintWriter(new BufferedWriter(new 
            OutputStreamWriter(sc.getOutputStream())),true);
        }catch (IOException e){
            System.err.println("No puede establer canales de E/S para la conexión");
            System.exit(0);
        }

        String linea;

        // El programa cliente no analiza los mensajes enviados por el
        // usario, simplemente los reenvía al servidor hasta que este
        // se despide con "Adios"
        try {
            while (true) {
                // Leo la entrada del usuario
                System.out.print("Ingrese una palabra: ");
                linea = entrada.readLine();

                // La envia al servidor
                salida.println(linea);
                
                // Si es "Adios" es que finaliza la comunicación
                if (linea.equals("exit")) break;

                String newLine = fromServer.readLine();

                System.out.println("Respuesta del servidor: " + newLine);
            }
        }catch (IOException e){
            System.out.println("IOException: " + e.getMessage());
        }

        // Libera recursos
        salida.close();
        entrada.close();
        fromServer.close();
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