public class Persona{
    // Atributos
    public String nombre;
    public String apellidos;
    public int edad;
    public char sexo;
    public float peso;

    // Constructor
    public Persona(String nombre,String apellidos,int edad,char sexo,float peso){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
    }

    // Metodos
    public void caminar(){
        System.out.println("Estoy caminando");
    }

    public void dormir(){
        System.out.println("zzz");
    }

    public void hablar(){
        System.out.println("Hola, yo soy "+this.nombre);
    }

    // Programa principal
    public static void main(String[] args){
        // Instancia de la clase
        Persona p00 = new Persona("Gloria","Olivares",56,'f',105);
        p00.hablar();
        p00.caminar();
        p00.dormir();
    }
}