package ajedrez_sql.Persistencia;

// Paquetes para la conexión a la base de datos
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AccesoDB {

    private static final String MAQUINA = "localhost";
    private static final String USUARIO = "Oleos";
    private static final String CLAVE = "Leona@rdo_8844";
    private static final int PUERTO = 3306;
    private static final String BD = "bdajedrezmia";


    // bloque estatico para cargar el driver de MySQL de una sola vez cuando se cargue la clase AccesoDB
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(
                    "No se pudo cargar el driver MySQL",
                    e
            );
        }
    }

    public AccesoDB() {
    }

    // Retorna el objeto Conecction que usara
    public Connection getConexion() throws SQLException {

        return DriverManager.getConnection(
                "jdbc:mysql://" + MAQUINA + ":" + PUERTO + "/" + BD, USUARIO, CLAVE);
    }
}
