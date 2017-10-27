package org.aitesting.microservices.tripmanagement.models;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class CarModel {
	
	private Integer idcarModel;
	private CarMaking carMaking;
	private String name;

    private Set<Car> cars;
	
	public CarModel() {
		
	}

	public Integer getIdcarModel() {
		return idcarModel;
	}

	public void setIdcarModel(Integer idcarModel) {
		this.idcarModel = idcarModel;
	}

	public CarMaking getCarMaking() {
		return carMaking;
	}

	public void setCarMaking(CarMaking carMaking) {
		this.carMaking = carMaking;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@JsonIgnore
	public Set<Car> getCars() {
		return cars;
	}

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcarModel != null ? idcarModel.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CarModel)) {
            return false;
        }
        CarModel other = (CarModel) object;
        if ((this.idcarModel == null && other.idcarModel != null) || (this.idcarModel != null && !this.idcarModel.equals(other.idcarModel))) {
            return false;
        }
        return true;
    }

	@Override
	public String toString() {
		return name;
	}

}
