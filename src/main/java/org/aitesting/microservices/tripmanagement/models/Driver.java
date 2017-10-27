package org.aitesting.microservices.tripmanagement.models;

import java.util.Set;

import org.aitesting.microservices.passengermanagement.models.City;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Driver{
	
	private Integer iddriver;
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

    private Set<Car> cars;

    private Set<Trip> trips;
	
	public Driver() {
		
	}

	public Driver(City city, String fname, String lname, String username, String password, String email,
			Double lastLocationLat, Double lastLocationLon, String address, String phone, Integer active) {
		super();
		this.city = city;
		this.fname = fname;
		this.lname = lname;
		this.username = username;
		this.password = password;
		this.email = email;
		this.lastLocationLat = lastLocationLat;
		this.lastLocationLon = lastLocationLon;
		this.address = address;
		this.phone = phone;
		this.active = active;
	}

	public Integer getIddriver() {
		return iddriver;
	}

	public void setIddriver(Integer iddriver) {
		this.iddriver = iddriver;
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
    public Set<Car> getCars() {
		return cars;
	}

	@JsonIgnore
	public Set<Trip> getTrips() {
		return trips;
	}

	@Override
    public int hashCode() {
        int hash = 0;
        hash += (iddriver != null ? iddriver.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Driver)) {
            return false;
        }
        Driver other = (Driver) object;
        if ((this.iddriver == null && other.iddriver != null) || (this.iddriver != null && !this.iddriver.equals(other.iddriver))) {
            return false;
        }
        return true;
    }

	@Override
	public String toString() {
		return fname + " " + lname;
	}

	public void setSummary(String summary) {
		// TODO Auto-generated method stub
		
	}

}
