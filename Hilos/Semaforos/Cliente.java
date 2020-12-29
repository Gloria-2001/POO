import java.lang.Thread.*;

public class Cliente extends Thread{

    private Bar bar;
    private int budget; 

    public Cliente(String msg, int budget, Bar bar){
        super(msg); // Nombre (super: invocar al constructor de la clase padre)
        this.budget=budget;  //presupuesto zona VIP 
        this.bar=bar;
    }

    public int getBudget(){
        return budget; 
    }

    @Override
    public void run(){
        try {
            bar.pasarBar(getName());
            if(budget>5000){
                bar.pasarZonaVIP(getName(),getBudget());
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}