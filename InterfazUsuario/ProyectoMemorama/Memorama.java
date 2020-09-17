import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Stack;
import java.awt.image.BufferedImage;

public class Memorama extends JFrame implements ActionListener{

    // Imagenes de las cartas a jugar
    private String animales[] = {
        "perro.jpg", "gato.jpg", "cisne.jpg",
        "hamster.jpg", "huron.jpg", "flor.jpg"
    };
    private JButton cartas[];
    private String sCartas[];
    private Stack<Integer> posiciones;  // entero; similar a int; Integer es un objeto
    private Container cp;
    private int numCartas;
    private int volteadas;
    private int numVolteada;
    private Timer delay;
    private BufferedImage imgNull;
    
    public Memorama(){
        super("Memorama");
        setSize(700,500);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        cp = getContentPane();
        numCartas = 12;
        cartas = new JButton[12];           // Cartas del juego
        sCartas = new String[12];           // Nombre de la imagen en juego
        posiciones = new Stack<Integer>();  // Posiciones de las cartas
        volteadas = numVolteada = 0;        // Control para el número de cartas a voltear en el turno
        delay = new Timer(500,this);
        imgNull = new BufferedImage(200, 200, BufferedImage.TYPE_INT_ARGB);

        init();
    }

    private void init(){
        crearCartas();
        crearMesa();
        posiciones.clear();
    }

    private void crearCartas(){
        for(int i=0; i<numCartas/2; i++){
            crearCarta(i);
            crearCarta(i);
        }
    }

    private void crearCarta(int index){
        int a;
        while(true){
            a = (int) Math.floor(Math.random()*numCartas);
            // a = 9
            if(posiciones.search(a) == -1){
                posiciones.push(a);
                break;
            }
        }
        JButton aa = new JButton("");
        // sCartas[9] = animales[0] = "perro.jpg"
        sCartas[a] = animales[index];
        // cartas[9] = nuevo Boton
        cartas[a] = aa;
    }

    private void crearMesa(){
        JPanel panel = new JPanel();
        GridLayout gl = new GridLayout(3,4);
        panel.setLayout(gl);

        for(int i=0; i<numCartas; i++){
            cartas[i].setActionCommand(String.valueOf(i));
            cartas[i].addActionListener(this);
            panel.add(cartas[i]);
        }

        cp.add(panel, BorderLayout.CENTER);
    }

    public void run(){
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == delay){
            int i;
            i = posiciones.pop();
            cartas[i].setIcon(new ImageIcon(imgNull));
            i = posiciones.pop();
            cartas[i].setIcon(new ImageIcon(imgNull));
        }else{
            int index = Integer.parseInt(e.getActionCommand());
            volteadas++;
            accionarCarta(index);
        }
    }

    public void accionarCarta(int index){
        if(volteadas == 2){
            // cartas[6].setIcon(new ImageIcon(sCartas[6]));
            cartas[index].setIcon(new ImageIcon(sCartas[index]));
            // sCartas[6].equals(sCartas[0])
            if(! sCartas[index].equals(sCartas[posiciones.peek()])){
                posiciones.push(index);
                delay.setRepeats(false);
                delay.start();
            }else{
                // cartas[1].setEnabled(false);
                cartas[index].setEnabled(false);
                int a = posiciones.pop();
                // cartas[0].setenabled(false);
                cartas[a].setEnabled(false);
                numVolteada++;
                if(numVolteada == numCartas/2){
                    JOptionPane.showMessageDialog(null,
                    "Felicidades\nDescubriste todos los pares",
                    "Juego terminado", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            volteadas = 0;
        }else{
            posiciones.push(index); // 0
            // cartas[0].setIcon(new ImageIcon(sCartas[0]));
            cartas[index].setIcon(new ImageIcon(sCartas[index]));
        }
    }

    public static void main(String[] args) {
        Memorama m = new Memorama();
        m.run();
    }
}