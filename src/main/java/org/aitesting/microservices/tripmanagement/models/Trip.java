package org.aitesting.microservices.tripmanagement.models;

import java.util.Set;

import org.aitesting.microservices.passengermanagement.models.City;
import org.aitesting.microservices.passengermanagement.models.Passenger;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Trip {
	
	private Integer idtrip;
	private City originCity;
	private City destinationCity;
	private Passenger passenger;
	private Driver driver;
	private Car car;
	private Double lastLocationLat;
	private Double lastLocationLon;
	private Double originLocationLat;
	private Double originLocationLon;
	private Double destinationLocationLat;
	private Double destinationLocationLon;
	private String originAddress;
	private String originZipcode;
	private String destinationAddress;
	private String destinationZipcode;
	private String directions;

    private Set<HasTripState> hasTripState;
	
	public Trip() {
	}

	public Integer getIdtrip() {
		return idtrip;
	}

	public void setIdtrip(Integer idtrip) {
		this.idtrip = idtrip;
	}

	public City getOriginCity() {
		return originCity;
	}

	public void setOriginCity(City originCity) {
		this.originCity = originCity;
	}

	public City getDestinationCity() {
		return destinationCity;
	}

	public void setDestinationCity(City destinationCity) {
		this.destinationCity = destinationCity;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Double getLastLocationLat() {
		return lastLocationLat;
	}

	public void setLastLocationLat(Double lastLocationLat) {
		this.lastLocationLat = lastLocationLat;
	}

	public Double getLastLocationLon() {
		return lastLocationLon;
	}

	public void setLastLocationLon(Double lastLocationLon) {
		this.lastLocationLon = lastLocationLon;
	}

	public Double getOriginLocationLat() {
		return originLocationLat;
	}

	public void setOriginLocationLat(Double originLocationLat) {
		this.originLocationLat = originLocationLat;
	}

	public Double getOriginLocationLon() {
		return originLocationLon;
	}

	public void setOriginLocationLon(Double originLocationLon) {
		this.originLocationLon = originLocationLon;
	}

	public Double getDestinationLocationLat() {
		return destinationLocationLat;
	}

	public void setDestinationLocationLat(Double destinationLocationLat) {
		this.destinationLocationLat = destinationLocationLat;
	}

	public Double getDestinationLocationLon() {
		return destinationLocationLon;
	}

	public void setDestinationLocationLon(Double destinationLocationLon) {
		this.destinationLocationLon = destinationLocationLon;
	}

	public String getOriginAddress() {
		return originAddress;
	}

	public void setOriginAddress(String originAddress) {
		this.originAddress = originAddress;
	}

	public String getOriginZipcode() {
		return originZipcode;
	}

	public void setOriginZipcode(String originZipcode) {
		this.originZipcode = originZipcode;
	}

	public String getDestinationAddress() {
		return destinationAddress;
	}

	public void setDestinationAddress(String destinationAddress) {
		this.destinationAddress = destinationAddress;
	}

	public String getDestinationZipcode() {
		return destinationZipcode;
	}

	public void setDestinationZipcode(String destinationZipcode) {
		this.destinationZipcode = destinationZipcode;
	}

	public String getDirections() {
		return directions;
	}

	public void setDirections(String directions) {
		this.directions = directions;
	}

	@JsonIgnore
	public Set<HasTripState> getHasTripState() {
		return hasTripState;
	}

	@Override
	public String toString() {
		return passenger + " - " + destinationAddress;
	}
	
	
	
}
