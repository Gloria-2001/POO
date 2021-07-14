import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Sala extends JFrame implements ActionListener{
    
    private Container cp;
    private ArrayList<Asiento> asientos;
    private String filas[] = {"A","B","C","D","E","F"};
    private int numFilas = 6;
    private JLabel pantalla;

    public Sala(){
        super("Sala de cine");
        setSize(600,250);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        asientos = new ArrayList<Asiento>();
        pantalla = new JLabel("Pantalla");

        cp = getContentPane();

        init();
    }

    private void init(){
        crearPantalla();
        crearAsientos();
        crearPanelFilas();
        crearPanelSala();
    }

    private void crearPantalla(){
        pantalla.setBackground(Color.black);
        pantalla.setForeground(Color.white);
        pantalla.setFont(new Font("Arial", Font.BOLD, 25));
        pantalla.setOpaque(true);
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setBackground(Color.black);
        panel.add(pantalla);
        cp.add(panel, BorderLayout.NORTH);
    }

    private void crearAsientos(){
        for(int i=0; i<numFilas; i++){
            for(int j=0; j<10; j++){
                String num = String.valueOf(j+1);
                Asiento as = new Asiento(num,filas[i]+num);
                this.asientos.add(as);
            }
        }
    }

    private void crearPanelFilas(){
        JPanel panel = new JPanel();
        GridLayout gl = new GridLayout(numFilas,1,10,5);
        panel.setLayout(gl);

        for(int i=0;i<numFilas; i++){
            panel.add(new JLabel(" "+filas[i]+" "));
        }

        cp.add(panel, BorderLayout.WEST);
    }

    private void crearPanelSala(){
        JPanel panel = new JPanel();
        GridLayout gl = new GridLayout(numFilas,10,10,5);
        panel.setLayout(gl);

        for(int i=0; i<60; i++){
            panel.add(asientos.get(i));
            asientos.get(i).setActionCommand(String.valueOf(i+1));
            asientos.get(i).addActionListener(this);
        }

        cp.add(panel, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        int numAs =  Integer.parseInt(e.getActionCommand());
        asientos.get(numAs-1).cambiarOcupabilidad();
    }

    public void run(){
        setVisible(true);
    }

    public static void main(String[] args) {
        Sala s = new Sala();
        s.run();
    }
}