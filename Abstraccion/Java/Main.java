public class Main{
    public static void main(String[] args) {
        Domestico perro = new Domestico("Mavros");
        Silvestre oso = new Silvestre();

        System.out.println("Mascota");
        perro.hablar();
        perro.caminar();
        perro.comer();

        System.out.println("\nSilvestre");
        oso.caminar();
        oso.comer();

        System.out.println(perro.patas+" - "+oso.patas);
    }
}