import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Panel extends JFrame{

    private Container cp;
    private JTextField dia;
    private JTextField mes;
    private JTextField year;
    private JTextField nombre;
    private JTextField DNI;
    private JButton aceptar;
    private JButton cancelar;

    public Panel(String title){
        super(title);
        setSize(400,170);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        cp = getContentPane();
        dia =  new JTextField(2);
        mes =  new JTextField(2);
        year =  new JTextField(2);
        nombre =  new JTextField(10);
        DNI = new JTextField(10);
        aceptar = new JButton("Aceptar");
        cancelar = new JButton("Cancelar");

        init();
    }

    private void init(){
        JPanel aux = createPanelFecha();
        crearPanelDatos(aux);
        crearPanelBotones();
    }

    private JPanel createPanelFecha(){
        JPanel panelFecha = new JPanel();
        panelFecha.setLayout(new FlowLayout());
        panelFecha.add(dia);    panelFecha.add(new JLabel("/"));
        panelFecha.add(mes);    panelFecha.add(new JLabel("/"));
        panelFecha.add(year);
        return panelFecha;
    }

    private void crearPanelDatos(JPanel panel){
        JPanel panelDatos = new JPanel();
        GridLayout gl = new GridLayout(3,2,0,5);
        panelDatos.setLayout(gl);
        
        panelDatos.add(new JLabel("Nombre:"));
        panelDatos.add(nombre);

        panelDatos.add(new JLabel("DNI:"));
        panelDatos.add(DNI);

        panelDatos.add(new JLabel("Fecha de Nacimiento"));
        panelDatos.add(panel);

        cp.add(panelDatos, BorderLayout.CENTER);
    }

    private void crearPanelBotones(){
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new FlowLayout());
        panelBotones.add(aceptar);
        panelBotones.add(cancelar);
        cp.add(panelBotones,BorderLayout.SOUTH);
    }

    public void run(){
        setVisible(true);
    }

    public static void main(String[] args) {
        Panel p = new Panel("Formulario");
        p.run();
    }
}