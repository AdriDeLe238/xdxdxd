/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SQL;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Adriana
 */
public class Conexion_bd {
    private static String url = "jdbc:mysql://localhost/phpmyadmin/db_structure.db=bd_sistema_abc";
    private static String usuario="root";
    private static String contraseña="";
    
    public static Connection conectar(){
        Connection conexion = null; 
        try{
            Class.forName("con.mysql.jdbc.Driver"); 
            conexion = DriverManager.getConnection(url, usuario, contraseña);
            System.out.println("Conexion establecida");
        } catch (Exception e) {
            System.out.println("error: "+e);
        }
        return conexion;
    }
    
}
