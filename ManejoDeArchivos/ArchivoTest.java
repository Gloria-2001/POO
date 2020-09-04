import java.util.Scanner;
import java.io.*;

public class ArchivoTest{

    private File inputFile;
    private File outputFile;

    public void leer(String name){
        try{
            // Se crea y se abre un fichero.
            inputFile = new File(name);

            // Se crea un lector del archivo y un buffer
            // que contendrá el texto del archivo
            FileReader fr = new FileReader(inputFile);
            BufferedReader br = new BufferedReader(fr);

            // Se lee linea por linea el archivo
            String linea;
            linea = br.readLine();
            while( linea != null){
                System.out.println(linea);
                linea = br.readLine();
            }

            // Se cierra el lector del archivo
            fr.close();


        }catch(FileNotFoundException e){
            System.err.println("ArchivoText: " + e);
        }catch(IOException e){
            System.err.println("ArchivoText: " + e);
        }
    }

    public void escribir(String name1, String name2){
        try{
            // Se crea y se abre un fichero.
            inputFile = new File(name1);
            outputFile = new File(name2);

            // Se crea un lector del archivo y un buffer
            // que contendrá el texto del archivo
            FileReader fr = new FileReader(inputFile);
            BufferedReader br = new BufferedReader(fr);

            // Se crea un escritor para poder plazmarlo
            // en el archivo nuevo
            FileWriter fw = new FileWriter(outputFile);
            PrintWriter pw = new PrintWriter(fw);

            // Se lee linea por linea el archivo
            String linea;
            linea = br.readLine();
            while( linea != null){
                pw.println(linea);
                linea = br.readLine();
            }

            // Se cierra el lector y el escritor del archivo
            fr.close();
            fw.close();
        }catch(FileNotFoundException e){
            System.err.println("ArchivoText: " + e);
        }catch(IOException e){
            System.err.println("ArchivoText: " + e);
        }
    }

    public void editar(String name){
        // se crea escaner para leer linea en la consola
        Scanner sc = new Scanner(System.in);
        try{
            // Se crea y se abre un fichero.
            outputFile = new File(name);

            // Se crea un escritor para poder plazmarlo
            // en el archivo nuevo
            FileWriter fw = new FileWriter(outputFile,true);
            PrintWriter pw = new PrintWriter(fw);

            // Se lee pide una linea para poder agregar al archivo
            System.out.println("Por favor, ingrese una frase:");
            String linea = sc.nextLine();
            pw.println(linea);

            // Se cierra el lector y el escritor del archivo
            fw.close();
        }catch(FileNotFoundException e){
            System.err.println("ArchivoText: " + e);
        }catch(IOException e){
            System.err.println("ArchivoText: " + e);
        }
    }

    public static void main(String[] args) {
        ArchivoTest at = new ArchivoTest();
        int opc = Integer.parseInt(args[0]);

        switch (opc) {
            case 1:
                at.leer(args[1]);    
            break;
            case 2:
                at.escribir(args[1], args[2]);
            break;
            case 3:
                at.editar(args[1]);
            break;       
            default:
                System.out.println("Opcion no encontrada");
            break;
        }
        System.out.println("\nTarea realizada");
    }
}