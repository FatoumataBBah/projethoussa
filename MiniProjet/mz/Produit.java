package mz;

public abstract class Produit {

    protected String nom;
    
    public Produit(String nom){
    	this.nom=nom;
    }

    public String toString(){
    	return nom;
    }

	public String getNom() {
		return nom;
	}
	
	public boolean equals(Produit p){
		return nom.equals(p.nom);
	}

	public static Produit valueOf(String p) {
		switch (p.toUpperCase()) {
		case "AMPOULE":
			return new Ampoule();
		case "CIMENT":
			return new Ciment();
		case "CLOU":
			return new Clou();
		case "CARREAU":
			return new Carreau();
		case "LAVABO":
			return new Lavabo();
		case "MARTEAU":
			return new Marteau();
		case "PEINTURE":
			return new Peinture();
		case "ROBINET":
			return new Robinet();
		case "TUYAU":
			return new Tuyau();
		case "TOURNEVIS":
			return new Tournevis();
		default:
			return null;
		}
	}
    

}