package de.fynn.training.controlled;

import java.time.LocalTime;
import java.util.Calendar;
import java.util.Scanner;

public class Timer {
	
	public static Scanner scan = new Scanner(System.in);
	public static String seconds = " Sekunden";
	public static String second = " Sekunde";
	public static String minutes =  " Minuten";
	public static String minute = " Minute";
	public static String hours = " Stunden";
	public static String hour = " Stunde";
	

	
	static Calendar c = Calendar.getInstance();

	
	public static void alarm(String t) {
   Thread th = new Thread(){
			
			public void run(){
				
				int wl = 0;
				while(wl==0){
					if(t.equals(c.get(Calendar.YEAR)+ ":" + c.get(Calendar.MONTH) + ":" + c.get(Calendar.DAY_OF_MONTH)+ ":" + LocalTime.now().getHour() + ":" + LocalTime.now().getMinute() + ":" + LocalTime.now().getSecond())){
						System.out.println("test");
						break;
					}
				}
			}
		};
		th.start();
	}
	public static void stopTimer(){
		
	}

		
	}


