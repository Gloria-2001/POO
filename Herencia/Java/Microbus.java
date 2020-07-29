public class Microbus extends Vehiculo{
    public boolean timbre;

    public Microbus(){
        super();
        this.largo = 3;
        this.asientos = "Tela de modatelas";
        this.timbre = false;
    }

    public void sonar(){
        System.out.println("La cucaracha, la cucaracha");
    }

    public void gritar(){
        System.out.println("Subale, hay lugares");
    }

    public void tocarTimbre(){
        this.timbre = !this.timbre;
    }
}