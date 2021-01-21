package DataAccess;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Domain.Airport;
import Domain.Pilot;

public class PilotDataModel implements iDataModel {
	private Map<String, Pilot> pilots = new HashMap<>(); 
	@Override
	public boolean addEntity(Object obj) {
		if (obj instanceof Pilot) {
			Pilot pilot = (Pilot) obj;
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
	public List<Pilot> getall() {
		return new ArrayList<Pilot>(pilots.values());
	}

	@Override
	public boolean deleteEntity(String Id) {
		if(pilots.remove(Id) != null)
			return true;
		return false;
	}
	
	@Override
	public boolean UpdateEntity(Object obj) {
		if (obj instanceof Pilot) {
			Pilot pilot = (Pilot) obj;
			pilots.put(pilot.getId(), pilot);
			return true;
		}
		return false;
	}

}
