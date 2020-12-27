import java.lang.Thread.*;

public class Hilos extends Thread{
    
    public Hilos(String msg){
        super(msg); // Nombre
    }

    // Metodo para correr una tarea del Thread
    @Override
    public void run(){
        for(int i = 0; i<5; i++){
            try {
                System.out.println(getName() + " " + i);
                sleep((int) (Math.random() * 200));
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
        try {
            uno.start();    dos.start();
            uno.join();     dos.join();
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Main cerrado");
    }
}