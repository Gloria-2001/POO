import java.lang.Thread.*;

public class Comensal extends Thread{

    private Restaurante resta;

    public Comensal(String msg, Restaurante resta){
        super(msg); // Nombre
        this.resta = resta;
    }

    @Override
    public void run(){
        try {
            resta.comer(getName());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}