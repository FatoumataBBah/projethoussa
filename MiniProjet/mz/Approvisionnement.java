package mz;

public class Approvisionnement implements DBUtils {

        public Approvisionnement(String q, Produit p, double q2) {
            quantite=q2;
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
			return DBConnection.Ajouter("approvisionnement", "'"+produit+"','"+quincaillerie+"','"+date+"',"+quantite);
		}

    }
