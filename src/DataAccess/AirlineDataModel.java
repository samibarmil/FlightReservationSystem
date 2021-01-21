package DataAccess;

import java.util.*;

import Domain.Agent;
import Domain.Airline;

public class AirlineDataModel implements iDataModel{

	private Map<String, Airline> airlines = new HashMap<>();
	
	@Override
	public boolean addEntity(Object obj) {
		if (obj instanceof Airline) {
			Airline airline = (Airline) obj;
			airlines.add(airline.getId(), airline);
			return true;
		}
		return false;
	}

	@Override
	public Object getEntity(String Id) {
		for(Airline airline : airlines.values())
			if(airline.getId() == Id)
				return airline;
		System.err.println("No such Agent with given Id");
		return null;
	}

	@Override
	public List getall() {
		return new ArrayList<Airline>(airlines.values());
	}

	@Override
	public boolean deleteEntity(String Id) {
		if(airlines.containsKey(Id)) {
			airlines.remove(Id);
			return true;
		}
		
		return false;
			
	}

}
