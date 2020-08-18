public class Villano extends Persona{
    public String nickname;
    public String poder;

    public Villano(String name, int age, String nick, String power){
        super(name,age);
        this.nickname = nick;
        this.poder = power;
    }

    public void presentacion(){
        System.out.println("Hola soy " + this.nickname + " y mi poder es " + this.poder);
    }

    public void revelarNombre(){
        System.out.println("Mi verdadero nombre es " + this.darNombre());
    }
}