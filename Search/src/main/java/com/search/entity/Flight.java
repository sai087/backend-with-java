package com.search.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "search")
public class Flight {
	
  @Id
	long id;
	
	String flightNumber;
	String origin;
	String destination;
	String flightDate;
	
//	public Flight() {
//		super();
//	}

	public Flight(long id, String flightNumber, String origin, String destination, String flightDate) {
		super();
		this.id = id;
		this.flightNumber = flightNumber;
		this.origin = origin;
		this.destination = destination;
		this.flightDate = flightDate;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getFlightDate() {
		return flightDate;
	}

	public void setFlightDate(String flightDate) {
		this.flightDate = flightDate;
	}

//	@Override
//	public String toString() {
//		return "Flight [id=" + id + ", flightNumber=" + flightNumber + ", origin=" + origin + ", destination="
//				+ destination + ", flightDate=" + flightDate + ", getId()=" + getId() + ", getFlightNumber()="
//				+ getFlightNumber() + ", getOrigin()=" + getOrigin() + ", getDestination()=" + getDestination()
//				+ ", getFlightDate()=" + getFlightDate() + "]";
//	}
//	
	
	
}
