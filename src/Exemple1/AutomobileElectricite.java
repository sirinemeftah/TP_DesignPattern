package Exemple1;

public class AutomobileElectricite extends Automobile {
	public AutomobileElectricite(String m, String c, int p, int s) {
		super(m, c, p, s);
	}
	public void afficherCaracteristiques() {
		System.out.println("Modèle : " + modéle);
		System.out.println("Couleur : " + couleur);
		System.out.println("Puissance : " + puissance );
		System.out.println("Espace : " + espace);
	}
}