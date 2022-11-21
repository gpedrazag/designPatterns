/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unipiloto.patterns.dao;

/**
 *
 * @author USUARIO
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.apache.derby.jdbc.*;

public class ControladorBD {

    String driver = "org.apache.derby.jdbc.ClientDriver";
    String url = "jdbc:derby://localhost:1527/sample";
    String login = "app";
    String password = "app";
    String sentencia = "";
    Connection connection = null;
    Statement statement = null;
    ResultSet rs = null;

    public ControladorBD() {
    }

    public Connection conectar() {
        try {
            //Cargar los controladores para el acceso a la BD
            Class.forName(driver);
            System.out.println("Cargar los controladores para el acceso a la BD");
            //Establecer la conexión con la BD Empresa
            connection = DriverManager.getConnection(url, login, password);
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Error 1-" + cnfe.getMessage());
        } catch (SQLException sqle) {
            System.out.println("Error 2-" + sqle.getMessage());
        }
        return connection;
    }

    public void desconectar(Connection con) {
        try {
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void guardarEmpleado(Empleado emp) {
        System.out.println("Guardar empleado");

        try {
            sentencia = "INSERT INTO empleado VALUES("
                    + emp.getId() + ",'"
                    + emp.getNombre() + "','"
                    + emp.getApellido() + "',"
                    + emp.getGenero() + ",'"
                    + emp.getCargo() + "',"
                    + emp.getSalario() + ""
                    + ")";
            
            System.out.println("Sentencia "+sentencia);
            //Crear una sentencia
            statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);

            //Crear un objeto ResultSet para guardar lo obtenido
            //y ejecutar la sentencia SQL
            statement.executeUpdate(sentencia);
        } catch (SQLException sqle) {
            System.out.println("Error en "+sqle.getSQLState());
        }

    }

    public void findAll() {
        if (connection == null) {
            connection = conectar();
        }
        sentencia = "SELECT * FROM APP.EMPLEADO"; //SELECT * FROM APP.MICRO_MARKET 
        try {
            //Crear una sentencia
            statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            //Crear un objeto ResultSet para guardar lo obtenido
            //y ejecutar la sentencia SQL
            rs = statement.executeQuery(sentencia);
            System.out.println("consulta ok");
            if (rs == null) {
                System.out.println("vacio");
            }
            System.out.println(rs.first() + " " + rs.getRow() + " " + rs.getCursorName());
            do {
                //int id=rs.getInt(1);
                //System.out.println("rs next "+rs.getString(1)+" "+rs.getDouble(2));

                int id=rs.getInt(1);
                System.out.println("Id " + id);
                String nombre = rs.getString(2);
                System.out.println("NOmbre " + nombre);
                String apellido = rs.getString(3);
                System.out.println("Apellido " + apellido);
                int genero=rs.getInt(4);
                System.out.println("Genero " + genero);
                String cargo = rs.getString(5);
                System.out.println("Cargo " + cargo);
               
                Double salario = rs.getDouble(6);
                System.out.println("Salario " + salario);
                
                
                
                System.out.println(id + "\t\t" + nombre + "\t\t" + apellido + "\t\t" + salario);
            } while (rs.next());

        } catch (SQLException sqle) {
            System.out.println("Excepcion " + sqle.getSQLState());
        }
    }

       
    
}
