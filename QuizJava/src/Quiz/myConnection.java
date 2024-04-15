
package Quiz;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/*
Ce code est une classe permettant de se connecter à une base de données MySQL en utilisant le JDBC. 
Il utilise la classe DriverManager fournie par le JDK pour obtenir une connexion à la base de données.
*/
public class myConnection {
    // Les informations de connexion
    private static final String URL = "jdbc:mysql://localhost:3306/quiz";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    // Méthode pour se connecter à la base de données
    /*
    La méthode getConnection() retourne un objet Connection
    qui peut être utilisé pour exécuter des requêtes sur la base de données. 
    */
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
        
    }
}

 
