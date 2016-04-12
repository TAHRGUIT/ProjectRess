package Connexion;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Y.T
 */
public class Connection {
    public java.sql.Connection con;
    public Connection() throws SQLException, ClassNotFoundException{
        Class.forName("com.mysql.jdbc.Driver");
        con = (java.sql.Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/ressources humaines?useUnicode=true&characterEncoding=UTF-8","root","");
        

       
    }
}
