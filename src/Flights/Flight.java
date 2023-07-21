package Flights;

public class Flight
{
	private String Id;
	private String Source;
	private String Destination;
	private Double Fare;
	private int TotalSeats;
	private int AvailableSeats;
	private String ArrivalTime;
	private String DeptTime;
	private String CompanyName;
	public Flight(String id, String source, String destination, double fare, int totalSeats, int availableSeats,
			String arrivalTime, String deptTime, String companyName) {
		super();
		this.Id = id;
		this.Source = source;
		this.Destination = destination;
		this.Fare = fare;
		this.TotalSeats = totalSeats;
		this.AvailableSeats = availableSeats;
		this.ArrivalTime = arrivalTime;
		this.DeptTime = deptTime;
		this.CompanyName = companyName;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		this.Id = id;
	}
	public String getSource() {
		return Source;
	}
	public void setSource(String source) {
		this.Source = source;
	}
	public String getDestination() {
		return Destination;
	}
	public void setDestination(String destination) {
		this.Destination = destination;
	}
	public Double getFare() {
		return Fare;
	}
	public void setFare(Double fare) {
		this.Fare = fare;
	}
	public int getTotalSeats() {
		return TotalSeats;
	}
	public void setTotalSeats(int totalSeats) {
		this.TotalSeats = totalSeats;
	}
	public int getAvailableSeats() {
		return AvailableSeats;
	}
	public void setAvailableSeats(int availableSeats) {
		this.AvailableSeats = availableSeats;
	}
	public String getArrivalTime() {
		return ArrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.ArrivalTime = arrivalTime;
	}
	public String getDeptTime() {
		return DeptTime;
	}
	public void setDeptTime(String deptTime) {
		this.DeptTime = deptTime;
	}
	public String getCompanyName() {
		return CompanyName;
	}
	public void setCompanyName(String companyName) {
		this.CompanyName = companyName;
	}
	
	
	
	

}
