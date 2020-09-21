import java.lang.Thread.*;

public class Hilos extends Thread{
    
    public Hilos(String msg){
        super(msg); // Nombre
    }

    // Metodo para correr una tarea del Thread
    public void run(){
        for(int i =0; i<10; i++){
            System.out.println(getName() + " " + i);
            try {
                sleep((long) 1);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        System.out.println("Fin de " + getName());
    }
    
    public static void main(String[] args) {
        Hilos uno = new Hilos("cat");  // Creamos un hilo con un nombre
        Hilos dos = new Hilos("dog");

        System.out.println("Main corriendo");

        uno.run();    dos.run();

        System.out.println("Main cerrado");
    }
}