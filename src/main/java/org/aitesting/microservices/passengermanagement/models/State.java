package org.aitesting.microservices.passengermanagement.models;

import java.io.Serializable;
import java.util.Set;

public class State implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private Integer idstate;
	private Country country;
	private String name;
	private String abbreviation;
	
    private Set<City> cities;
	
	public State() {
		
	}

	public Integer getIdstate() {
		return idstate;
	}

	public void setIdstate(Integer idstate) {
		this.idstate = idstate;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAbbreviation() {
		return abbreviation;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	public Set<City> getCities() {
		return cities;
	}

	@Override
	public String toString() {
		return name;
	}

}
