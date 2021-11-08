import conector.BDController;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

public class App {
    public static void main(String[] args) {
        checkServer();
    }

    private static void checkServer() {
        System.out.println("Comprobamos la conexión al Servidor BD");
        BDController controller = BDController.getInstance();
        try {
            controller.open();
            Optional<ResultSet> rs = controller.select("SELECT 'Hello World'");
            if (rs.isPresent()) {
                System.out.println(rs.get().next());
                ;
                controller.close();
            }
        } catch (SQLException e) {
            System.err.println("Error al conectar al servidor de Base de Datos: " + e.getMessage());
            System.exit(1);
        }
    }
}
