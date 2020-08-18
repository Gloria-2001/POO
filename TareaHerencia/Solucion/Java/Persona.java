public class Persona{
    private String nombre;
    private int edad;
    
    public Persona(String name, int age){
        this.nombre = name;
        this.edad = age;
    }

    public String darNombre(){
        return this.nombre;
    }
}