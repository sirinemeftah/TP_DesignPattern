package Exemple1;

public abstract class Automobile {
	protected String mod�le;
	protected String couleur;
	protected int puissance;
	protected int espace;
	public Automobile(String m, String c, int p, int e) {
		mod�le = m ;
		couleur = c ;
		puissance = p ;
		espace = e ;
		}
		public abstract void afficherCaracteristiques();
}
