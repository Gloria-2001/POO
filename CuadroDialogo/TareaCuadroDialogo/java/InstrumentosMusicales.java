import javax.swing.JOptionPane;

public class InstrumentosMusicales{
        public String opc[] = {
            "Piano",
            "Guitarra",
            "Violin",
            "Saxofon",
            "Otro"
        };
      
        public static void main(String[] args) {
            InstrumentosMusicales msj1 = new InstrumentosMusicales();

            String res00 = JOptionPane.showInputDialog(null, "Ingrese su nombre", "Instrumentos Musicales", JOptionPane.QUESTION_MESSAGE);
            System.out.println(res00);

            int res = JOptionPane.showOptionDialog(null, 
                                    "Elija el instrumento que quiera aprender a tocar:", 
                                    "Instrumentos Musicales", 
                                    JOptionPane.DEFAULT_OPTION, 
                                    JOptionPane.QUESTION_MESSAGE,
                                    null, 
                                    msj1.opc, 
                                    msj1.opc[0]);
        
            System.out.println(msj1.opc[res]);

            if(res==4){
                String res01 = JOptionPane.showInputDialog(null, "Ingrese el instrumento que quiere tocar", "Instrumentos Musicales", JOptionPane.QUESTION_MESSAGE);
                System.out.println(res01);
                int res03 = JOptionPane.showConfirmDialog(null, "¿Seguro que ese es el instrumento que quieres aprender?", "Instrumentos Musicales", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                System.out.println("Respuesta:" + res03); 
                if(res03==0){
                    JOptionPane.showMessageDialog(null, "Se ha confirmado el instrumento", "Instrumentos Musicales", JOptionPane.PLAIN_MESSAGE);
                }
            }else{
              int res02 = JOptionPane.showConfirmDialog(null, "¿Seguro que ese es el instrumento que quieres aprender?", "Instrumentos Musicales", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
              System.out.println("Respuesta:" + res02);  
              if(res02==0){
                  JOptionPane.showMessageDialog(null, "Se ha confirmado el instrumento", "Instrumentos Musicales", JOptionPane.PLAIN_MESSAGE);
              }
            }
        }
}