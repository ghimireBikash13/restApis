package com.dtos;

import java.util.List;

public class AirLinesDto {

	private String flightName;
	private String flightNumber;
	private String source;
	private String destination;

	List<CustomerDto> customers;

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public List<CustomerDto> getCustomers() {
		return customers;
	}

	public void setCustomers(List<CustomerDto> customers) {
		this.customers = customers;
	}

	@Override
	public String toString() {
		return "AirLinesDto [flightName=" + flightName + ", flightNumber=" + flightNumber + ", source=" + source
				+ ", destination=" + destination + ", customers=" + customers + "]";
	}

}
