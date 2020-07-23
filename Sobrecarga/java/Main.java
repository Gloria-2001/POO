public class Main{
    public static void main(String[] args){
        Seconds s00 = new Seconds(20);
        Seconds s01 = new Seconds(15,13);
        Seconds s02 = new Seconds(6,7,55);

        s00.convert();
        s01.convert();
        s02.convert();

        System.out.println(s00.seg);
        System.out.println(s01.seg);
        System.out.println(s02.seg);
    }
}