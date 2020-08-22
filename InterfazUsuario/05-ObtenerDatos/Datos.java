import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Datos extends JFrame implements ActionListener{

    private JLabel etiqueta;
    private JTextField texto;
    private JButton boton;
    private Container cp;

    public Datos(String title){
        super(title);
        this.setSize(350,200);
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
        boton.addActionListener(this);
    }

    public void run(){
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == boton){
            showDialog();
        }
    }

    private void showDialog(){
        String name =  texto.getText();
        JOptionPane.showMessageDialog(null, "Hola " + name, "Bienvenido", JOptionPane.INFORMATION_MESSAGE);
        texto.setText("");
    }

    public static void main(String[] args) {
        Datos ventana = new Datos("Bienvenido");
        ventana.init();
        ventana.run();
    }

}