package DataAccess;

import java.util.*;

import Domain.Crew;

public class CrewDataModel implements iDataModel {

	private Map<String, Crew> crews = new HashMap<>(); 
	@Override
	public boolean addEntity(Object obj) {
		if (obj instanceof Crew) {
			Crew crew = (Crew) obj;
			crews.put(crew.getId() ,crew);
			return true;
		}
		return false;
	}

	@Override
	public Object getEntity(String Id) {
		if(crews.containsKey(Id))
			return crews.get(Id);
		return null;
	}

	@Override
	public List<Crew> getall() {
		return new ArrayList<Crew>(crews.values());
	}

	@Override
	public boolean deleteEntity(String Id) {
		if(crews.remove(Id) != null)
			return true;
		return false;
	}

}
