package Domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import DataAccess.DataModel;

public class Passenger extends Person {

	private List<Reservation> reservations;

	public Passenger(String fName, String lName, String eMail, LocalDate DOB) {
		super(fName, lName, eMail, DOB);
		this.reservations = new ArrayList<>();

		DataModel.passengerDataModel.addEntity(this);
	}

	public List<Reservation> ViewAllReservations() {
		return reservations;
	}
	
	public void CreateReservation(List<FlightInstance> flights) {
		reservations.add(new Reservation(flights));
	}
	
	public void RemoveReservation(String Id) {	
		for(Reservation r : reservations) {
			if(r.getId() == Id) {
				reservations.remove(r);
				DataModel.reservationDataModel.deleteEntity(Id);
			}
		}
	}

}
