import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MaquinaArray extends JFrame implements ActionListener{

    private JButton animales[];
    private JLabel animal;
    private Container cp;
    private String []img = {
        "perro.jpg",
        "gato.jpg",
        "huron.jpg"
    };

    public MaquinaArray(){
        super("Maquina Array");
        setSize(600,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        cp = getContentPane();
        cp.setLayout(new FlowLayout());
        
        animales = new JButton[3];
        animal = new JLabel("______________");

        init();
    }

    private void init(){
        for(int i=0; i<3; i++){
            JButton aux = new JButton();
            aux.setIcon(new ImageIcon("../img/"+img[i]));
            aux.addActionListener(this);
            cp.add(aux);
            animales[i] = aux;
        }

        cp.add(animal);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        ImageIcon aux;
        for(int i=0; i<3; i++){
            if(e.getSource() == animales[i]){
                aux = new ImageIcon("../img/"+img[i]);
                animal.setIcon(aux);
                break;
            }
        }
        animal.setText("");
    }

    public void run(){
        setVisible(true);
    }

    public static void main(String[] args) {
        MaquinaArray m = new MaquinaArray();
        m.run();
    }
}