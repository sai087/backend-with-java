package com.book.enity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection="BookingRecords")
public class BookingRecord {
	
	@Id
	String id;
    
    private String flightNumber;
    private String origin;
    private String destination;
    private String flightDate;
    private String bookingDate;
	
//    public BookingRecord() {
//		super();
//	}

	public BookingRecord(String id, String flightNumber, String origin, String destination, String flightDate,
			String bookingDate) {
		super();
		this.id = id;
		this.flightNumber = flightNumber;
		this.origin = origin;
		this.destination = destination;
		this.flightDate = flightDate;
		this.bookingDate = bookingDate;
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	public String getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}

//	@Override
//	public String toString() {
//		return "BookingRecord [id=" + id + ", flightNumber=" + flightNumber + ", origin=" + origin + ", destination="
//				+ destination + ", flightDate=" + flightDate + ", bookingDate=" + bookingDate + ", getId()=" + getId()
//				+ ", getFlightNumber()=" + getFlightNumber() + ", getOrigin()=" + getOrigin() + ", getDestination()="
//				+ getDestination() + ", getFlightDate()=" + getFlightDate() + ", getBookingDate()=" + getBookingDate()
//				+ "]";
//	}
//  	

}
