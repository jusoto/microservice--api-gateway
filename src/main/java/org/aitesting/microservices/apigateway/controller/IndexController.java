package org.aitesting.microservices.apigateway.controller;

import org.aitesting.microservices.passengermanagement.models.Passenger;
import org.aitesting.microservices.tripmanagement.models.Trip;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestTemplate;

@Controller
@RequestMapping("api")
public class IndexController {
	
	@Value("${api.trips}")
	private String API_TRIPS;
	@Value("${api.drivers}")
	private String API_DRIVERS;
	@Value("${api.passengers}")
	private String API_PASSENGERS;
	@Value("${api.passengerwebui}")
	private String API_PASSENGER_WEBUI;

	/**
	 * Check all microservices status
	 * 
	 * @return a string with a list of microservices and their status
	 */
	@GetMapping("/")
	public @ResponseBody String getServicesList() {

		String resp = "";
		RestTemplate restTemplate = new RestTemplate();

		Object tripObject = null;
		try {
			tripObject = restTemplate.getForObject(API_TRIPS, String.class);
		} catch (ResourceAccessException ex) {
			System.out.println(ex.getMessage());
		}
		if (tripObject != null) {
			resp += "\nTrip Management Micro Service is active.<br>";
		} else {
			resp += "\nTrip Management Micro Service is NOT active.<br>";
		}

		Object driverObject = null;
		try {
			driverObject = restTemplate.getForObject(API_DRIVERS, String.class);
		} catch (ResourceAccessException ex) {
			System.out.println(ex.getMessage());
		}
		if (driverObject != null) {
			resp += "\nDriver Management Micro Service is active.<br>";
		} else {
			resp += "\nDriver Management Micro Service is NOT active.<br>";
		}

		Object passengerObject = null;
		try {
			passengerObject = restTemplate.getForObject(API_PASSENGERS, String.class);
		} catch (ResourceAccessException ex) {
			System.out.println(ex.getMessage());
		}
		if (passengerObject != null) {
			resp += "\nPassenger Management Micro Service is active.<br>";
		} else {
			resp += "\nPassenger Management Micro Service is NOT active.<br>";
		}

		return resp;
	}

	@GetMapping("passenger/login")
	public @ResponseBody Passenger getPassengerLogin(@RequestParam String username, @RequestParam String password) {
		RestTemplate restTemplate = new RestTemplate();
		Passenger passenger = restTemplate.getForObject(API_PASSENGERS + "/login?username=" + username + "&password=" + password,
				Passenger.class);
		return passenger;
	}
//
//	@GetMapping("passenger/signup")
//	public @ResponseBody Passenger getPassengerSignUp(@RequestParam String username, @RequestParam String password) {
//		RestTemplate restTemplate = new RestTemplate();
//		Passenger passenger = restTemplate.getForObject(API_PASSENGERS + "/signup?username=" + username + "&password=" + password,
//				Passenger.class);
//		return passenger;
//	}
//
//	@GetMapping("driver/login")
//	public @ResponseBody Driver getDriverLogin(@RequestParam String username, @RequestParam String password) {
//		RestTemplate restTemplate = new RestTemplate();
//		Driver driver = restTemplate.getForObject(API_DRIVERS + "/login?username=" + username + "&password=" + password, Driver.class);
//		return driver;
//	}
//
//	@GetMapping("driver/signup")
//	public @ResponseBody Driver getDriverSignUp(@RequestParam String username, @RequestParam String password) {
//		RestTemplate restTemplate = new RestTemplate();
//		Driver driver = restTemplate.getForObject(API_DRIVERS + "/signup?username=" + username + "&password=" + password, Driver.class);
//		return driver;
//	}

	@RequestMapping("requestTrip")
	public @ResponseBody Trip requestTrip(@RequestParam Integer idpassenger, @RequestParam Double latitude,
			@RequestParam Double longitude, @RequestParam String destinationAddress) {
		RestTemplate restTemplate = new RestTemplate();
		
		Trip requestedTrip = new Trip();
		Passenger passenger = new Passenger();

		passenger.setIdpassenger(idpassenger);
		requestedTrip.setPassenger(passenger);
		requestedTrip.setOriginLocationLat(latitude);
		requestedTrip.setOriginLocationLon(longitude);
		requestedTrip.setDestinationAddress(destinationAddress);

		Trip createdTrip = restTemplate.postForObject(API_TRIPS + "/add", requestedTrip, Trip.class);

		return createdTrip;
	}

}
