import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CheckBox00 extends JFrame implements ActionListener{
    
    private JCheckBox perro, gato, huron;
    private JTextArea texto;
    private JPanel panelPrin;
    private Container cp;

    public CheckBox00(){
        super("Check Box");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        cp = getContentPane();
        panelPrin = new JPanel();
        panelPrin.setLayout(new GridLayout(1,2));

        perro = new JCheckBox("perro");
        gato = new JCheckBox("gato");
        huron = new JCheckBox("huron");
        texto = new JTextArea();

        init();
    }

    private void init(){
        crearPanelCheck();
        panelPrin.add(texto);
        cp.add(panelPrin,BorderLayout.CENTER);
    }

    private void crearPanelCheck(){
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(3,1));

        p.add(perro);
        p.add(gato);
        p.add(huron);        

        perro.addActionListener(this);
        gato.addActionListener(this);
        huron.addActionListener(this);

        panelPrin.add(p);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        String aux = "";
        
        if(perro.isSelected()){
            aux += "perro\n";
        }

        if(gato.isSelected()){
            aux += "gato\n";
        }

        if(huron.isSelected()){
            aux += "huron\n";
        }

        texto.setText(aux);
    }

    public void run(){
        setVisible(true);
    }
    
    public static void main(String[] args) {
        CheckBox00 cb = new CheckBox00();
        cb.run();
    }
}