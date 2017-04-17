/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quingestion;
import java.sql.*;
import java.sql.SQLException;

/**
 *
 * @author jedda
 */
public class Connxion {
  // public static void main(String args[]){
        //con=Connecter();
    //}
    //static Connection con;
    //public static Connection Connecter(){
    Connection con;
    public Connxion(){
    
    try{
        Class.forName("com.mysql.jdbc.Driver");
   // System.out.println("la connection marche");
    }   catch (ClassNotFoundException e) {
           System.err.println(e);
        }
try{
    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mpj","root","");
    System.out.println("la connexion marche");
}       
catch (SQLException e) { System.err.println(e);}
        //return null;
    }
   /* Connection obtenirconnexion(){
        return con;
    }*/

    /*Connecter(){
        throw new UnsupportedOperationException("Not supported yet."); 
       //To change body of generated methods, choose Tools | Templates.
    }
      */
 Connection ObtenirConnexion(){
     return con;
 }
   
}
