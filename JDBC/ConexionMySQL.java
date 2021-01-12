import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionMySQL {

    // Librería de MySQL
    private String driver = "com.mysql.cj.jdbc.Driver";

    // Nombre de la base de datos
    private String database;

    // Host
    private String hostname = "localhost";

    // Puerto
    private String port;
    
    // Nombre de usuario
    private String username;

    // Clave de usuario
    private String password;

    // Ruta de nuestra base de datos (desactivamos el uso de SSL con "?useSSL=false")
    private String url;

    private Connection conn = null;

    public ConexionMySQL(String db, String port, String user, String pass){
        this.database = db;
        this.port = port;
        this.username = user;
        this.password = pass;

        this.url = "jdbc:mysql://" + hostname + ":" + port +"/" + db +
        "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";   
    }

    public void conectar(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            this.conn = DriverManager.getConnection(url, username, password);
            System.out.println("Conexion satisfactoria a "+ hostname + ":" + port +"/" + database);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void cerrar(){
        try {
            this.conn.close();
            System.out.println("Conexion cerrarda a "+ hostname + ":" + port +"/" + database);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ConexionMySQL SQL = new ConexionMySQL("prueba","3306","root","");
        // Llamas al método que tiene la clase y te devuelve una conexión
        SQL.conectar();
        SQL.cerrar();
    }

}