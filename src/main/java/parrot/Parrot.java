package parrot;

public abstract class Parrot {
	protected Parrot() {}

	protected  abstract double getSpeed();

    protected double getBaseSpeed(double voltage) {
        return Math.min(24.0, voltage * getBaseSpeed());
    }

    protected double getLoadFactor() {
        return 9.0;
    }

    protected double getBaseSpeed() {
        return 12.0;
    }

    protected  abstract String getCry();
}
