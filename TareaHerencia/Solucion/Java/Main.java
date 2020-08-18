public class Main{
    public static void main(String[] args){
        Superheroe sp00 = new Superheroe("Peter Parker",30,"Spiderman","Sentido aracnido");
        Villano v00 = new Villano("Anthony Masters",50,"Taskmaster","Copiar movimientos");

        sp00.presentacion();
        sp00.revelarNombre();
        v00.presentacion();
        v00.revelarNombre();
        //System.out.println(sp00.revelarNombre());
        //System.out.println(v00.getNombre());
    }
}