import javax.swing.JOptionPane;

public class OptionDialog{

    public String opc[] = {
        "Opcion A",
        "Opcion B",
        "Opcion C"
    };

    public OptionDialog(){
    }

    public static void main(String[] args) {
        OptionDialog msj = new OptionDialog();

        // JOptionPane.showOptionDialog(padre, mensaje, titulo, tipo de seleccion, tipo de mensaje, icono_personal, opciones, valor inicial);
        JOptionPane.showOptionDialog(null, 
                                    "Hola mundo", 
                                    "Clase OptionDialog", 
                                    JOptionPane.DEFAULT_OPTION, 
                                    JOptionPane.QUESTION_MESSAGE,
                                    null, 
                                    msj.opc, 
                                    msj.opc[0]);
        
    }

}