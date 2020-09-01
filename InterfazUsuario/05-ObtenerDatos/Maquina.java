import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Maquina extends JFrame implements ActionListener{
    
    private JButton perro;
    private JButton gato;
    private JButton huron;
    private Container cp;
    private JLabel animal;

    public Maquina(){
        super("Maquina");
        setSize(600,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        cp = getContentPane();
        cp.setLayout(new FlowLayout());

        perro = new JButton("");
        gato = new JButton("");
        huron = new JButton("");
        animal = new JLabel("______________________");

        init();
    }

    private void init(){
        perro.setIcon(new ImageIcon("../img/perro.jpg"));
        perro.addActionListener(this);
        cp.add(perro);

        gato.setIcon(new ImageIcon("../img/gato.jpg"));
        gato.addActionListener(this);
        cp.add(gato);

        huron.setIcon(new ImageIcon("../img/huron.jpg"));
        huron.addActionListener(this);
        cp.add(huron);

        cp.add(animal);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        ImageIcon aux;
        animal.setText("");
        if(e.getSource() == perro){
            aux = new ImageIcon("../img/perro.jpg");
        }else if(e.getSource() == gato){
            aux = new ImageIcon("../img/gato.jpg");
        }else{
            aux = new ImageIcon("../img/huron.jpg");
        }
        animal.setIcon(aux);
    }

    public void run(){
        setVisible(true);
    }
    
    public static void main(String[] args) {
        Maquina m = new Maquina();
        m.run();
    }   
}