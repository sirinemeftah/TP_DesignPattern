package Exemple1;

public class FabriqueVehiculeElecticite implements FabriqueV�hicule {
	public Automobile creerAutomobile() {
	return new AutomobileElectricite("BMW", "Noir", 800, 500);
	}
	public Scooter creerScooter() {
	return new ScooterElectricite("e-Scooter", "gris", 10);
	}
}