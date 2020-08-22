import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MiGridLayout extends JFrame{

    private Container cp;
    private GridLayout gl;
    /*
        GridLayout(int filas, int columnas)

        setHgap(int separacion);
        setVgap(int separacion);
    */
        
    public MiGridLayout(String title){
        super(title);
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.cp = getContentPane();
        this.gl = new GridLayout(4,5);
        gl.setHgap(5);  gl.setVgap(5);
        cp.setLayout(gl);
        this.init();
    }

    private void init(){
        for(int i=1; i<=9; i++){
            cp.add(new JButton(String.valueOf(i)));
        }
        cp.add(new JButton("*"));
        cp.add(new JButton("0"));
        cp.add(new JButton("#"));
    }

    public void run(){
        this.setVisible(true);
    }

    public static void main(String[] args) {
        MiGridLayout v = new MiGridLayout("Numeros");
        v.run();
    }
}