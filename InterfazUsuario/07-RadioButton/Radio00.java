import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Radio00 extends JFrame implements ActionListener{

    private JRadioButton perro;
    private JRadioButton gato;
    private JRadioButton huron;
    private Container cp;
    private ButtonGroup bg;
    private JButton ac;

    public Radio00(){
        super("Radio Button");
        setSize(600,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        cp = getContentPane();
        cp.setLayout(new FlowLayout());

        perro = new JRadioButton("perro");
        gato = new JRadioButton("gato");
        huron = new JRadioButton("huron");
        ac = new JButton("Mostrar");

        bg = new ButtonGroup();

        init();
    }

    private void init(){
        bg.add(perro);
        bg.add(gato);
        bg.add(huron);

        // perro.addActionListener(this);
        // gato.addActionListener(this);
        // huron.addActionListener(this);

        cp.add(perro);
        cp.add(gato);
        cp.add(huron);

        ac.addActionListener(this);
        cp.add(ac);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(perro.isSelected()){
            System.out.println("perro");
        }else if(gato.isSelected()){
            System.out.println("gato");
        }else if(huron.isSelected()){
            System.out.println("huron");
        }
    }

    public void run(){
        setVisible(true);
    }
    
    public static void main(String[] args) {
        Radio00 r =  new Radio00();
        r.run();
    }
}