import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Radio00 extends JFrame{

    private JRadioButton perro;
    private JRadioButton gato;
    private JRadioButton huron;
    private Container cp;
    private ButtonGroup bg;

    public Radio00(){
        super("Radio Button");
        setSize(600,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        cp = getContentPane();
        cp.setLayout(new FlowLayout());

        perro = new JRadioButton("perro");
        gato = new JRadioButton("gato");
        huron = new JRadioButton("huron");

        bg = new ButtonGroup();

        init();
    }

    private void init(){
        bg.add(perro);
        bg.add(gato);
        bg.add(huron);

        cp.add(perro);
        cp.add(gato);
        cp.add(huron);
    }

    public void run(){
        setVisible(true);
    }
    
    public static void main(String[] args) {
        Radio00 r =  new Radio00();
        r.run();
    }
}