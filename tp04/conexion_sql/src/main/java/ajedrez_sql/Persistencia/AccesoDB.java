package ajedrez_sql.Persistencia;

// Paquetes para la conexión a la base de datos
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AccesoDB {

    private final String maquina = "localhost";
    private String usuario = "Oleos";
    private String clave = "Leona@rdo_8844";
    private final int puerto = 3306;
    private final String bd = "bdajedrezmia";
    private String servidor = "";
    private Connection conexion = null;

    public AccesoDB() {

        this.servidor = "jdbc:mysql://" + this.maquina + ":" + this.puerto + "/" + this.bd;

        try {
            // Carga el driver mysql en memoria
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.err.println("ERROR AL REGISTRAR EL DRIVER");

            System.exit(0); // parar la ejecución
        }

        try {
            // Establecer conexión con el servidor y almarcerla en el atributo conexion
            conexion = DriverManager.getConnection(this.servidor, this.usuario, this.clave);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.err.println("ERROR AL CONECTAR A LA BASE DE DATOS");

            throw new RuntimeException("Error al conectar a la base de datos", e);
        }
    }

    // Retorna el objeto Conecction que usara
    public Connection getConexion() {
        return conexion;
    }

}
