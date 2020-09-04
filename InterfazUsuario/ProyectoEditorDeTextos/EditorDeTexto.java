import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class EditorDeTexto extends JFrame implements ActionListener{
    
    private JMenuBar barra;
    private JMenu archivo;
    private JMenuItem salir;
    private JMenuItem abrir;
    private JMenuItem guardar;

    private JTextField pathFile;
    private JTextArea textoFile;

    private Container cp;

    public EditorDeTexto(){
        super("Editor de texto");
        setSize(500,550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        cp = getContentPane();

        barra = new JMenuBar();
        archivo = new JMenu("Archivo");
        salir = new JMenuItem("Salir");
        abrir = new JMenuItem("Abrir");
        guardar = new JMenuItem("Guardar");
        pathFile = new JTextField(20);
        textoFile = new JTextArea();

        init();
    }

    private void init(){
        crearCuerpo();
        crearBarra();
    }

    private void crearBarra(){
        abrir.addActionListener(this);
        archivo.add(abrir);
        guardar.addActionListener(this);
        archivo.add(guardar);
        salir.addActionListener(this);
        archivo.add(salir);

        barra.add(archivo);
        setJMenuBar(barra);
    }

    private void crearCuerpo(){
        cp.add(pathFile, BorderLayout.NORTH);
        cp.add(textoFile, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        
        if(e.getSource() == abrir){
            funAbrir();
        }
        
        if(e.getSource() == salir){
            System.exit(0);
        }
    }

    private void funAbrir(){
        JFileChooser fc = new JFileChooser("./");
        int seleccion = fc.showOpenDialog(this);
        if(seleccion == JFileChooser.APPROVE_OPTION){
            String urlArch = fc.getSelectedFile().getAbsolutePath();
            leer(urlArch);
        }
    }

    private void leer(String url){
        String linea = url;

        try{
            // Se crea y se abre un fichero.
            File inputFile = new File(linea);

            // Se crea un lector del archivo y un buffer
            // que contendrá el texto del archivo
            FileReader fr = new FileReader(inputFile);
            BufferedReader br = new BufferedReader(fr);

            // Se lee linea por linea el archivo
            linea = br.readLine();
            while( linea != null){
                linea += br.readLine();
            }

            // Se cierra el lector del archivo
            fr.close();


        }catch(FileNotFoundException e){
            System.err.println("ArchivoText: " + e);
        }catch(IOException e){
            System.err.println("ArchivoText: " + e);
        }

        textoFile.setText(linea);
    }

    public void run(){
        setVisible(true);
    }

    public static void main(String[] args){
        EditorDeTexto et = new EditorDeTexto();
        et.run();
    }
}