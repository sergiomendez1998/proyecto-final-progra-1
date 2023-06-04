
package connection;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectionDBA {
    private static final String DATABASE="postgres";
    private static final String SERVER_NAME="pogra-proyecto.postgres.database.azure.com";
    private static final String PORT ="5432";
    private static final String URL="jdbc:postgresql://"+SERVER_NAME+":"+PORT+"/"+DATABASE;
    private static final String SERVER_ADMIN_LOGIN_NAME="sergiomendez1998";
    private static final String PASSWORD_ADMIN_LOGIN_PASSWORD="$ergio1998+";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(URL, SERVER_ADMIN_LOGIN_NAME, PASSWORD_ADMIN_LOGIN_PASSWORD);
            System.out.println("Conexion exitosa");
        } catch (Exception e) {
            System.out.println("Error en la conexion");
            e.printStackTrace();
        }
        return connection;
    }
}
