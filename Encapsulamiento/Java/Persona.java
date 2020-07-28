public class Persona{
    private String curp;
    public String nombre;
    public String apellido;
    public int edad;

    public Persona(String name, String last, int age, String cc){
        this.nombre = name;
        this.apellido = last;
        this.edad = age;
        this.curp = cc;
    }

    public void caminar(){
        System.out.println("Estoy caminando");
    }

    public void dormir(){
        System.out.println("zzz");
    }

    public void hablar(){
        System.out.println("Hola, yo soy "+this.nombre);
    }

    String getCURP(){   // getter
        return curp;
    }
    
    void setCURP(String newCurp){   // setter
        this.curp = newCurp;
    }
}