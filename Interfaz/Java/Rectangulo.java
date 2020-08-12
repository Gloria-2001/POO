public class Rectangulo{
    private double base;
    private double altura;

    Rectangulo(double b, double a){
        this.base = b;
        this. altura = a;
    }

    public double area(){
        return this.base * this.altura;
    }

    public double perimetro(){
        return (this.base * 2) + (this.altura * 2);
    }

}