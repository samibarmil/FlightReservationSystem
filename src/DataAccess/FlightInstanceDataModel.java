package DataAccess;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Domain.Airport;
import Domain.FlightInstance;

public class FlightInstanceDataModel implements iDataModel {

	private Map<String, FlightInstance> flightInstances = new HashMap<>();

	@Override
	public boolean addEntity(Object obj) {
		if (obj instanceof FlightInstance) {
			FlightInstance flightInstance = (FlightInstance) obj;
			flightInstances.put(flightInstance.getId(), flightInstance);
			return true;
		}
		return false;
	}

	@Override
	public Object getEntity(String Id) {
		if (flightInstances.containsKey(Id))
			return flightInstances.get(Id);
		return null;
	}

	@Override
	public List<FlightInstance> getall() {
		return new ArrayList<FlightInstance>(flightInstances.values());
	}

	@Override
	public boolean deleteEntity(String Id) {
		if (flightInstances.remove(Id) != null)
			return true;
		return false;
	}
	
	@Override
	public boolean UpdateEntity(Object obj) {
		if (obj instanceof FlightInstance) {
			FlightInstance flightInstance = (FlightInstance) obj;
			flightInstances.put(flightInstance.getId(), flightInstance);
			return true;
		}
		return false;
	}

}
