import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static String url;
    private static String user;
    private static String password;
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            url = "jdbc:mysql://localhost:3306/jsp?useSSL=true";
            user="root";
            password="123456";
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection Jdbc(){
        try {
            return DriverManager.getConnection(url,user,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
