public class Triangulo implements Figura{
    public double base;
    public double altura;

    Triangulo(double b, double a){
        this.base = b;
        this.altura = a;
    }

    @Override
    public double area(){
        return (this.base * this.altura) / 2;
    }

    @Override
    public double perimetro(){
        return 3 * this.base;
    }
}