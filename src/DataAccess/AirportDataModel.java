package DataAccess;

import java.util.*;

import javax.print.attribute.HashAttributeSet;

import Domain.Airline;
import Domain.Airport;

public class AirportDataModel implements iDataModel {

	private Map<String, Airport> airports = new HashMap<>();

	@Override
	public boolean addEntity(Object obj) {
		if (obj instanceof Airport) {
			Airport airport = (Airport) obj;
			airports.put(airport.getId(), airport);

			return true;
		}
		return false;
	}

	@Override
	public Object getEntity(String Id) {
		if (airports.containsKey(Id))
			return airports.get(Id);
		return null;
	}

	@Override
	public List getall() {
		return new ArrayList<Airport>(airports.values());
	}

	@Override
	public boolean deleteEntity(String Id) {
		if (airports.remove(Id) != null)
			return true;
		return false;
	}

	public Airport getAirportByCode(String Code) {
		for (Airport airport : airports.values()) {
			if (airport.getCode() == Code)
				return airports.get(airport.getId());
		}
		return null;
	}

}
