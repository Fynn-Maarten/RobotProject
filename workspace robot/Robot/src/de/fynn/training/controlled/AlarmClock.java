package de.fynn.training.controlled;

import java.util.Scanner;

public class AlarmClock  {
	
	static Scanner scan = new Scanner(System.in);

 public static String t ;
	
 public static void alarm(String t) {
	 
	 Thread th = new Thread() {
		 
		 public void run() {
			 
			 int wl=0;
			 while(wl==0) {
				 if(t.equals(Clock.getTime())) {
				        System.out.println("test");
					 
					 break;
				 }
			 }
		 }
	 
	
	};
	th.start();
 }
}
