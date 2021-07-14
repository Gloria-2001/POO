import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GaleriaZH extends JFrame implements ActionListener{

    private JLabel imagen;
    private JLabel numeracion;
    private Container cp;
    private JButton next;
    private JButton prev;
    private JTextField numero;
    private int index;
    private int numImage = 15;

    public GaleriaZH(){
        super("Galeria");
        setSize(400,330);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cp = getContentPane();
        
        index = 1;
        next = new RoundButton(">",Color.lightGray);
        prev = new RoundButton("<",Color.lightGray);
        imagen = new JLabel();
        numeracion =  new JLabel("/"+numImage);
        numero = new JTextField(2);

        init();
    }

    private void init(){
        imagen.setIcon(new ImageIcon("img/pic1.jpg"));
        numero.setText("1");
        crearPanelFotos();
        crearPanelNumeracion();
    }

    private void crearPanelFotos(){
        JPanel p = new JPanel();
        p.setLayout(new FlowLayout());
        p.add(prevBoton());
        p.add(imagen);
        p.add(nextBoton());
        cp.add(p, BorderLayout.NORTH);
    }

    private JPanel prevBoton(){
        JPanel p = new JPanel();
        p.add(prev, BorderLayout.CENTER);
        prev.addActionListener(this);
        return p;
    }

    private JPanel nextBoton(){
        JPanel p = new JPanel();
        p.add(next, BorderLayout.CENTER);
        next.addActionListener(this);
        return p;
    }

    private void crearPanelNumeracion(){
        JPanel p = new JPanel();
        p.setLayout(new FlowLayout());
        p.add(numero);
        numero.addActionListener(this);
        p.add(numeracion);
        cp.add(p, BorderLayout.SOUTH);
    }

    public void run(){
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == next){
            this.index++;
            if(this.index == numImage+1){
                this.index = 1;
            }
        }else if(e.getSource() == prev){
            this.index--;
            if(this.index == 0){
                this.index = numImage;
            }
        }else{
            int aux = Integer.parseInt(e.getActionCommand());
            if(aux >= 1 && aux <= numImage){
                this.index = aux;
            }else{
                JOptionPane.showMessageDialog(null,
                "Imagen no existente, intente de nuevo\nNumero de imagenes: "+numImage,
                "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        String num =  String.valueOf(this.index);
        imagen.setIcon(new ImageIcon("img/pic" + num + ".jpg"));
        numero.setText(num);
    }

    public static void main(String[] args) {
        GaleriaZH gal =  new GaleriaZH();
        gal.run();
    }
}