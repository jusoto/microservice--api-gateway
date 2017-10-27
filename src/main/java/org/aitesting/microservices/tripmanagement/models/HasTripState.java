package org.aitesting.microservices.tripmanagement.models;

import java.sql.Date;

public class HasTripState {
	
	private Integer idhasTripState;
	private Trip trip;
	private TripState tripState;
	private Date creationDate;
	
	public HasTripState() {
		
	}

	public Integer getIdhasTripState() {
		return idhasTripState;
	}

	public void setIdhasTripState(Integer idhasTripState) {
		this.idhasTripState = idhasTripState;
	}

	public Trip getTrip() {
		return trip;
	}

	public void setTrip(Trip trip) {
		this.trip = trip;
	}

	public TripState getTripState() {
		return tripState;
	}

	public void setTripState(TripState tripState) {
		this.tripState = tripState;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	@Override
	public String toString() {
		return trip.toString() + " - " + tripState.toString() + " - " + creationDate.toString();
	}

}
