package business;

import Domain.Airport;
import DataAccess.*;

public final class AirportBusiness {

	private AirportBusiness() {
	}
	
	public static void viewAllAirports() {
		
		for(Airport a : DataModel.airportDataModel.getall() ) {
			System.out.println(a);
		}
	}
}
