package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConfigDB {
    static Connection objConnection = null;

    public static Connection openConnection() {
        try {

            //control alt shift j es lo mismo que el control d

            //class forName permite obtener o implementar el driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Creamos variables con nuestra credenciales de la base de datos
            String url = "jdbc:mysql://uo65o6ukqlzf1qye:IULvRLzHzj5Pkvp0TOEI@bhiswuylyusezsovfgza-mysql.services.clever-cloud.com:3306/bhiswuylyusezsovfgza";
            String user = "uo65o6ukqlzf1qye";
            String password = "IULvRLzHzj5Pkvp0TOEI";
            //Establecemos la conexión
            objConnection = DriverManager.getConnection(url, user, password);
            System.out.println("Successful connection!");
        } catch (ClassNotFoundException e) {
            System.out.println("Error >> Driver not Installed");
        } catch (SQLException e) {
            System.out.println("Error >> A connection to the database could not be established");
        }
        return objConnection;
    }

    public static void closeConnection() {
        try {
            if (objConnection != null) objConnection.close();
            System.out.println("Connection Finished");
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
