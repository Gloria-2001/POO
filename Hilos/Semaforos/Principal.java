import java.util.*;

public class Principal {
    public int obtenerPresupuestoAleatorio(){
       Random r = new Random();
       int aleatorio = -1;
       Set<Integer> generados = new HashSet<>();
        for (int i = 1; i <= 100; i++) {          
            boolean generado = false;
            while (!generado) {
                int posible = r.nextInt(6000)+1;
                if (!generados.contains(posible)) {
                    generados.add(posible);
                    aleatorio = posible;
                    generado = true;
                }
            }
            //usa el valor de aleatorio...
        }
        return aleatorio; 
    }
    
    public static void main(String[] args) {
        // Palabras pa = new Palabras();
        // Usuario us00 = new Usuario("Neo", pa);
        // Usuario us01 = new Usuario("Romeo", pa);
        // Usuario us02 = new Usuario("Oliva", pa);

        // us00.start();
        // us01.start();
        // us02.start();

        /*
        Restaurante res = new Restaurante();
        ArrayList<Comensal> comensales = new ArrayList<Comensal>();
        for(int i=0; i<10; i++){
            comensales.add(new Comensal(String.valueOf(i+1),res));
        }
        for(Comensal comen : comensales){
            comen.start();
        }
        */

        Bar bar=new Bar();
        Principal p = new Principal();       

        ArrayList<Cliente> clientes = new ArrayList<Cliente>();

        for(int i=0; i<30; i++){
            clientes.add(new Cliente(String.valueOf(i+1),p.obtenerPresupuestoAleatorio(),bar));
        }

        for(Cliente client : clientes){
            client.start(); 
        }
    }
}
