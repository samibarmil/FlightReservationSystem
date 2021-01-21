package business;

import Domain.*;
import DataAccess.DataModel;

public final class FlightBusiness {

	private FlightBusiness() {
	}

	public static void FlightsBetween(Airport departure, Airport destination) {
		for (Flight flight : DataModel.flightDataModel.getall()) {
			if (flight.getDepartureAirport() == departure && flight.getArrivalAirport() == destination) {
				System.out.println(flight);
			}
		}
	}

}
