package mz;

 public class Stock implements DBUtils {
	 
	 	private String quincaillerie;
        private Produit produit;
        private double quantite;
        private int prix;
      
		public Stock(String quincaillerie,Produit p,double q,int prix){
			this.quincaillerie=quincaillerie;
            produit=p;
            quantite=q;
            this.prix=prix;
        }

        public void approvisionne(double quantite) {
            this.quantite+=quantite;
            updateDB("quantite = "+this.quantite);
        }

		public void changerPrix(int prix) {
			setPrix(prix);
			updateDB("prix = "+this.prix);
		}

        public void vend(double quantite) {
            this.quantite-=quantite;
            updateDB("quantite = "+this.quantite);
        }
        
        public boolean addToDB(){
			return DBConnection.Ajouter("stock", "'"+produit+"','"+quincaillerie+"','"+quantite+"',"+prix);
		}
        
        public boolean updateDB(String update){
        	return DBConnection.update("update stock set "+update+" where quincaillerie like '"+quincaillerie+"' and produit like '"+produit+"'");
        }

        public Produit getProduit() {
			return produit;
		}

		public double getQuantite() {
			return quantite;
		}

		public int getPrix() {
			return prix;
		}

		public void setPrix(int prix) {
			this.prix = prix;
		}

		public String getQuincaillerie() {
			return quincaillerie;
		}


    }
