package Domain;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import DataAccess.DataModel;


public class Airline {

	private final String id;
	private String code;
	private String name;
	private String history;
	private List<Flight> flights;

	public Airline(String code, String name, String history) {
		this.id = UUID.randomUUID().toString();
		this.code = code;
		this.name = name;
		this.history = history;
		flights = new ArrayList<>();
		
		DataModel.airLineDataModel.addEntity(this);

	}

	public String getId() {
		return id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHistory() {
		return history;
	}

	public void setHistory(String history) {
		this.history = history;
	}

	public List<Flight> getFlights() {
		return flights;
	}


}
