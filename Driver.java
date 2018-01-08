// Authors: Tristen Tulkens, Peter Adamson

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Car[] cars = { new Car("M1556674", "Mercedes C5", 1950, 5, new Engine("L46675688", 24, true)),
 				new Car("K79903322", "Kia Serato", 2010, 5, new Engine("J3003221", 18, false)),
 				new Car("O86033216", "Toyota Camry", 2015, 5, new Engine("G67778999", 20, true)),
 				new Car("H78710955", "Dodge Caravan", 2012, 7, new Engine("S46633688", 18, false)),
 				new Car("A99927652", "BMW 740 ", 1999, 2, new Engine("T73340911", 24, true))};

		Sort sort = new Sort();
		BinarySearch binarySearch = new BinarySearch();

		sort.sortCars(cars);

		for(int i=0; i<cars.length; i++) {

			System.out.println(cars[i].getCarSerialNo());

		}

		String choice = "";
		
		while(!choice.equals("x") && !choice.equals("X")) {

			System.out.println("Please enter a Car Serial Number to search: ");
			choice = sc.next();

			int result = binarySearch.searchCars(cars, choice);

			if(result >= 0) {

				System.out.printf(cars[result].toString()+"  %nwas found at location " + (result+1) + " in the list %n");

			}

			else {

				System.out.println("A car with the inputted serial number was unable to be found");

			}

			System.out.println("Do you wish to keep searching? (x to quit)");
			choice = sc.next();

		}

		sort.sortEngines(cars);

		for(int i=0; i<cars.length; i++) {

			System.out.println(cars[i].getEngine().getEngineSerialNo());

		}

		choice = "";
		
		while(!choice.equals("x") && !choice.equals("X")) {

			System.out.println("Please enter an Engine Serial Number to search: ");
			choice = sc.next();

			int result = binarySearch.searchEngines(cars, choice);

			if(result >= 0) {

				System.out.printf(cars[result].toString()+"  %nwas found at location " + (result+1) + " in the list %n");

			}

			else {

				System.out.println("A car with the inputted serial number was unable to be found");

			}

			System.out.println("Do you wish to keep searching? (x to quit)");
			choice = sc.next();

		}

	}

}
