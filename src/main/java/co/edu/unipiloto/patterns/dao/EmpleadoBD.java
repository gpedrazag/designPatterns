/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package co.edu.unipiloto.patterns.dao;



import static java.time.Instant.now;
import static java.time.LocalDate.now;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSetMetaData;
import org.apache.derby.jdbc.*;

/**
 *
 * @author USUARIO
 */
public class EmpleadoBD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola Mundo");
        String sentencia = "";
        Connection connection = null;
        Statement statement = null;
        ResultSet rs = null;

        ControladorBD conbd = new ControladorBD();

        String user = "app";
        String password = "app";
        String sURL = "jdbc:derby://localhost:1527/sample";
        connection=conbd.conectar();
        System.out.println("conexion ok");
       
        sentencia = "SELECT * FROM APP.MICRO_MARKET"; //SELECT * FROM APP.MICRO_MARKET 
        try {
            //Crear una sentencia
            statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            //Crear un objeto ResultSet para guardar lo obtenido
            //y ejecutar la sentencia SQL
            rs = statement.executeQuery(sentencia);
            System.out.println("consulta ok");
            if(rs==null)
                System.out.println("vacio");
            System.out.println(rs.first()+" "+rs.getRow()+ " "+rs.getCursorName());
            do {
                                       
                    String zipCode=rs.getString(1);
                    System.out.println("Zipcode "+zipCode);
                    double radious=rs.getDouble(2);
                    double areaLength=rs.getDouble(3);
                    double areaWidth=rs.getDouble(4);
                    System.out.println(zipCode+"\t\t"+radious+"\t\t"+areaLength+"\t\t"+areaWidth);
            } while (rs.next());

        } catch (SQLException sqle) {
                System.out.println("Excepcion "+sqle.getSQLState());
        }
        
        conbd.guardarEmpleado(new Empleado(3,"Gustavo","Gomez",1,"Auxiliar",1009000.0));
        conbd.findAll();
        
     
     
    }

}
