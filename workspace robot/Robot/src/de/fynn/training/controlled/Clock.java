package de.fynn.training.controlled;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Clock {
	
     //returns hours and minutes of the day as String
	public static String getTime() {
		Calendar c = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
		String time = sdf.format(c.getTime());
		return time;
	}
    public static String getDatewithTime() {
    	Calendar c = Calendar.getInstance();
    	SimpleDateFormat sdf = new SimpleDateFormat("dd:MMM:yyyy:HH:mm:ss");
    	String date = sdf.format(c.getTime());
    	return date;
    }
	// returns date
	public static String getDate() {
		Calendar c = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd:MMM:yyyy");
		String date = sdf.format(c.getTime());
		return date;	
	}
	// returns Year as String
	public static String getYear() {
		Calendar c = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		String date = sdf.format(c.getTime());
		return date;	
	}
	// returns Month as String
	public static String getMonth() {
		Calendar c = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("MMM");
		String date = sdf.format(c.getTime());
		return date;	
	}
	//returns day of the month as String
	public static String getDay() {
		Calendar c = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd");
		String day = sdf.format(c.getTime());
		return day;
	}
	
	// returns Hours of the day as String
	public static String getTimeHours() {
	    Calendar c = Calendar.getInstance();
	    SimpleDateFormat sdf = new SimpleDateFormat("HH");
	    String time = sdf.format(c.getTime());
		return time ; 
	}
	
	//returns Minutes od the day as String
	public static String getTimeMinutes() {
	    Calendar c = Calendar.getInstance();
	    SimpleDateFormat sdf = new SimpleDateFormat("mm");
	    String time = sdf.format(c.getTime());
		return time ; 
	}
	
	//returns seconds of the day as String
	public static String getTimeSeconds() {
	    Calendar c = Calendar.getInstance();
	    SimpleDateFormat sdf = new SimpleDateFormat("ss");
	    String time = sdf.format(c.getTime());
		return time ; 
	}
	
	//returns Hours,minutes and seconds of the day as String
	public static String getTimewithSecs() {
		 Calendar c = Calendar.getInstance();
	     SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		 String time = sdf.format(c.getTime());
		return time;
	}
}
