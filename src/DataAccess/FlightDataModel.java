package DataAccess;

import java.util.*;

import Domain.Flight;

public class FlightDataModel implements iDataModel {

	private Map<String, Flight> flights = new HashMap<>(); 
	@Override
	public boolean addEntity(Object obj) {
		if (obj instanceof Flight) {
			Flight flight = (Flight) obj;
			flights.put(flight.getId() ,flight);
			return true;
		}
		return false;
	}

	@Override
	public Object getEntity(String Id) {
		if(flights.containsKey(Id))
			return flights.get(Id);
		return null;
	}

	@Override
	public List getall() {
		return new ArrayList<Flight>(flights.values());
	}

	@Override
	public boolean deleteEntity(String Id) {
		if(flights.remove(Id) != null)
			return true;
		return false;
	}
}
