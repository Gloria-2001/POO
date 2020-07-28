public class Main{
    public static void main(String[] args){
        if(args.length!=3){
            System.out.println("Forma de uso: Main nombre apellido edad");
            System.exit(0);
        }

        Persona p00 = new Persona(args[0],args[1],Integer.parseInt(args[2]),"HELA980106HDFRPN05");
        p00.hablar();
        p00.caminar();
        p00.dormir();

        System.out.println(p00.getCURP());
        p00.setCURP("HELA980106HDFRPN06");
        System.out.println(p00.getCURP());
    }
}