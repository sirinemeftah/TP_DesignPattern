package strategy;

public class Article {
	private String nom;
	private int prix;
	private ModeDePaiement modeDePaiement;

	public Article(String nom, int prix) {
	    this.nom = nom;
	    this.prix = prix;
	   
	}

	public String getNom() {
	    return this.nom;
	}

	public int getPrix() {
	    return this.prix;
	}

	public void payer() {
	    modeDePaiement.payer(prix);
	}
}
