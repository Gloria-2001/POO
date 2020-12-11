import java.util.*;

public class Racional{
    private int num;
    private int den;

    public Racional(){
        num = 1;
        den = 1;
    }

    public Racional(int n, int d){
        num = n;
        den = d;
    }

    public String toString(){
        return num+"/"+den;
    }

    public Double toDouble(){
        return (Double.valueOf(num) / Double.valueOf(den));
    }

    public static void main(String[] args) {
        ArrayList<Racional> lista = new ArrayList<Racional>();
        lista.add(new Racional(2,6));
        lista.add(new Racional(3,4));
        lista.add(new Racional(4,8));
        lista.add(new Racional(9,18));
        lista.add(new Racional(1,7));

        Comparator<Racional> compareByValue = new Comparator<Racional>(){
            @Override
            public int compare(Racional r1, Racional r2) {
                return r1.toDouble().compareTo(r2.toDouble());
            }
        };

        // Comparator<Racional> compareByValue = (Racional r1, Racional r2) -> r1.toDouble().compareTo(r2.toDouble());

        System.out.println("Antes de ordenar:");
        for(Racional i : lista){
            System.out.print(i.toString()+", ");
        }

        Collections.sort(lista,compareByValue);

        System.out.println("\nDespues de ordenar:");
        for(Racional i : lista){
            System.out.print(i.toString()+", ");
        }
    }
}