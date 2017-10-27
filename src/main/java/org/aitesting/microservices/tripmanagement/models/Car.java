package org.aitesting.microservices.tripmanagement.models;

import java.util.Set;

import org.aitesting.microservices.passengermanagement.models.State;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Car {
	
	private Integer idcar;
	private State state;
	private Driver driver;
	private CarModel carModel;
	private String plate;
	private String imageUri;
	private Integer year;

    private Set<Trip> trips;
	
	public Car() {
		
	}

	public Car(State state, Driver driver, CarModel carModel, String plate, String imageUri, Integer year) {
		super();
		this.state = state;
		this.driver = driver;
		this.carModel = carModel;
		this.plate = plate;
		this.imageUri = imageUri;
		this.year = year;
	}

	public Integer getIdcar() {
		return idcar;
	}

	public void setIdcar(Integer idcar) {
		this.idcar = idcar;
	}


	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public CarModel getCarModel() {
		return carModel;
	}

	public void setCarModel(CarModel carModel) {
		this.carModel = carModel;
	}

	public String getPlate() {
		return plate;
	}

	public void setPlate(String plate) {
		this.plate = plate;
	}

	public String getImageUri() {
		return imageUri;
	}

	public void setImageUri(String imageUri) {
		this.imageUri = imageUri;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	@JsonIgnore
    public Set<Trip> getTrips() {
		return trips;
	}

	@Override
    public int hashCode() {
        int hash = 0;
        hash += (idcar != null ? idcar.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Car)) {
            return false;
        }
        Car other = (Car) object;
        if ((this.idcar == null && other.idcar != null) || (this.idcar != null && !this.idcar.equals(other.idcar))) {
            return false;
        }
        return true;
    }

	@Override
	public String toString() {
		return plate;
	}

}
