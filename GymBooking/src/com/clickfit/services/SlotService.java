package com.clickfit.services;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import com.clickfit.model.Centre;
import com.clickfit.model.Slot;
import com.clickfit.model.User;

public class SlotService {

	private HashMap<String, Slot> slots = new HashMap<>();
	
	public Slot createSlot(Date date,int usersCount,Centre centre) {
		String slotId = UUID.randomUUID().toString();
		Slot slot = new Slot(slotId, date, usersCount,centre);
		slots.put(slotId,slot);
		return slot;
	}
	
	public void addUsers(String slotId,User user) {
		Slot slot = slots.get(slotId);
		
		if(slot.getUsers().size()+1>slot.getMaxUsersCount()) {
			System.out.println("Max users count reached in the slot");
			return;
		}
		slot.addUser(user);
	}
	
	public void removeUsers(String slotId,User user) {
		Slot slot = slots.get(slotId);
		List<User> users = slot.getUsers();
		if(users.contains(user)) {
			users.remove(user);
		}
	}
	
	public void removeSlot(String slotId) {
		slots.remove(slotId);
	}
	
}
