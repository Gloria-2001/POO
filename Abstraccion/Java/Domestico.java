public class Domestico extends Animal{
    public String nombre;
    
    public Domestico(String nombre){
        this.nombre = nombre;
    }

    public void hablar(){
        System.out.println("Hola, soy " + this.nombre);
    }

    @Override
    public void comer(){
        System.out.println("Estoy comiendo croquetas");
    }
}