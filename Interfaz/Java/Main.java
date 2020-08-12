public class Main{
    public static void main(String[] args) {
        Rectangulo fig00 = new Rectangulo(12.5,5.78);
        Circulo fig01 = new Circulo(13.5987);

        System.out.println("Perimetro del rectangulo: "+fig00.perimetro()+" u");
        System.out.println("Area del rectangulo: "+fig00.area()+" u2");

        System.out.println("Perimetro del circulo: "+fig01.perimetro()+" u");
        System.out.println("Area del circulo: "+fig01.area()+" u2");
    }
}