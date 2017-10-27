package org.aitesting.microservices.passengermanagement.models;

import java.io.Serializable;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class City implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private Integer idcity;
	private State state;
	private String name;

    private Set<Passenger> drivers;
    private Set<Passenger> passengers;
	
	public City() {
		
	}

	public Integer getIdcity() {
		return idcity;
	}

	public void setIdcity(Integer idcity) {
		this.idcity = idcity;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@JsonIgnore
	public Set<Passenger> getDrivers() {
		return drivers;
	}

	@JsonIgnore
	public Set<Passenger> getPassengers() {
		return passengers;
	}

	@Override
    public int hashCode() {
        int hash = 0;
        hash += (idcity != null ? idcity.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof City)) {
            return false;
        }
        City other = (City) object;
        if ((this.idcity == null && other.idcity != null) || (this.idcity != null && !this.idcity.equals(other.idcity))) {
            return false;
        }
        return true;
    }

	@Override
	public String toString() {
		return name;
	}
	
}
