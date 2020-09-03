import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Radio01 extends JFrame implements ActionListener{

    private JRadioButton []radios;
    private Container cp;
    private ButtonGroup bg;
    private JLabel ac;
    private String animal[] = {"perro", "gato", "huron","delfin","vaca"};

    public Radio01(){
        super("Radio Button");
        setSize(600,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        cp = getContentPane();
        cp.setLayout(new FlowLayout());

        radios = new JRadioButton[5];
        ac = new JLabel("_____Mostrar_____");

        bg = new ButtonGroup();

        init();
    }

    private void init(){
        for(int i=0; i<5; i++){
            radios[i] = new JRadioButton(animal[i]);
            radios[i].addActionListener(this);
            bg.add(radios[i]);
            cp.add(radios[i]);
        }

        cp.add(ac);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        ac.setText("");
        ac.setIcon(new ImageIcon("../img/" + e.getActionCommand() + ".jpg"));
    }

    public void run(){
        setVisible(true);
    }
    
    public static void main(String[] args) {
        Radio01 r =  new Radio01();
        r.run();
    }
}