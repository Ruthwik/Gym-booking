package com.clickfit.model;

import java.util.ArrayList;
import java.util.List;

public class Activity {

	private String id;
	private String name;
	private List<Slot> slots = new ArrayList<>();;
	
	public Activity(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public List<Slot> getSlots() {
		return slots;
	}

	public void addSlot(Slot slot) {
		slots.add(slot);
	}
	
	public void removeSlot(Slot slot) {
		slots.remove(slot);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Activity [id=" + id + ", name=" + name + "]";
	}

	
	
}
