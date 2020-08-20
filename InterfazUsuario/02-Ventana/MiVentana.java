import javax.swing.*;

/*
    Opciones de setDefaultCloseOperation():
        JFrame.EXIT_ON_CLOSE: Abandona aplicación.
        JFrame.DISPOSE_ON_CLOSE: Libera los recursos asociados a la ventana.
        JFrame.DO_NOTHING_ON_CLOSE: No hace nada.
        JFrame.HIDE_ON_CLOSE: Cierra la ventana, sin liberar sus recursos.
*/

public class MiVentana extends JFrame{

    public MiVentana(String title){
        super(title);
        this.setSize(450,450);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void run(){
        this.setVisible(true);
    }

    public static void main(String[] args) {
        MiVentana v = new MiVentana("Hola mundo");
        v.run();
    }
    // public static void main(String[] args) {
    //     JFrame f = new JFrame("Hola mundo");
    //     f.setSize(450,450);
    //     f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //     f.setVisible(true);
    // }
}