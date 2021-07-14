import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculadoraZ extends JFrame implements ActionListener{

    private Container cp;
    private JTextField vista;
    private InfijaToPostfija calculo;

    public CalculadoraZ(){
        super("Calculadora");
        setSize(300,250);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        cp = getContentPane();
        vista = new JTextField();
        calculo = new InfijaToPostfija();

        init();
    }

    private void init(){
        createVistaNum();
        createTeclado();
        createOperadores();
    }

    public void createVistaNum(){
        vista.setBackground(Color.black);
        vista.setForeground(Color.white);
        vista.setFont(new Font("Arial", Font.BOLD, 35));
        vista.setHorizontalAlignment(JTextField.RIGHT);
        vista.setActionCommand("Enter");
        vista.addActionListener(this);
        cp.add(vista, BorderLayout.NORTH);
    }

    public void createTeclado(){
        JPanel panel = new JPanel();
        GridLayout gl = new GridLayout(4,3);
        panel.setLayout(gl);

        for(int i=1; i<=9; i++){
            JButton b = new JButton(String.valueOf(i));
            b.setFont(new Font("Arial", Font.BOLD, 15));
            panel.add(b);
            b.addActionListener(this);
        }
        JButton c = new JButton("C");
        c.setFont(new Font("Arial", Font.BOLD, 15));
        panel.add(c);
        c.addActionListener(this);

        JButton zero = new JButton("0");
        zero.setFont(new Font("Arial", Font.BOLD, 15));
        panel.add(zero);
        zero.addActionListener(this);

        JButton dot = new JButton(".");
        dot.setFont(new Font("Arial", Font.BOLD, 15));
        panel.add(dot);
        dot.addActionListener(this);

        cp.add(panel, BorderLayout.CENTER);
    }

    private void createOperadores(){
        JPanel panel = new JPanel();
        GridLayout gl = new GridLayout(4,2);
        panel.setLayout(gl);

        JButton borrar = new JButton("<");
        borrar.setFont(new Font("Arial", Font.BOLD, 15));
        borrar.addActionListener(this);
        panel.add(borrar);
        
        JButton cerrar = new JButton("Cerrar");
        cerrar.setBackground(Color.red);
        cerrar.setForeground(Color.white);
        cerrar.addActionListener(this);
        panel.add(cerrar);

        JButton mod = new JButton("(");
        mod.setFont(new Font("Arial", Font.BOLD, 15));
        mod.addActionListener(this);
        panel.add(mod);
        
        JButton pot = new JButton(")");
        pot.setFont(new Font("Arial", Font.BOLD, 15));
        pot.addActionListener(this);
        panel.add(pot);

        JButton times = new JButton("x");
        times.setFont(new Font("Arial", Font.BOLD, 15));
        times.addActionListener(this);
        panel.add(times);
        
        JButton div = new JButton("/");
        div.setFont(new Font("Arial", Font.BOLD, 15));
        div.addActionListener(this);
        panel.add(div);

        panel.add(operadoresMasMenos());
        
        JButton igual = new JButton("=");
        igual.setFont(new Font("Arial", Font.BOLD, 15));
        igual.addActionListener(this);
        panel.add(igual);

        cp.add(panel, BorderLayout.EAST);
    }

    private JPanel operadoresMasMenos(){
        JPanel panel = new JPanel();
        GridLayout gl = new GridLayout(2,1);
        panel.setLayout(gl);

        JButton mas = new JButton("+");
        mas.setFont(new Font("Arial", Font.BOLD, 15));
        mas.addActionListener(this);
        panel.add(mas);
        
        JButton menos = new JButton("-");
        menos.setFont(new Font("Arial", Font.BOLD, 15));
        menos.addActionListener(this);
        panel.add(menos);

        return panel;
    }

    public void run(){
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        String inst = e.getActionCommand();
        String aux = vista.getText();
        int ind = 0;
        switch (inst) {
            case "Enter": case "=":
                aux = Double.toString(calculo.getResultado(aux));
            break;
            case "C":
                aux = "";
            break;
            case "Cerrar":
                System.exit(0);
            break;
            case "<":
                int i = aux.length();
                if(i > 0)
                    aux = aux.substring(0, i-1);
            break;
            default:
                aux = aux + inst;
            break;
        }
        vista.setText(aux);
    }

    public static void main(String[] args) {
        CalculadoraZ cz = new CalculadoraZ();
        cz.run();
    }
}