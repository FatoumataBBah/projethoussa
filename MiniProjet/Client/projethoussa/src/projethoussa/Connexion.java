/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projethoussa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author TOSHIBA
 */
public class Connexion {
     Connection conn;
     public Connexion(){
         
        try {
            Class.forName("com.mysql.jdbc.Driver");
        }catch (ClassNotFoundException e){;}
        try{
            conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/mpj","root","");
         
        }
        catch(SQLException e){
             JOptionPane.showMessageDialog(null,e);
            
        }
       
     }
     Connection Getcon()
             
     {
         return conn;
     }
     }
        
    

