public class Main{
    public static void main(String[] args){
        Vehiculo v00 = new Vehiculo();
        System.out.print("Asientos: ");
        System.out.println(v00.asientos);
        System.out.print("Estado del vehiculo: ");
        System.out.println(v00.getEstado());
        v00.encender();
        System.out.print("Estado del vehiculo: ");
        System.out.println(v00.getEstado());
        v00.sonar();
        System.out.println(v00.largo);

        System.out.println("\nMicrobus");
        Microbus v01 = new Microbus();
        System.out.print("Asientos: ");
        System.out.println(v01.asientos);
        System.out.print("Estado del vehiculo: ");
        System.out.println(v01.getEstado());
        v01.encender();
        System.out.print("Estado del vehiculo: ");
        System.out.println(v01.getEstado());
        v01.sonar();
        System.out.println(v01.largo);
        System.out.println(v01.timbre);
        v01.tocarTimbre();
        System.out.println(v01.timbre);
        v01.gritar();

    }
}