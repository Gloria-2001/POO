import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SecondClass extends JFrame{

    private JButton boton;
    private Container cp;

    public SecondClass(String title){
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
        this.boton.addActionListener(new MiEscucha());
    }

    public void run(){
        this.setVisible(true);
    }

    public class MiEscucha implements ActionListener{

        public MiEscucha(){};

        @Override
        public void actionPerformed(ActionEvent e){
            System.out.println("Boton pulsado");
        }

    }

    public static void main(String[] args) {
        SecondClass ventana = new SecondClass("Bienvenido");
        ventana.run();
    }
}