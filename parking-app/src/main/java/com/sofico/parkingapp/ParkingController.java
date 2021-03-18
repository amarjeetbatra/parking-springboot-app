package com.sofico.parkingapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sofico.parkingapp.model.Booking;
import com.sofico.parkingapp.model.Parking;
import com.sofico.parkingapp.model.User;
import com.sofico.parkingapp.services.ParkingService;

@CrossOrigin(origins = "*")
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
	
	@GetMapping(path = "/parkings/{parkingId}")
	Parking getParkingDetails(@PathVariable int parkingId) {
		return parkingService.getParkingById(parkingId);
	}
	
	@GetMapping(path = "/users/{userId}")
	User getUserDetails(@PathVariable int userId) {
		return parkingService.getUserById(userId);
	}
	
	@GetMapping(path = "/bookings")
	List<Booking> getAllBookings() {
		return parkingService.initializeAllBookings();
	}
	
	@GetMapping(path = "/bookings/{userAcronym}")
	List<Booking> getBookingsForUser(@PathVariable String userAcronym) {
		List<Booking> bookingsForUser = parkingService.getBookingsForUser(userAcronym);
		for (Booking booking : bookingsForUser) {
			System.out.println(booking.getId());
		}
		return bookingsForUser;
	}

}
