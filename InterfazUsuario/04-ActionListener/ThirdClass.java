import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ThirdClass extends JFrame implements ActionListener{
    private JButton aceptar;
    private JButton cancelar;
    private JButton no;
    private Container cp;

    public ThirdClass(String title){
        super(title);
        this.setSize(350,250);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.cp = getContentPane();
        this.cp.setLayout(new FlowLayout());
        this.aceptar = new JButton("Aceptar");
        this.cancelar = new JButton("Cancelar");
        this.no = new JButton("No");
        this.no.setActionCommand("Cancelar");

        this.init();
    }

    private void init(){
        this.cp.add(this.aceptar);
        this.cp.add(this.cancelar);
        this.cp.add(this.no);
        this.aceptar.addActionListener(this);
        this.cancelar.addActionListener(this);
        this.no.addActionListener(this);
    }

    public void run(){
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        // e.getSource() se compara con la instancia de la clase
        if(e.getActionCommand() == "Cancelar"){
            System.out.println("Cancelar");
        }else{
            System.out.println("Aceptar");
        }
        //System.out.println("Boton pulsado");
    }

    public static void main(String[] args) {
        ThirdClass ventana = new ThirdClass("Bienvenido");
        ventana.run();
    }
}