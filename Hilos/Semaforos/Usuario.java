import java.lang.Thread.*;

public class Usuario extends Thread{

    private Palabras pp;
    private boolean conti = true;

    public Usuario(String msg, Palabras pp){
        super(msg); // Nombre
        this.pp = pp;
    }

    @Override
    public void run(){
        while(conti){
            try {
                conti = pp.ingresarPalabra(getName());
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}