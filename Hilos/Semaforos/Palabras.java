import java.util.concurrent.Semaphore;
import java.util.Scanner;

public class Palabras{
    private Semaphore darPaso = new Semaphore(1, true);
    private Scanner sc = new Scanner(System.in);

    public boolean ingresarPalabra(String name) throws InterruptedException{
        darPaso.acquire();
        boolean con = true;
        System.out.println("Tu turno "+name);
        System.out.print("Ingresa una palabra: ");
        String word = sc.nextLine();
        if(word.equals("exit")){
            System.out.println("Adios "+name+"\n");
            con = false;
        }else{
            System.out.println("Palabra: "+word+"\nEspera tu siguiente turno "+name+"\n");
        }
        darPaso.release();
        return con;
    }
}