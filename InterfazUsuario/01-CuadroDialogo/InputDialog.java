import javax.swing.JOptionPane;

public class InputDialog{

    public String opc[] = {
        "Opcion A",
        "Opcion B",
        "Opcion C"
    };

    public InputDialog(){
    }

    public static void main(String[] args) {
        InputDialog msj = new InputDialog();

        // JOptionPane.showInputDialog(padre, Mensaje, Titulo, icono);
        String res00 = JOptionPane.showInputDialog(null, "Ingrese su nombre", "Hola mundo", JOptionPane.INFORMATION_MESSAGE);
        System.out.println(res00);

        // JOptionPane.showOptionDialog(padre, mensaje, titulo, icono, icono_personal, opciones, valor inicial);
        String resp01 = (String) JOptionPane.showInputDialog(null, "Elija una opcion", "Hola mundo", JOptionPane.QUESTION_MESSAGE, null, msj.opc, msj.opc[0]);
        System.out.println(resp01);
        
    }

}