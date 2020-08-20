import javax.swing.JOptionPane;

public class MessageDialog{

    public int[] icono = {
        JOptionPane.INFORMATION_MESSAGE,
        JOptionPane.WARNING_MESSAGE,
        JOptionPane.ERROR_MESSAGE,
        JOptionPane.QUESTION_MESSAGE,
        JOptionPane.PLAIN_MESSAGE
    };

    public MessageDialog(){
    }

    public static void main(String[] args) {
        MessageDialog mensaje = new MessageDialog();

        // JOptionPane.showMessageDialog(Componente_padre, String mensaje, String título, int icono,[icono_personal]);
        for(int i=0; i<5; i++)
            JOptionPane.showMessageDialog(null, "Hola mundo", "Clase MessageDialog", mensaje.icono[i]);
        
    }

}