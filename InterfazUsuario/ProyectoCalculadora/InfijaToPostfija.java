import java.util.Stack;
import java.util.LinkedList;

public class InfijaToPostfija{

    private Stack<Operador> operadores;
    private LinkedList<String> lista;
    private Stack<Double> numeros;

    public InfijaToPostfija(){
        operadores = new Stack<Operador>();
        lista = new LinkedList<String>();
        numeros = new Stack<Double>();
    }

    public double getResultado(String expresion){
        crearInfija(expresion);
        doOperacion();
        return numeros.pop();
    }

    private void crearInfija(String exp){
        int tam = exp.length();
        String numS = "";
        char letra;
        for(int i=0; i<tam; i++){
            letra = exp.charAt(i);
            if(isOperador(letra)){
                lista.add(numS);
                addStackOperadores(new Operador(letra,getPrioridad(letra)));
                numS = "";
            }else{
                numS += Character.toString(letra);
            }
        }
        lista.add(numS);
        while(!operadores.empty()){
            lista.add(Character.toString(operadores.pop().operador));
        }
    }

    private boolean isOperador(char c){
        boolean res = false;
        switch (c) {
            case '+': case '-': case 'x':
            case '/': case '(': case ')':
                res = true;
            break;
            default:
                res = false;
            break;
        }
        return res;
    }

    private int getPrioridad(char c){
        int prio;
        switch (c) {
            case '+': case '-':
                prio = 1;
            break;
            case 'x': case '/':
                prio = 2;
            break;        
            default:
                prio = 0;
            break;
        }
        return prio;
    }

    private void addStackOperadores(Operador op){
        Operador aux;
        switch (op.operador) {
            case '(':
                operadores.push(op);
            break;
            case ')':
                while(!operadores.empty()){
                    aux = operadores.pop();
                    if(aux.operador != '('){
                        lista.add(Character.toString(aux.operador));
                    }else{
                        break;
                    }
                }
            break;
            default:
                if(operadores.empty()){
                    operadores.push(op);
                }else{
                    while(!operadores.empty()){
                        if(operadores.empty() || op.prioridad > operadores.peek().prioridad){
                            operadores.push(op);
                            break;
                        }else{
                            aux = operadores.pop();
							if(aux.prioridad == op.prioridad){
								lista.add(Character.toString(aux.operador));
								operadores.push(op);
								break;
							}else if(operadores.peek() == null){
								operadores.push(op);
								break;
							}else if(aux.operador != '('){
								lista.add(Character.toString(aux.operador));
							}
                        }
                    }
                }
            break;
        }
    }

    private void doOperacion(){
        String data;
        int tam = lista.size();
        for(int i=0; i<tam; i++){
            data = lista.get(i);
            if(data.length() <= 0){
                continue;
            }else if(isOperador(data.charAt(0))){
                operarDatos(data);
            }else{
                numeros.push(Double.parseDouble(data));
            }
        }
    }

    private void operarDatos(String c){
        double b = numeros.pop();
        double a = numeros.pop();
        double res = 0;
        switch (c) {
            case "+":
                res = a + b;
            break;
            case "-":
                res = a - b;
            break;
            case "x":
                res = a * b;
            break;
            case "/":
                res = a / b;
            break;
        }
        numeros.push(res);
    }
    
    public class Operador{
        public char operador;
        public int prioridad;

        public Operador(char op, int pri){
            this.operador = op;
            this.prioridad = pri;
        }
    }

    // public static void main(String[] args) {
    //     InfijaToPostfija itp = new InfijaToPostfija();
    //     double a = itp.getResultado("(6+2)x3/2");
    //     System.out.println(a);
    // }

}