import javax.swing.JOptionPane;

public class OptionDialog{

    public String opc[] = {
        "Cancelar",
        "Si",
        "No"
    };

    public OptionDialog(){
    }

    public static void main(String[] args) {
        OptionDialog msj = new OptionDialog();

        /* JOptionPane.showOptionDialog(Componente_ padre,
                String mensaje,
                String titulo,
                tipoDeSeleccion,
                Icono JOptionPane,
                icono_personal,
                opciones,
                valor inicial);
        */
        int res = JOptionPane.showOptionDialog(null, 
                                    "Hola mundo", 
                                    "Clase OptionDialog", 
                                    JOptionPane.DEFAULT_OPTION, 
                                    JOptionPane.QUESTION_MESSAGE,
                                    null, 
                                    msj.opc, 
                                    msj.opc[0]);
        
        System.out.println(msj.opc[res]);
    }

}