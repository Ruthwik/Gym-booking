import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.clickfit.model.Activity;
import com.clickfit.model.Booking;
import com.clickfit.model.Centre;
import com.clickfit.model.Slot;
import com.clickfit.model.User;
import com.clickfit.services.ActivityService;
import com.clickfit.services.BookingService;
import com.clickfit.services.CentreService;
import com.clickfit.services.SlotService;
import com.clickfit.services.UserService;

public class GymBookingMain {

	public static void main(String[] args) {
	
		// create centre service
		CentreService centreService = new CentreService();
		
		// Create first centre with max slots		
		Centre centre1 = centreService.createCentre("FitnessCafe",6);
		Centre centre2 = centreService.createCentre("WellnessCentre",10);
		
		//	create an activity
		ActivityService activityService = new ActivityService();
		Activity activity = activityService.createActivity("Cardio");
		Activity activity2 = activityService.createActivity("Weights");
		Activity activity3 = activityService.createActivity("Swim");
		
		centreService.addActivityToCentre(centre1.getId(), activity);
		centreService.addActivityToCentre(centre2.getId(), activity2);
		
		centreService.addActivityToCentre(centre2.getId(), activity);
		centreService.addActivityToCentre(centre2.getId(), activity3);
		
		// creating a Calendar object
        Calendar c1 = Calendar.getInstance();
        c1.set(Calendar.MONTH, Calendar.MAY);
        c1.set(Calendar.DATE, 10);
        c1.set(Calendar.YEAR, 2021);
        c1.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        
        
		
		SlotService slotService = new SlotService();
		
		// create slot at a centre
		Slot slot = slotService.createSlot(c1.getTime(),10,centre1);
		Slot slot2 = slotService.createSlot(c1.getTime(),10,centre2);
		
		//get existing activity in the centre
        activityService.addSlotToActivity(activity.getId(),slot);

		//add slots to the centre

        activityService.addSlotToActivity(activity.getId(),slot2);
        
        //get all activities
        System.out.println(activityService.getAllActivities());
        
		//all slots across fitness centers for a particular activity  Given Activity get all the slots in all the fitness centers for that activity
        System.out.println(activityService.getActivityById(activity.getId()).getSlots());
        
        
        // all activities slot for a particular fitness centre
		
         List<Activity> activitiesList = centreService.getActivitiesByCentre(centre1.getId());
		
         for(Activity currActivity : activitiesList) {
        	 System.out.println( "Activity :"+currActivity.getName()+" has "+currActivity.getSlots());
         }
         
         UserService userService = new UserService();
         User user = userService.register("John", "Wick", "john@gmail.com");
         
         slot.addUser(user);
         
         BookingService bookingService = new BookingService();
         Booking booking = bookingService.createBooking(user, activity, slot);
         
	}

}
