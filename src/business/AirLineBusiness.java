package business;

import java.util.*;

import DataAccess.DataModel;
import Domain.Airline;
import Domain.Flight;

public final class AirLineBusiness {

	// View list of airlines flying out of an airport (search by airport three
	// letter code)

	// Airline has list of flights
	// Flight has departure and arrival airports
	// Search by airport three letter code

	private AirLineBusiness() {
	}
	
	public static void airlinesFlyingOutFromSpecificAirport(String airportCode) {

		List<Flight> allFlights = DataModel.flightDataModel.getall();
		List<Airline> allAirLines = DataModel.airLineDataModel.getall();

		List<Flight> flightsOutOfAnAirport = new ArrayList<>();
		List<Airline> airLinesOutOfAnAirport = new ArrayList<>();

		// Get the list of flights that depart from a specific airport
		for (Flight f : allFlights) {
			if (f.getDepartureAirport().getCode().equals(airportCode))
				flightsOutOfAnAirport.add(f);
		}

		boolean airLineFound;
		//
		for (Airline a : allAirLines) {
			airLineFound = false;
			for (Flight f : a.getFlights()) { // Get the whole list of flights in each Airline
				if (airLineFound == true)
					break; // It breaks once an airline is found
				for (Flight fo : flightsOutOfAnAirport) // To check if
					if (f.getId() == fo.getId()) { // Check it's one of the departure flights we have to get it's
													// airline
						airLinesOutOfAnAirport.add(a);
						airLineFound = true;
						break;
					}
			}
		}
		for (Airline a : airLinesOutOfAnAirport)
			System.out.print(a.getCode() + ",");
	}

}
