package Domain;




import java.util.ArrayList;
import java.util.List;

public class Airline {
	private String id;
	private String code;
	private String name;
	private String history;
	
	
	//a one To-many relation of Airline to flight and 
	private List<Flight>flight = new ArrayList<Flight>();
	private List<Airline>airlines = new ArrayList<Airline>();
	public Airline(String id, String code, String name, String history) {
		super();
		this.id = id;
		this.code = code;
		this.name = name;
		this.history = history;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public List<Flight> getFlight() {
		return flight;
	}
	public void setFlight(List<Flight> flight) {
		this.flight = flight;
	}
	public List<Airline> getAirlines() {
		return airlines;
	}
	public void setAirlines(List<Airline> airlines) {
		this.airlines = airlines;
	}
	
	@Override
	public String toString() {
		return "Airline [id=" + id + ", code=" + code + ", name=" + name + ", history=" + history + "]";
	} 


	
	
	
}
