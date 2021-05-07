package com.clickfit.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Slot {

	private String id;
	private Date startTime;
	private List<User> users = new ArrayList<>();
	private int maxUsersCount;
	private int durationInSeconds = 3600; //1 hr
	private Centre centre;
	

	public Slot(String id, Date startTime, int maxUsersCount, Centre centre) {
		super();
		this.id = id;
		this.startTime = startTime;
		this.maxUsersCount = maxUsersCount;
		this.centre = centre;
	}

	public String getId() {
		return id;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public int getMaxUsersCount() {
		return maxUsersCount;
	}

	public void setMaxUsersCount(int maxUsersCount) {
		this.maxUsersCount = maxUsersCount;
	}

	public int getDurationInSeconds() {
		return durationInSeconds;
	}

	public void setDurationInSeconds(int durationInSeconds) {
		this.durationInSeconds = durationInSeconds;
	}

	public Centre getCentre() {
		return centre;
	}

	public void setCentre(Centre centre) {
		this.centre = centre;
	}
	

	public List<User> getUsers() {
		return users;
	}

	public void addUser(User user) {
		users.add(user);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((centre == null) ? 0 : centre.hashCode());
		result = prime * result + durationInSeconds;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((startTime == null) ? 0 : startTime.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Slot other = (Slot) obj;
		if (centre == null) {
			if (other.centre != null)
				return false;
		} else if (!centre.equals(other.centre))
			return false;
		if (durationInSeconds != other.durationInSeconds)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (startTime == null) {
			if (other.startTime != null)
				return false;
		} else if (!startTime.equals(other.startTime))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Slot [id=" + id + ", startTime=" + startTime + ", centre=" + centre
				+ "]";
	}
	
	
	
}
