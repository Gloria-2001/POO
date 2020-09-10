import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;

public class GaleriaGO extends JFrame implements ActionListener{ 
    
    public JButton boton;
    public JButton boton1;
    private Container cp;
    public JLabel total;
    public JLabel actual; 
  
    public GaleriaGO(String title){
        super(title);
        this.setSize(450,350);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        this.cp = getContentPane();
        this.boton = new RoundButton(">",Color.lightGray); 
        this.boton1 = new RoundButton("<",Color.lightGray);

        this.total = new JLabel("15");
        this.actual = new JLabel("1");

        init();
    }

    private void init(){
            JPanel aux=createPanelNumeros();
            createPanelBotones(aux);
            createPanelImagen(aux);
            this.boton.addActionListener(this);
            this.boton1.addActionListener(this);
    }

    private JPanel createPanelNumeros(){
        JPanel panelNumero = new JPanel();
        panelNumero.setLayout(new FlowLayout());
        panelNumero.add(actual); panelNumero.add(new JLabel("/"));
        panelNumero.add(total);
        cp.add(panelNumero, BorderLayout.SOUTH);
        return panelNumero;
    } 
    
    private void createPanelBotones(JPanel p){ 
        JPanel panel = new JPanel();
        GridLayout gl = new GridLayout(3,3); 
        panel.setLayout(gl);
        panel.setLayout(new FlowLayout());
        panel.add(boton1);
        panel.add(boton);
        cp.add(panel, BorderLayout.WEST); 
    }

    private JPanel createPanelImagen(JPanel p){
        JPanel panel = new JPanel();
        ImageIcon imagen = new ImageIcon("img/pic1.jpg");
        JLabel et = new JLabel(imagen);
        panel.add(et);
        cp.add(panel, BorderLayout.CENTER);
        return panel;
    }

    @Override
    public void actionPerformed(ActionEvent e){          
        int num=1;
        if(e.getActionCommand() == ">"){
            actual.getText();
            while(num<=15){
                actual.setText(""+num);
                num=num+1;
            }
        }else{
                System.out.println("hola");
            }
    }
    
    public void run(){
        this.setVisible(true);
    }

    public static void main(String[] args) {
        GaleriaGO g = new GaleriaGO("Galeria");
        g.run();
    }
}