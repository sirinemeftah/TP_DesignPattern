package Exemple1;

public class FabriqueV�hiculeEssence implements FabriqueV�hicule {
	public Automobile creerAutomobile() {
		return new AutomobileEssence("BMW", "gris", 800, 500);
	}
	public Scooter creerScooter() {
		return new ScooterEssence("e-Scooter", "bleu", 10);
	}
	}