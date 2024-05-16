import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App {
    public static boolean checkConnection() {
        String url = "jdbc:mysql://localhost:3306/biblioteca";
        String user = "biblioteca";
        String password = "1234";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Conexión exitosa");
            return true;
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
            return false;
        }
    }

    public static void main(String[] args) {
        boolean isConnected = checkConnection();
        System.out.println("¿Hay conexión con la base de datos? " + isConnected);
    }
}
