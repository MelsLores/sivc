/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sivc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author melan
 */
public class conexion {
    String bd="sql5489935",url="jdbc:mysql://sql5.freemysqlhosting.net:3306/",user="sql5489935",password="9xgEgWJdGc",driver="com.mysql.cj.jdbc.Driver";
    Connection cx;
    
    public conexion(){
    
    }
    
    public Connection conectar(){
        try{
            Class.forName(driver);
            cx=DriverManager.getConnection(url+bd,user,password);
            System.out.println("SE CONECTÓ A LA BD "+bd);
            
        }catch(ClassNotFoundException |SQLException ex){
            System.out.println("NO SE CONECTÓ A LA BD "+bd);
            //Logger.getLogger(conexion.class.getName()).log(Level.SEVERE,null,ex);
        }
        return cx;
    }
    
    public void desconectar(){
        try{
            cx.close();
        }catch(SQLException ex){
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
    
    public static void main(String[] args){

    }
}
