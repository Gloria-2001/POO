public class FraccionesPOO{
    // Atributos
    public int numerador;
    public int denominador;
    
    // Constructor
    public FraccionesPOO(int numerador, int denominador){
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public void initFraccion(int num, int den){
        this.numerador = num;
        this.denominador = den;
    }

    // Metodos
    public FraccionesPOO suma(FraccionesPOO A){
        FraccionesPOO aux = new FraccionesPOO(1,1);
        int dem = this.denominador * A.denominador;
        int num = (this.numerador*A.denominador) + (this.denominador*A.numerador);
        aux.initFraccion(num,dem);

        return aux;
    }

    public FraccionesPOO resta(FraccionesPOO A){
        int dem = this.denominador * A.denominador;
        int num = (this.numerador*A.denominador) - (this.denominador*A.numerador);

        return (new FraccionesPOO(num,dem));
    }

    public void imprimir(){
        System.out.print(this.numerador);
        System.out.print("/");
        System.out.println(this.denominador);
    }

    // Programa principal
    public static void main(String[] args){
        FraccionesPOO frac01 = new FraccionesPOO(4,5);
        FraccionesPOO frac02 = new FraccionesPOO(3,8);
        FraccionesPOO aux00;

        System.out.print("4/5 + 3/8 = ");
        aux00 = frac01.suma(frac02);
        aux00.imprimir();
        System.out.print("4/5 - 3/8 = ");
        aux00 = frac01.resta(frac02);
        aux00.imprimir();
        
        System.out.println();

        System.out.print("3/8 + 4/5 = ");
        frac02.suma(frac01).imprimir();
        System.out.print("3/8 - 4/5 = ");
        frac02.resta(frac01).imprimir();
    }
}