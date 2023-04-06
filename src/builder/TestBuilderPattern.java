package builder;

public class TestBuilderPattern {
	public static void main(String[] args) {
	ComputerBuilder computer1 = new ComputerBuilder("500 GB", "8 GB");
			computer1.setGraphicsCardEnabled(true);
			computer1.setBluetoothEnabled(false);
			
	Computer computer = computer1.build();
	System.out.println("Computer HDD: " + computer.getHDD());
	System.out.println("Computer RAM: " + computer.getRAM());
	System.out.println("Computer graphics card enabled: " +
	computer.isGraphicsCardEnabled());
	System.out.println("Computer Bluetooth enabled: " + computer.isBluetoothEnabled());
	}
}