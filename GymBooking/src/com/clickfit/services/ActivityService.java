package com.clickfit.services;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import com.clickfit.model.Activity;
import com.clickfit.model.Slot;

public class ActivityService {
	
	private HashMap<String, Activity> activities = new HashMap<>();
	
	public Activity createActivity(String name) {
		String activityId = UUID.randomUUID().toString();
		Activity activity = new Activity(activityId,name);
		activities.putIfAbsent(activityId,activity);
		return activity;
	}
	
	
	public void addSlotToActivity(String activityId,Slot slot) {
		Activity activity = activities.get(activityId);
		activity.addSlot(slot);
    }
	
	public List<Slot> getSlotsByActivity(String activityId) {
		Activity activity = activities.get(activityId);
		return activity.getSlots();
	}
	
	public Collection<Activity> getAllActivities() {
		return activities.values();
	}
	
	public Activity getActivityById(String activityId) {
		return activities.get(activityId);
	}
	
	public void removeSlotFromActivity(String activityId,Slot slot) {
		Activity activity = activities.get(activityId);
		activity.removeSlot(slot);
	}

	public void editActivity(Activity activity) {
		String id =activity.getId();
		if(activities.containsKey(id))
			activities.put(id, activity);
	}
	
}
