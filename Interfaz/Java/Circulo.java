public class Circulo implements Figura{
    private double radio;

    public Circulo(double r){
        this.radio = r;
    }

    @Override
    public double area(){
        return Math.PI * Math.pow(this.radio,2);
    }

    @Override
    public double perimetro(){
        return Math.PI * 2 * this.radio;
    }

}