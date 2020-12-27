import java.util.concurrent.Semaphore;
import java.lang.Thread.*;

public class Restaurante{
    private Semaphore guardia = new Semaphore(6, true);

    public void comer(String number) throws InterruptedException{
        guardia.acquire();  // Pregunta y obten el recurso
        // Haces todo el trabajo
        System.out.println("Comensal "+ number +" comiendo");
        Thread.sleep((int) (Math.random() * 2000));
        System.out.println("Comensal "+ number +" saliendo");
        guardia.release();  // Libera el recurso
    }
}