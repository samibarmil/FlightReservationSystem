package Domain;


import java.util.ArrayList;
import java.util.List;

public class Crew extends Person {
	
	//child class Crew and super class person
	//Crew is a person
	//each Crew has at least 1 or more flight instance in a Bidirectional relation 
	private  List<FlightInstance>flightinstance = new ArrayList<FlightInstance>();
		
	
	


}
