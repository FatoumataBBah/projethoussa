package mz;

public class Vente implements DBUtils {

        public Vente(String q, Produit p, double nb) {
            quantite=nb;
            date = new Date();
            quincaillerie = q;
            produit = p;
        }

        private String quincaillerie;
        private Produit produit;
        private Date date;
        private double quantite;
        
        
		public String getQuincaillerie() {
			return quincaillerie;
		}
		public Produit getProduit() {
			return produit;
		}
		public Date getDate() {
			return date;
		}
		public double getQuantite() {
			return quantite;
		}
		
		public boolean addToDB(){
			return DBConnection.Ajouter("vente", "'"+quincaillerie+"','"+produit+"','"+date+"',"+quantite);
		}

    }
