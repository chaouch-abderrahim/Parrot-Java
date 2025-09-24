package parrot;

public class AfricanParrot extends Parrot{

	private final int numberOfCoconuts;

	public AfricanParrot(int numberOfCoconuts) {
		super();
		this.numberOfCoconuts = numberOfCoconuts;
	}

	public double getSpeed() {
	    return Math.max(0, super.getBaseSpeed() - super.getLoadFactor() * numberOfCoconuts);

	}

	public String getCry() {
	    return  "Sqaark!";
	}

	
	

}
