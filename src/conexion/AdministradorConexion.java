package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AdministradorConexion {
    private static final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
    private static final String USER = "usuario"; // Reemplaza con el usuario de la base de datos
    private static final String PASSWORD = "contraseña"; // Reemplaza con la contraseña

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
