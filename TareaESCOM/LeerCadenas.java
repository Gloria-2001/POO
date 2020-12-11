import java.util.Scanner;
import java.util.ArrayList;

public class LeerCadenas{

    private String enunciado;   // Cadena entrante
    private String[] palabras;  // Palabras por separado
    private ArrayList<Integer> numLetrasPalabra;    // Numero de letras por palabra
    private int numPalabras;    // Numero de palabras
    
    public LeerCadenas(String cadena){
        this.enunciado = cadena;    // Se tiene la cadena guardada por si se requiere
        this.palabras = cadena.split(" ");  // Se separa la cadena entre espacios y se guarda en un arreglo
        this.numPalabras = this.palabras.length;    // Se cuentan el número de palabras
        this.numLetrasPalabra = new ArrayList<Integer>();
        for (String p : palabras) {     // Para cada palabra, se guarda su longitud
            this.numLetrasPalabra.add(p.length());
        }
    }

    public int numPalabras(){   // Se devuelve el numero de palabras
        return numPalabras;
    }

    public String getEnunciado(){
        return this.enunciado;  // Se devuelve el enunciado
    }

    public String palabraLarga(){
        // Se obtienen los datos de la primer palabra
        String aux = palabras[0];
        Integer mayor = numLetrasPalabra.get(0);    // Variable auxiliar para longitud mayor
        for(int i=0; i<this.numPalabras; i++){  // Se recorre todo el arreglo
            Integer aux00 = this.numLetrasPalabra.get(i);
            if(aux00 > mayor){  // Si la longitud de la palabra actual es mayor a la variable auxiliar
                aux = this.palabras[i]; // Guardo esa palabra
                mayor = aux00;  // Se guarda como el nuevo numero mayor a superar
            }
        }
        return aux;
    }

    public String palabraCorta(){
        // Se obtienen los datos de la primer palabra
        String aux = palabras[0];
        Integer menor = numLetrasPalabra.get(0);    // Variable auxiliar para longitud menor
        for(int i=0; i<this.numPalabras; i++){  // Se recorre todo el arreglo
            Integer aux00 = this.numLetrasPalabra.get(i);
            if(aux00 < menor){  // Si la longitud de la palabra actual es menor a la variable auxiliar
                aux = this.palabras[i]; // Guardo esa palabra
                menor = aux00;  // Se guarda como el nuevo numero menor a superar
            }
        }
        return aux;
    }

    public void printFrecuencia(int l){
        int numVeces = 0;   // Variable auxiliar para guardar las repeticiones de longitud
        for (Integer frec : numLetrasPalabra) { // Para cada elemento del arreglo
            if(frec == l){  // Si dicha longitud es mayor a la longitud a contar
                numVeces++; // Aumentamos el contador de repeticiones
            }
        }
        System.out.print(l+"\t\t"); // Se imprime la longitud 
        for(int i=0; i<numVeces-1; i++){
            /*
                Se imprimen asteriscos las veces que se repite 
                dicha longitud en la cadena
            */
            System.out.print("*");
        }
        System.out.println("*");
    }

    public void getFrecuencia(){
        ArrayList<Integer> aux = new ArrayList<Integer>();
        for (Integer longitud : numLetrasPalabra) { // Para cada longitud en el arreglo
            if(numLetrasPalabra.contains(longitud) && !aux.contains(longitud)){
                /*
                    Si dicha longitud está en el arreglo numLetrasPalabras y ademas
                    está en el arreglo auxiliar, entonces se imprime su frecuencia
                    y se agrega al arreglo auxiliar, si no se cumple, seguimos con
                    el siguiente elemento de numLetrasPalabra
                */
                this.printFrecuencia(longitud);
                aux.add(longitud);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una cadena: ");
        String cadena = sc.nextLine();
        
        LeerCadenas lc = new LeerCadenas(cadena);

        System.out.println("\nNumero de palabras: "+lc.numPalabras());
        System.out.println("La palabra mas larga es: "+lc.palabraLarga());
        System.out.println("La palabra mas corta es: "+lc.palabraCorta());
        System.out.println("Longitud\tFrecuencia");
        lc.getFrecuencia();
    }
}