import javax.swing.*;
import java.awt.*;

public class FirstClass extends JFrame{

    private JButton boton;
    private Container cp;

    public FirstClass(String title){
        super(title);
        this.setSize(300,350);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.cp = getContentPane();
        this.cp.setLayout(new FlowLayout());
        this.boton = new JButton("Aceptar");

        this.init();
    }

    private void init(){
        this.cp.add(this.boton);
        // Escucha es = new Escucha();
        /*
            El metodo addActionListener recibe un objeto que 
            tiene implementada la interfaz de ActionListener
        */
        this.boton.addActionListener(new Escucha());
    }

    public void run(){
        this.setVisible(true);
    }

    public static void main(String[] args) {
        FirstClass ventana = new FirstClass("Bienvenido");
        ventana.run();
    }
}