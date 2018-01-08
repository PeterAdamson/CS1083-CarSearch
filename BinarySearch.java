// Authors: Tristen Tulkens, Peter Adamson

public class BinarySearch {

	public int searchCars(Car[] carsToSearch, String choice) {

		int min = 0, max = carsToSearch.length-1, mid = 0;
		boolean found = false;

		while(!found && min <= max) {

			mid = (max+min) / 2;
			if(carsToSearch[mid].getCarSerialNo().equals(choice)) {

				found = true;

			}

			else if(carsToSearch[mid].getCarSerialNo().compareTo(choice) > 0) {

				max = mid - 1;
		
			}

			else {

				min = mid + 1;

			}

		}

		if(found) {

			return mid;

		}

		else {

			return -1;

		}

	}


	public int searchEngines(Car[] enginesToSearch, String choice) {

		int min = 0, max = enginesToSearch.length-1, mid = 0;
		boolean found = false;

		while(!found && min <= max) {

			mid = (max+min) / 2;
			if(enginesToSearch[mid].getEngine().getEngineSerialNo().equals(choice)) {

				found = true;

			}

			else if(enginesToSearch[mid].getEngine().getEngineSerialNo().compareTo(choice) > 0) {

				max = mid - 1;
		
			}

			else {

				min = mid + 1;

			}

		}

		if(found) {

			return mid;

		}

		else {

			return -1;

		}

	}


}
