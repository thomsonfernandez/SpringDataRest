package com.datarest.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Flights {

	@Id
	@GeneratedValue
	private String flightNumber;
	private String arrivalairport;
	private String departureairport;
	
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getArrivalairport() {
		return arrivalairport;
	}
	public void setArrivalairport(String arrivalairport) {
		this.arrivalairport = arrivalairport;
	}
	public String getDepartureairport() {
		return departureairport;
	}
	public void setDepartureairport(String departureairport) {
		this.departureairport = departureairport;
	}
	@Override
	public String toString() {
		return "Flights [flightNumber=" + flightNumber + ", arrivalairport=" + arrivalairport + ", departureairport="
				+ departureairport + "]";
	}
	
	
}
