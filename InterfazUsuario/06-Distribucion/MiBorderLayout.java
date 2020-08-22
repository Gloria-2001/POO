import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MiBorderLayout extends JFrame{

    private Container cp;
    private GridLayout gl;
    private JButton norte;
    private JButton sur;
    private JButton este;
    private JButton oeste;
    private JButton centro;


    public MiBorderLayout(String title){
        super(title);
        setSize(250,250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.cp = getContentPane();

        this.norte = new JButton("Norte");
        this.sur = new JButton("Sur");
        this.este = new JButton("Este");
        this.oeste = new JButton("Oeste");
        this.centro = new JButton("Centro");

        this.init();
    }

    private void init(){
        this.cp.add(norte,BorderLayout.NORTH);
        this.cp.add(sur,BorderLayout.SOUTH);
        this.cp.add(este,BorderLayout.EAST);
        this.cp.add(oeste,BorderLayout.WEST);
        this.cp.add(centro,BorderLayout.CENTER);
    }

    public void run(){
        this.setVisible(true);
    }

    public static void main(String[] args) {
        MiBorderLayout v = new MiBorderLayout("Border Layout");
        v.run();
    }
}