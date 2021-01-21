package DataAccess;

import java.util.ArrayList;
import java.util.List;
import Domain.Agent;

public class AgentDataModel implements iDataModel {

	private List<Agent> agents = new ArrayList<Agent>();
	@Override
	public boolean addEntity(Object obj) {
		if (obj instanceof Agent) {
			Agent agent = (Agent) obj;
			agents.add(agent);
			return true;
		}
		return false;
	}

	@Override
	public Object getEntity(String Id) {
		for(Agent agent : agents)
			if(agent.getID() == Id)
				return agent;
		System.err.println("No such Agent with given Id");
		return null;
	}

	@Override
	public List getall() {
		return agents;
	}

	@Override
	public boolean deleteEntity(String Id) {
		
		return agents.remove(getEntity(Id));
	}

}
