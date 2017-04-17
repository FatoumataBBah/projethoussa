package mz;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;

import javax.swing.JOptionPane;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnection {
	
	private static Connection con;
	private static Statement query;
	private static final String username = "root";
	private static final String password = "";
	private static final String url = "jdbc:mysql://localhost:3306/MPJ";

	
	public static Connection connecter(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection(url,username,password);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
			return null;
		}
	}
	
	public static boolean Ajouter(String table,String values){
		
		try {
			con = connecter();
			String req = "insert into "+table+" values(" +values+")";
			Statement query = con.createStatement();
			query.executeUpdate(req);
			query.close();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
			return false;
		}finally {
			try {
				con.close();
			} catch (Exception e2) {
				JOptionPane.showMessageDialog(null, e2);
				return false;
			}
		}		
		return true;
	}
	
	public static boolean supprimer(String id,String table,String pk){
		
		try {
			con= connecter();
			String req = "delete from "+table+" where "+pk+" like '"+id+"'";
			Statement query = con.createStatement();
			query.executeUpdate(req);
			query.close();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
			return false;
		}finally {
			try {
				con.close();
			} catch (Exception e2) {
				JOptionPane.showMessageDialog(null, e2);
				return false;
			}
		}
		return true;
	}
	
	public static boolean update(String req){
		try {
			con= connecter();
			Statement query = con.createStatement();
			query.executeUpdate(req);
			query.close();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
			return false;
		}finally {
			try {
				con.close();
			} catch (Exception e2) {
				JOptionPane.showMessageDialog(null, e2);
				return false;
			}
		}
		return true;
	}
	
	public static ResultSet execute(String req){
		ResultSet result;
		try{
			con=connecter();
			query = con.createStatement();
			result=query.executeQuery(req);
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, e);
			return null;
		}
		return result;
	}
	
	public static ResultSet getTable(String table){
		ResultSet result ;
		try {
			con= connecter();
			String req = "select * from "+table;
			query = con.createStatement();
			result =query.executeQuery(req);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
			return null;
		}
		return result;
	}
	
	public static void fermer(){
		try {
			query.close();
			con.close();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}
}
