import java.util.concurrent.Semaphore;
import java.lang.Thread.*;

public class Bar{
    private Semaphore guardia00 = new Semaphore(15, true);
    private Semaphore guardia01 = new Semaphore(5, true);

    public void pasarBar(String number) throws InterruptedException{
        guardia00.acquire();  // Pregunta y obten el recurso
        // Haces todo el trabajo
        System.out.println("Cliente "+ number +" pasando al bar");
        Thread.sleep((int) (Math.random() * 1000));
        System.out.println("Cliente "+ number +" ordenando");
        Thread.sleep((int) (Math.random() * 2000));
        System.out.println("Cliente "+ number +" bebiendo");
        Thread.sleep((int) (Math.random() * 3000));
        System.out.println("Cliente "+ number +" saliendo");
        guardia00.release();  // Libera el recurso
    }

    public void pasarZonaVIP(String number, int budget) throws InterruptedException{
        guardia01.acquire();
        System.out.println("Cliente "+ number +" con "+ budget +" de presupuesto, pasando a la zona VIP del bar");
        Thread.sleep((int) (Math.random() * 1000));
        System.out.println("Cliente "+ number +" con "+ budget +" de presupuesto, ordenando en la zona VIP");
        Thread.sleep((int) (Math.random() * 2000));
        System.out.println("Cliente "+ number +" con "+ budget +" de presupuesto, bebiendo en la zona VIP");
        Thread.sleep((int) (Math.random() * 3000));
        System.out.println("Cliente "+ number +" con "+ budget +" de presupuesto, saliendo de la zona VIP");
        System.out.println("Cliente "+ number +" con "+ budget +" de presupuesto, saliendo del bar");
        guardia01.release();
    }
}