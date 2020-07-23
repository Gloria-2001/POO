public class Seconds{
    // Atributos
    public float seg;
    public int min;
    public int hrs;
    public int dia;

    // Constructor 1
    public Seconds(int min){
        this.min = min;
        this.hrs = 0;
        this.dia = 0;
        this.seg = 0;
    }

    // Constructor 2
    public Seconds(int hrs, int min){
        this.min = min;
        this.hrs = hrs;
        this.dia = 0;
        this.seg = 0;
    }

    // Constructor 3
    public Seconds(int dia, int hrs, int min){
        this.min = min;
        this.hrs = hrs;
        this.dia = dia;
        this.seg = 0;
    }

    // Metodos
    public void convert(){
        this.seg = this.min*60;
        this.seg += this.hrs*3600;
        this.seg += this.dia*3600*24;
    }
}