import java.util.*;

public class Principal {
    public static void main(String[] args) {
        // Palabras pa = new Palabras();
        // Usuario us00 = new Usuario("Neo", pa);
        // Usuario us01 = new Usuario("Romeo", pa);
        // Usuario us02 = new Usuario("Oliva", pa);

        // us00.start();
        // us01.start();
        // us02.start();

        Restaurante res = new Restaurante();
        ArrayList<Comensal> comensales = new ArrayList<Comensal>();
        for(int i=0; i<10; i++){
            comensales.add(new Comensal(String.valueOf(i+1),res));
        }
        for(Comensal comen : comensales){
            comen.start();
        }
    }
}
