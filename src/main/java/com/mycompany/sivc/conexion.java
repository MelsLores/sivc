/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sivc;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author melan
 */
public class conexion {
    Connection conexion = null;
        
        String user="usersql",contra="1234",bd="sivc",ip="localhost",port="1433";
        
        String cadena="jdbc:sqlserver://"+ip+":"+port+"/"+bd;
        
        public Connection con(){
            
            try{
                cadena = "jdbc:sqlserver://"+ip+":"+port+";database="+bd;
                conexion = DriverManager.getConnection(cadena,user,contra);
                JOptionPane.showMessageDialog(null, "Se conectó correctamente a la base de datos.");
            }catch(Exception e){
                
                JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos, error: "+e.toString());
            }
            
            return(conexion);
        }
}
