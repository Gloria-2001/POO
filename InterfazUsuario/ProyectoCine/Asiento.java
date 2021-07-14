import javax.swing.*;
import java.awt.*;

public class Asiento extends JButton{

    public String ID;
    private boolean ocupado =  false;

    public Asiento(String title, String ID){
        super(title);
        this.ID = ID;
        setBackground(new Color(255,200,147));
    }

    public void cambiarOcupabilidad(){
        if(ocupado){
            setBackground(new Color(255,200,147));
        }else{
            setBackground(new Color(146,173,226));
        }
        ocupado = !ocupado;
    }

}