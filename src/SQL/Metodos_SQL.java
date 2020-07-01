/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Adriana
 */
public class Metodos_SQL {
    private static Connection conexion; 
    private static PreparedStatement sentencia_preparada; 
    private static ResultSet resultado; 
    
    public void guardar_datos(String nommas, String tipo, String dueno, String duenoapp, String duenoapm, 
            String direccion, int telefono){
        try {
            conexion = Conexion_bd.conectar(); 
        }catch(Exception e){
            
        }
    }
}
