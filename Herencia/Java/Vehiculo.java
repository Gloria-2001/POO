public class Vehiculo{
    public int llantas;
    public boolean estado;
    public int puertas;
    public String asientos;
    public double largo;

    public Vehiculo(){
        this.llantas = 4;
        this.estado = false;
        this.puertas = 4;
        this.asientos = "Piel";
        this.largo = 1.20;
    }

    public void encender(){
        this.estado = true;
    }

    public void apagar(){
        this.estado = false;
    }

    public boolean getEstado(){
        return this.estado;
    }

    public void sonar(){
        System.out.println("pi-pi");
    }
}