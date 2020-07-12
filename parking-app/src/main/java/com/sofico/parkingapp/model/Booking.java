package com.sofico.parkingapp.model;

import java.util.Date;

public class Booking {
	
	private int id;
	private Parking parking;
	private User user;
	private Date date;
	
	
	public Booking(int id, Parking parking, User user, Date date) {
		super();
		this.id = id;
		this.parking = parking;
		this.user = user;
		this.date = date;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public Parking getParking() {
		return parking;
	}
	
	public void setParking(Parking parking) {
		this.parking = parking;
	}
	
	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

}
