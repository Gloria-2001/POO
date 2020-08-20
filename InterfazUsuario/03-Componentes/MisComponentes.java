import javax.swing.*;
import java.awt.*;

public class MisComponentes extends JFrame{

    private JLabel etiqueta;
    private JTextField texto;
    private JButton boton;
    private Container cp;

    public MisComponentes(String title){
        super(title);
        this.setSize(450,450);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.cp = getContentPane();
        this.cp.setLayout(new FlowLayout());

        this.etiqueta = new JLabel("Nombre");
        this.texto = new JTextField(20);
        this.boton = new JButton("Aceptar");
    }

    public void init(){
        this.cp.add(this.etiqueta);
        this.cp.add(this.texto);
        this.cp.add(this.boton);
    }

    public void run(){
        this.setVisible(true);
    }

    public static void main(String[] args) {
        MisComponentes ventana = new MisComponentes("Bienvenido");
        ventana.init();
        ventana.run();
    }

}