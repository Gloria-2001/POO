import javax.swing.JOptionPane;

public class ConfirmDialog{

    public int[] seleccion = {
        JOptionPane.OK_CANCEL_OPTION,
        JOptionPane.YES_NO_OPTION,
        JOptionPane.YES_NO_CANCEL_OPTION,
    };

    public ConfirmDialog(){
    }

    public static void main(String[] args) {
        ConfirmDialog mensaje = new ConfirmDialog();

        // JOptionPane.showConfirmDialog(Componente_padre, String mensaje, String titulo, int tipo de seleccion, int icono, [icono_personal]);
        for(int i=0; i<3; i++)
            JOptionPane.showConfirmDialog(null, "Hola mundo", "Clase ConfirmDialog", mensaje.seleccion[i], JOptionPane.WARNING_MESSAGE);
        
    }

}