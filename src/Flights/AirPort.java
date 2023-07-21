package Flights;

import java.util.ArrayList;


@SuppressWarnings("unused")
public class AirPort
{
	private String city;
	ArrayList<Flight> flights;
	ArrayList<Traveller> travellers ;
	public AirPort() {
		super();
	}
	public AirPort(String city, ArrayList<Flight> flights, ArrayList<Traveller> travellers) {
		super();
		this.city = city;
		this.flights = flights;
		this.travellers = travellers;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public ArrayList<Flight> getFlights() {
		return flights;
	}
	public void setFlights(ArrayList<Flight> flights) {
		this.flights = flights;
	}
	public ArrayList<Traveller> getTravellers() {
		return travellers;
	}
	public void setTravellers(ArrayList<Traveller> travellers) {
		this.travellers = travellers;
	}
	
	public boolean addFlight(Flight flight) {

        if(!flights.contains(flight)) {

        	flights.add(flight);
        	return true;

        }
		return false;

        

    }
	
	public ArrayList<Flight> searchFlightsBySourceAndDestination(String source,String destination){

        ArrayList<Flight> searchResults = new ArrayList<>();

        for(Flight fly: flights) {

            if(fly.getDestination().equals(destination) && fly.getSource().equals(source)) {

                searchResults.add(fly);

            }

        }

        return searchResults;
    }
	
	public void bookTicket(String flightId, Traveller travel)
	{

        for(Flight fly:flights) 

            if(fly.getId()==flightId && fly.getAvailableSeats()>=1) 

                fly.setAvailableSeats(fly.getAvailableSeats()-1);
            	travellers.add(travel);    }
	
	
	
}

