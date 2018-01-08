// Authors: Tristen Tulkens, Peter Adamson

public class Engine {

	private String engineSerialNo;
	private int horsePower;
	private boolean hybrid;

	public Engine(String engineSerialNo, int horsePower, boolean hybrid) {

		this.engineSerialNo = engineSerialNo;
		this.horsePower = horsePower;
		this.hybrid = hybrid;

	}

	public String getEngineSerialNo() {

		return engineSerialNo;

	}

	public String toString() {

		return String.format("Engine with Serial Number %s has %d horsepower, hybrid status: %b", engineSerialNo, horsePower, hybrid);

	}

	public int compareToIgnoreCase( Engine engine ) {

		return engineSerialNo.compareToIgnoreCase(engine.getEngineSerialNo());

	}

}
