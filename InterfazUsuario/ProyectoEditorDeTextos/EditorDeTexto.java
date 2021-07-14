import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class EditorDeTextoZH extends JFrame implements ActionListener{
    
    private JMenuBar barra;
    private JMenu archivo;
    private JMenuItem salir;
    private JMenuItem abrir;
    private JMenuItem nuevo;
    private JMenuItem guardar;

    private JTextField pathFile;
    private JTextArea textoFile;
    private JScrollPane scroll;

    private boolean isNewFile;
    private Container cp;

    public EditorDeTextoZH(){
        super("Editor de texto");
        setSize(500,550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        cp = getContentPane();

        isNewFile = true;

        barra = new JMenuBar();
        archivo = new JMenu("Archivo");
        salir = new JMenuItem("Salir");
        abrir = new JMenuItem("Abrir");
        nuevo = new JMenuItem("Nuevo");
        guardar = new JMenuItem("Guardar");
        pathFile = new JTextField(30);
        textoFile = new JTextArea();
        scroll = new JScrollPane(textoFile, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

        init();
    }

    private void init(){
        crearCuerpo();
        crearBarra();
    }

    private void crearBarra(){
        nuevo.addActionListener(this);
        archivo.add(nuevo);
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
        JPanel p = new JPanel();
        p.setLayout(new FlowLayout());
        p.add(new JLabel("Direccion:"));
        p.add(pathFile);

        cp.add(p, BorderLayout.NORTH);
        cp.add(scroll, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        
        if(e.getSource() == abrir){
            isNewFile = false;
            funAbrir();
        }

        if(e.getSource() == nuevo){
            isNewFile = true;
            pathFile.setText("Sin-titulo");
            textoFile.setText("");
        }

        if(e.getSource() == guardar){
            funGuardar();
        }
        
        if(e.getSource() == salir){
            System.exit(0);
        }
    }

    private void funAbrir(){
        JFileChooser fc = new JFileChooser("./");
        int seleccion = fc.showOpenDialog(this);
        if(seleccion == JFileChooser.APPROVE_OPTION){
            pathFile.setText("");
            textoFile.setText("");
            String urlArch = fc.getSelectedFile().getAbsolutePath();
            leer(urlArch);
            pathFile.setText(urlArch);
        }
    }

    private void leer(String url){
        String linea = url;
        String texto = new String();

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
                texto += (linea + "\n");
                linea = br.readLine();
            }

            // Se cierra el lector del archivo
            fr.close();


        }catch(FileNotFoundException e){
            System.err.println("ArchivoText: " + e);
        }catch(IOException e){
            System.err.println("ArchivoText: " + e);
        }

        textoFile.setText(texto);
    }

    private void funGuardar(){
        if(isNewFile){
            JFileChooser fc = new JFileChooser("./");
            int seleccion = fc.showSaveDialog(this);
            if(seleccion == JFileChooser.APPROVE_OPTION){
                String urlArch = fc.getSelectedFile().getAbsolutePath();
                escribir(urlArch);
                pathFile.setText(urlArch);
            }
        }else{
            escribir(pathFile.getText());
        }
        isNewFile = false;
    }

    private void escribir(String url){
        try{
            // Se crea y se abre un fichero.
            File outputFile = new File(url);

            // Se crea un escritor para poder plazmarlo
            // en el archivo nuevo
            FileWriter fw = new FileWriter(outputFile);
            PrintWriter pw = new PrintWriter(fw);

            // Se guarda el texto en el archivo
            pw.println(textoFile.getText());

            // Se cierra el escritor del archivo
            fw.close();
        }catch(FileNotFoundException e){
            System.err.println("ArchivoText: " + e);
        }catch(IOException e){
            System.err.println("ArchivoText: " + e);
        }
    }

    public void run(){
        setVisible(true);
    }

    public static void main(String[] args){
        EditorDeTextoZH et = new EditorDeTextoZH();
        et.run();
    }
}