import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import javax.swing.filechooser.*;
import javax.swing.JOptionPane;

public class Formulario extends JFrame implements ActionListener{

    private JButton registrar, cambiarURL;
    private JTextField user;
    private JPasswordField contra;
    private JLabel foto;
    private JLabel urlFoto;
    private JCheckBox aceptar;
    private Container cp;

    public Formulario(){
        super("Formulario");
        setSize(500,350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        cp = getContentPane();

        registrar = new JButton("Registrar");
        cambiarURL = new JButton("Cambiar...");
        user = new JTextField();
        contra = new JPasswordField();
        foto = new JLabel();
        urlFoto = new JLabel("../img/no-image.jpg");
        aceptar = new JCheckBox("He leido los terminos y condiciones");

        init();
    }

    private void init(){
        crearCampos();
        crearBotones();
    }

    private void crearCampos(){
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(1,2,10,10));

        // Campos de texto
        JPanel campos = new JPanel();
        campos.setLayout(new GridLayout(2,2,10,5));
        campos.add(new JLabel("Nombre de usuario:"));
        campos.add(user);
        campos.add(new JLabel("Password:"));
        campos.add(contra);
        p.add(campos);

        // Campos de la imagen
        JPanel fotos = new JPanel();
        fotos.setLayout(new GridLayout(2,1));
        foto.setIcon(myImage());
        fotos.add(foto);
        JPanel aux = new JPanel();
        aux.setLayout(new FlowLayout());
        aux.add(urlFoto);
        aux.add(cambiarURL);
        cambiarURL.addActionListener(this);
        fotos.add(aux);
        p.add(fotos);

        cp.add(p, BorderLayout.CENTER);
    }

    private void crearBotones(){
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(2,1));

        aceptar.addActionListener(this);
        p.add(aceptar, BorderLayout.CENTER);

        registrar.setEnabled(false);
        registrar.addActionListener(this);
        p.add(registrar);

        cp.add(p, BorderLayout.SOUTH);

    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == cambiarURL){
            selectImage();
        }else if(e.getSource() == aceptar){
            if(aceptar.isSelected()){
                registrar.setEnabled(true);
            }else{
                registrar.setEnabled(false);
            }
        }else if(e.getSource() == registrar){
            showRegistro();
            limpiarCampos();
        }
    }

    private void showRegistro(){
        String msg = "Usuario: "+user.getText()+"\nPassword: "+contra.getText();
        JOptionPane.showMessageDialog(null, msg, "Registro con exito", JOptionPane.INFORMATION_MESSAGE);
    }

    private void limpiarCampos(){
        user.setText("");
        contra.setText("");
        urlFoto.setText("../img/no-image.jpg");
        foto.setIcon(myImage());
        aceptar.setSelected(false);
    }

    private void selectImage(){
        JFileChooser fc = new JFileChooser("../img");
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.jpg", "jpg");
        fc.setFileFilter(filtro);
        int seleccion = fc.showOpenDialog(this);
        if(seleccion == JFileChooser.APPROVE_OPTION){
            // File fichero = fc.getSelectedFile();
            String url = fc.getSelectedFile().getAbsolutePath();
            urlFoto.setText(url);
            foto.setIcon(myImage());
            url = fc.getSelectedFile().getName();
            urlFoto.setText(url);
        }
    }

    private ImageIcon myImage(){
        ImageIcon imageIcon = new ImageIcon(urlFoto.getText()); // load the image to a imageIcon
        Image image = imageIcon.getImage(); // transform it 
        Image newimg = image.getScaledInstance(150, 200, Image.SCALE_SMOOTH); // scale it the smooth way  
        imageIcon = new ImageIcon(newimg);  // transform it back
        return imageIcon;
    }

    public void run(){
        setVisible(true);
    }

    public static void main(String[] args) {
        Formulario f = new Formulario();
        f.run();
    }
}