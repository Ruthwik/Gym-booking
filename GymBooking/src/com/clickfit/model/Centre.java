package com.clickfit.model;

import java.util.ArrayList;
import java.util.List;

public class Centre {
	
	private String id;
	private String name;
	private List<Activity> activities = new ArrayList<>();
	private int maxSlotCount;
	
	public Centre(String id, String name, int maxSlotCount) {
		super();
		this.id = id;
		this.name = name;
		this.maxSlotCount = maxSlotCount;
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
	public int getMaxSlotCount() {
		return maxSlotCount;
	}
	public void setMaxSlotCount(int maxSlotCount) {
		this.maxSlotCount = maxSlotCount;
	}
	public List<Activity> getActivities() {
		return activities;
	}
	public void addActivities(Activity activity) {
		activities.add(activity);
	}
	public void removeActivity(Activity activity) {
		activities.remove(activity);
	}
	@Override
	public String toString() {
		return "Centre [id=" + id + ", name=" + name + "]";
	}
	
	

}
