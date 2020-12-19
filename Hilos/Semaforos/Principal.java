public class Principal {
    public static void main(String[] args) {
        Palabras pa = new Palabras();
        Usuario us00 = new Usuario("Neo", pa);
        Usuario us01 = new Usuario("Romeo", pa);

        us00.start();
        us01.start();
    }
}
