package org.aitesting.microservices.passengermanagement.models;

import java.io.Serializable;
import java.util.Set;

import org.aitesting.microservices.tripmanagement.models.Trip;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Passenger implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Integer idpassenger;
	private City city;
	private String fname;
	private String lname;
	private String username;
	private String password;
	private String email;
	private Double lastLocationLat;
	private Double lastLocationLon;
	private String address;
	private String phone;
	private Integer active; // 1 = active, 0 = inactive
	
    private Set<Trip> trips;
	
	public Passenger() {
		
	}

	public Integer getIdpassenger() {
		return idpassenger;
	}

	public void setIdpassenger(Integer idpassenger) {
		this.idpassenger = idpassenger;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Integer getActive() {
		return active;
	}

	public void setActive(Integer active) {
		this.active = active;
	}

	@JsonIgnore
	public Set<Trip> getTrips() {
		return trips;
	}

	@Override
	public String toString() {
		return fname + " " + lname;
	}
	
	public Boolean isValid(String username, String password) {
		Boolean resp = false;
		
		if(username.trim().toLowerCase().equals(this.username.toLowerCase()) && password.trim().equals(this.password)) {
			resp = true;
		}
		
		return resp;
	}

}
