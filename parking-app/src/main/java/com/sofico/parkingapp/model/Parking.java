package com.sofico.parkingapp.model;

public class Parking {
	
	private int id;
	private String number;
	private boolean isAvailable;
	
	private User owner;
	
	
	public Parking(int id, String number, boolean isAvailable) {
		super();
		this.id = id;
		this.number = number;
		this.isAvailable = isAvailable;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNumber() {
		return number;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
	
	public boolean isAvailable() {
		return isAvailable;
	}
	
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	
	public User getOwner() {
		return owner;
	}

	public void setOwner(User owner) {
		this.owner = owner;
	}
	
}
