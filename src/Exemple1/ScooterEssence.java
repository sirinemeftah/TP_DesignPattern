package Exemple1;

public class ScooterEssence extends Scooter {
	public ScooterEssence(String model, String color, int power) {
		super(model, color, power);
	}
	public void afficherCaracteristiques() {
		System.out.println("Modèle : " + model);
		System.out.println("Couleur : " + color);
		System.out.println("Puissance : " + power + " ch");
	}
	
}