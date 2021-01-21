package DataAccess;

import java.util.*;
import Domain.Agent;

public class AgentDataModel implements iDataModel {

	private Map<String, Agent> agents = new HashMap<>();
	@Override
	public boolean addEntity(Object obj) {
		if (obj instanceof Agent) {
			Agent agent = (Agent) obj;
			agents.put(agent.getId(), agent);
			return true;
		}
		return false;
	}

	@Override
	public Object getEntity(String Id) {
		return agents.get(Id);
	}

	@Override
	public List getall() {
		return new ArrayList<Agent>(agents.values());
	}

	@Override
	public boolean deleteEntity(String Id) {
		
		if(agents.get(Id) != null) {
		 agents.remove(Id);
		 return true;
		}
		return false;
	}

}
