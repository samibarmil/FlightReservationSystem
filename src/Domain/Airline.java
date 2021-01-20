package Domain;




import java.util.ArrayList;
import java.util.List;

public class Airline {
	
	//a one To-many relation of Airline to flight and 
	private List<Flight>flight = new ArrayList<Flight>();
	private List<Airline>airlines = new ArrayList<Airline>(); 


}
