package com.sofico.parkingapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sofico.parkingapp.model.Booking;
import com.sofico.parkingapp.model.Parking;
import com.sofico.parkingapp.model.User;
import com.sofico.parkingapp.services.ParkingService;

@RestController
public class ParkingController {
	
	@Autowired
	ParkingService parkingService;
	
	@GetMapping(path = "/parkings")
	List<Parking> getAllParkings() {
		return parkingService.getAllParkings();
	}
	
	@GetMapping(path = "/users")
	List<User> getAllUsers() {
		return parkingService.getAllUsers();
	}
	
	@GetMapping(path = "/parkings/{id}")
	Parking getParkingDetails(@PathVariable int id) {
		return parkingService.getParkingById(id);
	}
	
	@GetMapping(path = "/users/{id}")
	User getUserDetails(@PathVariable int id) {
		return parkingService.getUserById(id);
	}
	
	@GetMapping(path = "/bookings")
	List<Booking> getAllBookings() {
		return parkingService.initializeAllBookings();
	}

}
