package DataAccess;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Domain.Airport;
import Domain.Passenger;

public class PassengerDataModel implements iDataModel {

	private Map<String, Passenger> passengers = new HashMap<>();

	@Override
	public boolean addEntity(Object obj) {
		if (obj instanceof Passenger) {
			Passenger passenger = (Passenger) obj;
			passengers.put(passenger.getId(), passenger);
			return true;
		}
		return false;
	}

	@Override
	public Object getEntity(String Id) {
		if (passengers.containsKey(Id))
			return passengers.get(Id);
		return null;
	}

	@Override
	public List<Passenger> getall() {
		return new ArrayList<Passenger>(passengers.values());
	}

	@Override
	public boolean deleteEntity(String Id) {
		if (passengers.remove(Id) != null)
			return true;
		return false;
	}
	
	@Override
	public boolean UpdateEntity(Object obj) {
		if (obj instanceof Passenger) {
			Passenger passenger = (Passenger) obj;
			passengers.put(passenger.getId(), passenger);
			return true;
		}
		return false;
	}

}
