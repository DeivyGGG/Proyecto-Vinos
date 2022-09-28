package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnectionVino {
    
    Connection connection;
    static String bd= "vinos_lujo";
    static String port ="3307";
    static String login = "root";
    static String password ="admin";

    public DBConnectionVino() {
       try{
           Class.forName("com.mysql.jdbc.Driver");
           String url = "jdbc:mysql://localhost:" + this.port + "/" + this.bd;
           connection = DriverManager.getConnection(url, this.login, this.password);
           System.out.println("conexion");
        } catch (Exception ex){
           System.out.println("error");
        }
    }
    
    public Connection getConnection(){
        return connection;
    }
    
    public void desconectar(){
        connection = null;
    }   
}
