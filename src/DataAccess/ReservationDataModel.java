package DataAccess;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Domain.Airport;
import Domain.Reservation;

public class ReservationDataModel implements iDataModel {
	
	private Map<String, Reservation> reservations = new HashMap<>(); 
	@Override
	public boolean addEntity(Object obj) {
		if (obj instanceof Reservation) {
			Reservation pilot = (Reservation) obj;
			reservations.put(pilot.getId() ,pilot);
			return true;
		}
		return false;
	}

	@Override
	public Object getEntity(String Id) {
		if(reservations.containsKey(Id))
			return reservations.get(Id);
		return null;
	}

	@Override
	public List<Reservation> getall() {
		return new ArrayList<Reservation>(reservations.values());
	}

	@Override
	public boolean deleteEntity(String Id) {
		if(reservations.remove(Id) != null)
			return true;
		return false;
	}
	
	@Override
	public boolean UpdateEntity(Object obj) {
		if (obj instanceof Reservation) {
			Reservation reservation = (Reservation) obj;
			reservations.put(reservation.getId(), reservation);
			return true;
		}
		return false;
	}

}
