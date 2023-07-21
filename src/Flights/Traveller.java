package Flights;

import java.time.LocalDate;

public class Traveller
{
	private String Name;
	private Long Mobile;
	private String email;
	private String FlightId;
	private LocalDate Date;
	public Traveller(String name, long mobile, String email, String flightId, LocalDate date) {
		super();
		Name = name;
		Mobile = mobile;
		this.email = email;
		FlightId = flightId;
		Date = date;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Long getMobile() {
		return Mobile;
	}
	public void setMobile(Long mobile) {
		Mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFlightId() {
		return FlightId;
	}
	public void setFlightId(String flightId) {
		FlightId = flightId;
	}
	public LocalDate getDate() {
		return Date;
	}
	public void setDate(LocalDate date) {
		Date = date;
	}
	
	

}
