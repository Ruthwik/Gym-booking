package com.clickfit.services;

import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import com.clickfit.model.Activity;
import com.clickfit.model.Centre;

public class CentreService {

	private HashMap<String, Centre> centres = new HashMap<>();
	
    public Centre createCentre(final String centreName, final int slot) {
        String centreId = UUID.randomUUID().toString();
        Centre centre = new Centre(centreId, centreName,slot);
        // add check for duplicate centre
        centres.put(centreId, centre);
        return centre;
    }
    
    public void addActivityToCentre(String centreId,Activity activity) {
    	Centre centre = centres.get(centreId);
    	centre.addActivities(activity);
    }
    
    public List<Activity> getActivitiesByCentre(String centreId) {
    	Centre centre = centres.get(centreId);
    	return centre.getActivities();
    }
    
    public void removeActivityFromCentre(String centreId,Activity activity) {
    	Centre centre = centres.get(centreId);
    	centre.removeActivity(activity);
    }
}
