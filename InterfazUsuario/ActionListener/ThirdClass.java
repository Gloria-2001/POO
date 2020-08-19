import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ThirdClass extends JFrame implements ActionListener{
    private JButton boton;
    private Container cp;

    public ThirdClass(String title){
        super(title);
        this.setSize(350,250);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.cp = getContentPane();
        this.cp.setLayout(new FlowLayout());
        this.boton = new JButton("Aceptar");

        this.init();
    }

    private void init(){
        this.cp.add(this.boton);
        this.boton.addActionListener(this);
    }

    public void run(){
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        System.out.println("Boton pulsado");
    }

    public static void main(String[] args) {
        ThirdClass ventana = new ThirdClass("Bienvenido");
        ventana.run();
    }
}