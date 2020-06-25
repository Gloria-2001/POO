import java.util.Scanner;
public class tablasDeMultiplicar{
    public static void main(String[] args){
        int limit, num, prod;
        Scanner sc = new Scanner(System.in); 
        System.out.println("Este programa le ayuda a realizar tablas de multiplicar");
        System.out.println("Inserte el numero para el que quiera realizar la tabla");
        num=sc.nextInt();
        System.out.println("Inserte el limite para la tabla");
        limit=sc.nextInt();
        for(int i=0;i<=limit;i=i+1){
            prod=i*num;
            System.out.println(""+i+" x "+num+" = "+prod);
        }
        if(num%2==0){
            System.out.println("El producto es par");
        }else{
            System.out.println("El producto es impar");
        }
    }
}