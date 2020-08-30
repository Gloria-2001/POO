import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Button extends JFrame implements ActionListener{
    private JButton press;
    private Container cp;

    public Button(String title){
        super(title);
        this.setSize(250,250);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.cp = getContentPane();
        this.cp.setLayout(new FlowLayout());
        this.press = new JButton("Press me");
        press.setBackground(java.awt.Color.red);
        press.setForeground(Color.white);
        
        this.init();
    }

    private void init(){
        this.cp.add(this.press);
        this.press.addActionListener(this);
    }

    public void run(){
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        press.getText();
        double num=Math.random()*6;
        press.setText(""+num);
        press.setBackground(java.awt.Color.yellow);
        press.setForeground(Color.black);
    }

    public static void main(String[] args) {
        Button ventana = new Button("Bienvenido");
        ventana.run();
    }
}