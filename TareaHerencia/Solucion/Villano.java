public class Villano extends Persona{
    public String nickname;
    public String poder;
    public double nivel;

    public Villano(String name, int age, String nick, String power, double level){
        super(name,age);
        this.nickname = nick;
        this.poder = power;
        this.nivel = level;
    }
}