package parrot;

public class NorwegianParrot extends Parrot {
    public NorwegianParrot(double voltage, boolean isNailed) {
		super();
		this.voltage = voltage;
		this.isNailed = isNailed;
	}

	private final double voltage;
    private final boolean isNailed;

	public double getSpeed() {
	    return  (isNailed) ? 0 : super.getBaseSpeed(voltage);
	}

	public String getCry() {
	    return  voltage > 0 ? "Bzzzzzz" : "...";
	  
	}

}
