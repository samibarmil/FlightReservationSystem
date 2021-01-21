package DataAccess;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Domain.Reservation;

public class ReservationDataModel implements iDataModel {
	
	private Map<String, Reservation> pilots = new HashMap<>(); 
	@Override
	public boolean addEntity(Object obj) {
		if (obj instanceof Reservation) {
			Reservation pilot = (Reservation) obj;
			pilots.put(pilot.getId() ,pilot);
			return true;
		}
		return false;
	}

	@Override
	public Object getEntity(String Id) {
		if(pilots.containsKey(Id))
			return pilots.get(Id);
		return null;
	}

	@Override
	public List getall() {
		return new ArrayList<Reservation>(pilots.values());
	}

	@Override
	public boolean deleteEntity(String Id) {
		if(pilots.remove(Id) != null)
			return true;
		return false;
	}

}
