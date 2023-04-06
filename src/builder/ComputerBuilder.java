package builder;

public class ComputerBuilder {
    //required parameters
     String HDD;
     String RAM;
    //optional parameters
    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;

    public ComputerBuilder(String HDD, String RAM) {
        this.HDD = HDD;
        this.RAM = RAM;
    }

    public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
        this.isGraphicsCardEnabled = isGraphicsCardEnabled;
        return this;
    }

    public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
        this.isBluetoothEnabled = isBluetoothEnabled;
        return this;
    }
    
    public boolean isGraphicsCardEnabled() {
		return isGraphicsCardEnabled;
	}

	public boolean isBluetoothEnabled() {
		return isBluetoothEnabled;
	}

	public Computer build() {
        return new Computer(this);
    }
}
