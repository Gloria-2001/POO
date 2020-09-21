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
    public JLabel etiqueta;
    public int cont=0;
  
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
            createPanelNumeros();
            createPanelBotones();
            createPanelImagen();
            this.boton.addActionListener(this);
            this.boton1.addActionListener(this);
    }

    private void createPanelNumeros(){
        JPanel panelNumero = new JPanel();
        panelNumero.setLayout(new FlowLayout());
        panelNumero.add(actual); panelNumero.add(new JLabel("/"));
        panelNumero.add(total);
        cp.add(panelNumero, BorderLayout.SOUTH);
    } 
    
    private void createPanelBotones(){ 
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(boton1);
        panel.add(boton);
        cp.add(panel, BorderLayout.WEST); 
    }

    private void createPanelImagen(){
        JPanel panel = new JPanel();
        ImageIcon imagen = new ImageIcon("img/pic1.jpg");
        etiqueta = new JLabel(imagen);
        panel.add(etiqueta);
        cp.add(panel, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e){          
        String cad;

        if(e.getSource() == boton && cont<=15){
            actual.getText();
            cad = String.valueOf(cont);
            etiqueta.setIcon(new ImageIcon("img/pic"+cad+".jpg"));
            actual.setText(""+cont);
            cont++;
        }else if(e.getSource() == boton1 && cont>1){
            cont--;
            actual.getText();
            cad = String.valueOf(cont);
            etiqueta.setIcon(new ImageIcon("img/pic"+cad+".jpg"));
            actual.setText(""+cont);
        }if(cont==16){
            cont=1;
        }if(cont==0){
            cont=15;
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