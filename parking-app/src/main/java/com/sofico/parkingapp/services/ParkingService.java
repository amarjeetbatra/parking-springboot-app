package com.sofico.parkingapp.services;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sofico.parkingapp.model.Booking;
import com.sofico.parkingapp.model.Parking;
import com.sofico.parkingapp.model.User;

@Service
public class ParkingService {
	
	private static final String DATE_FORMAT = "dd-MM-yyyy";
	
	private static int bookingCounter = 0;
	static List<User> users = new ArrayList<>();
	static List<Parking> parkings = new ArrayList<>();
	static List<Booking> bookings = new ArrayList<>();
	static {
		User user1 = new User(1, "Amar", "mara@sofico.be", "1234561", "mara", "mara123");
		User user2 = new User(2, "Liam", "licu@sofico.be", "1234562", "licu", "licu123");
		User user3 = new User(3, "Naveen", "naka@sofico.be", "1234563", "naka", "naka123");
		
		Parking park1 = new Parking(1, "1", true);
		Parking park2 = new Parking(2, "2", true);
		Parking park3 = new Parking(3, "3", true);
		park1.setOwner(user1);
		park2.setOwner(user2);
		park3.setOwner(user3);
		
		users.add(user1);
		users.add(user2);
		users.add(user3);
		
		parkings.add(park1);
		parkings.add(park2);
		parkings.add(park3);
	}

	public List<User> getAllUsers() {
		return users;
	}
	
	public List<Parking> getAllParkings() {
		return parkings;
	}
	
	public Parking getParkingById(int id) {
		for (Parking parking : parkings) {
			if (parking.getId() == id) {
				return parking;
			}
		}
		return null;
	}
	
	public User getUserById(int id) {
		for (User user : users) {
			if (user.getId() == id) {
				return user;
			}
		}
		return null;
	}
	
	public List<Booking> initializeAllBookings() {
		// We create bookings for next 30 days only for now for each Parking
		
		for (int i = 0; i < 30; i++) {
			for (Parking parking : parkings) {
				Calendar calendar = Calendar.getInstance();
				calendar.add(Calendar.DAY_OF_MONTH, i);
				Booking booking = new Booking(++bookingCounter, parking, parking.getOwner(), calendar.getTime());
				bookings.add(booking);
			}
		}
		
		return bookings;
	}
}
