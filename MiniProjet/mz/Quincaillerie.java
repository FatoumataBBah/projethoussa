package mz;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;



public class Quincaillerie {

    private String nom;
    private String mdp;
    private ArrayList<Stock> stock;
    private ArrayList<Vente> vente;
    private ArrayList<Approvisionnement> achat;


    public Stock getStock(Produit p) {
        for (Stock s:stock) {
            if(s.getProduit().equals(p))
            	return s;
        }
        return null;
    }

    public void addStock(Produit p, int prix,int quantite) {
    	Stock s = new Stock(nom,p, quantite, prix);
       	stock.add(s);
       	s.addToDB();
    }
    
    public void approvisionne(Produit p,double q){
    	getStock(p).approvisionne(q);
    	Approvisionnement a = new Approvisionnement(nom, p, q);
    	//achat.add(a);
    	a.addToDB();
    }
    
    public void vend(Produit p,double quantite){
    	getStock(p).vend(quantite);
    	Vente v = new Vente(nom, p, quantite);
    	//vente.add(v);
    	v.addToDB();
    }
    
    public ArrayList<Stock> loadStock(){
    	ResultSet result = DBConnection.execute("select * from stock where quincaillerie ='"+nom+"'");
    	ArrayList<Stock> liste = new ArrayList<Stock>();
    	try {
			while (result.next()) {
				String p = result.getString("produit");
				double q = result.getDouble("quantite");
				int prix = result.getInt("prix");
				liste.add(new Stock(nom, Produit.valueOf(p), q, prix));
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
			return null;			
		}finally {
			try {
				result.close();
			} catch (SQLException e) {
				JOptionPane.showMessageDialog(null, e);
			}
			try {
				result.close();
			} catch (SQLException e) {
				JOptionPane.showMessageDialog(null, e);
			}
			DBConnection.fermer();
		}
    	stock=liste;
    	return liste;
    }

    public void changerPrix(Produit p, int prix) {
      getStock(p).changerPrix(prix);
    }

	public String getNom() {
		return nom;
	}

	public String getMdp() {
		return mdp;
	}

	public ArrayList<Stock> getStock() {
		return stock;
	}

	public ArrayList<Vente> getVente() {
		return vente;
	}

	public ArrayList<Approvisionnement> getAchat() {
		return achat;
	}
	
	public static Quincaillerie valueOf(String nom){
		ResultSet result = DBConnection.execute("select * from quincaillerie where nom like '"+nom+"'");
		try {
			if(!result.last())
				return null;
			String mdp= result.getString("mdp");
			Quincaillerie q = new Quincaillerie(nom,mdp);
			q.loadStock();
		return q;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
			return null;
		}finally {
			try {
				result.close();
			} catch (SQLException e) {
				JOptionPane.showMessageDialog(null, e);
			}
			DBConnection.fermer();
		}
	}

	private Quincaillerie(String nom, String mdp) {
		this.nom = nom;
		this.mdp = mdp;
	}
}