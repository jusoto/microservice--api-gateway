package org.aitesting.microservices.tripmanagement.models;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class CarMaking {
	
	private Integer idcarMaking;
	private String name;

    private Set<CarModel> carModels;
	
	public CarMaking() {
		
	}

	public Integer getIdcarMaking() {
		return idcarMaking;
	}

	public void setIdcarMaking(Integer idcarMaking) {
		this.idcarMaking = idcarMaking;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@JsonIgnore
	public Set<CarModel> getCarModels() {
		return carModels;
	}

	@Override
	public String toString() {
		return name;
	}

}
