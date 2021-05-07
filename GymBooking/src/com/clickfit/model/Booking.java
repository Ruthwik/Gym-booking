package com.clickfit.model;

public class Booking {
	String id;
	User user;
	Activity activity;
	Slot slot;
	
	
	public Booking(String id, User user, Activity activity, Slot slot) {
		super();
		this.id = id;
		this.user = user;
		this.activity = activity;
		this.slot = slot;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Activity getActivity() {
		return activity;
	}
	public void setActivity(Activity activity) {
		this.activity = activity;
	}
	public Slot getSlot() {
		return slot;
	}
	public void setSlot(Slot slot) {
		this.slot = slot;
	}
	
	
}
