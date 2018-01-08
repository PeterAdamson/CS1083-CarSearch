// Authors: Tristen Tulkens, Peter Adamson

public class Car {

	private String carSerialNo, model;
	private int year, NoP;
	private Engine engine;

	public Car(String carSerialNo, String model, int year, int NoP, Engine engine) {

		this.carSerialNo = carSerialNo;
		this.model = model;
		this.year = year;
		this.NoP = NoP;
		this.engine = engine;

	}

	public String getCarSerialNo() {

		return carSerialNo;

	}

	public Engine getEngine() {

		return engine;

	}

	public String toString() {

		return String.format("Car with serial number %s is a %s of year %d %nthat can hold %d passengers %n" +engine.toString() + "", carSerialNo, model, year, NoP);

	}

	public int compareToIgnoreCase( Car car ) {

		return carSerialNo.compareToIgnoreCase(car.getCarSerialNo());

	}


}
