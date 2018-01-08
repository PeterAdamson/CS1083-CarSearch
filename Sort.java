// Authors: Tristen Tulkens, Peter Adamson

public class Sort {

	public void sortCars(Car[] carsToSort) {

		for(int i=0; i<carsToSort.length-1; i++) {

			Car initialCar = carsToSort[i];
			Car tempCar = carsToSort[i];
			int tempIndex = i;

			for(int j=i+1;j<carsToSort.length; j++) {

				if(tempCar.compareToIgnoreCase(carsToSort[j]) > 0) {

					tempIndex = j;
					tempCar = carsToSort[j];

				}	

			}

			carsToSort[i] = carsToSort[tempIndex];
			carsToSort[tempIndex] = initialCar;

		}

	}

	public void sortEngines(Car[] enginesToSort) {

		for(int i=0; i<enginesToSort.length-1; i++) {

			Car initialCar = enginesToSort[i];
			Engine tempEngine = enginesToSort[i].getEngine();
			int tempIndex = i;

			for(int j=i+1;j<enginesToSort.length; j++) {

				if(tempEngine.compareToIgnoreCase(enginesToSort[j].getEngine()) > 0) {

					tempIndex = j;
					tempEngine = enginesToSort[j].getEngine();

				}	

			}

			enginesToSort[i] = enginesToSort[tempIndex];
			enginesToSort[tempIndex] = initialCar;

		}

	}



}
