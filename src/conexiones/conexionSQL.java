/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexiones;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan Maza
 */
public class conexionSQL {
    Connection con;
    
    public Connection conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/proyecColegio","root","adidas2005");
            JOptionPane.showMessageDialog(null,"CONEXION EXITOSA");
        }catch (Exception e)
        {
                    JOptionPane.showMessageDialog(null,"ERROR EN LA CONEXION");
                            }
            return con;
    }    
    
}
