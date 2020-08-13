public class Rectangulo implements Figura{
    private double base;
    private double altura;

    Rectangulo(double b, double a){
        this.base = b;
        this.altura = a;
    }

    @Override
    public double area(){
        return this.base * this.altura;
    }

    @Override
    public double perimetro(){
        return (this.base * 2) + (this.altura * 2);
    }

}