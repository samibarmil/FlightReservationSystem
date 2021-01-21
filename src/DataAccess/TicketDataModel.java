package DataAccess;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Domain.Ticket;

public class TicketDataModel implements iDataModel {

	private Map<String, Ticket> tickets = new HashMap<>(); 
	@Override
	public boolean addEntity(Object obj) {
		if (obj instanceof Ticket) {
			Ticket ticket = (Ticket) obj;
			tickets.add(ticket.getId() ,ticket);
			return true;
		}
		return false;
	}

	@Override
	public Object getEntity(String Id) {
		if(tickets.containsKey(Id))
			return tickets.get(Id);
		return null;
	}

	@Override
	public List getall() {
		return new ArrayList<Ticket>(tickets.values());
	}

	@Override
	public boolean deleteEntity(String Id) {
		if(tickets.remove(Id) != null)
			return true;
		return false;
	}

}
