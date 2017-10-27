package org.aitesting.microservices.tripmanagement.models;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class TripState {
	
	private Integer idtripState;
	private String name;
	private String description;

    private Set<HasTripState> hasTripStates;
	
	public TripState() {
		
	}

	public Integer getIdtripState() {
		return idtripState;
	}

	public void setIdtripState(Integer idtripState) {
		this.idtripState = idtripState;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@JsonIgnore
	public Set<HasTripState> getHasTripStates() {
		return hasTripStates;
	}

	@Override
	public String toString() {
		return name;
	}

}
