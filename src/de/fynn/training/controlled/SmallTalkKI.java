package de.fynn.training.controlled;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Scanner;

public class SmallTalkKI  {
    static boolean var = false;
    static boolean var2 = false;
   public static Scanner scan = new Scanner(System.in);// Input from Speech
	public static void main(String[] args) throws IOException{
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		/* Introduction
		 * - what's ur name? 
		 * - favourite sound 
		 * - language
		 * personal questions to personaldata.txt
		 * 
		 */ 
	     

	     

		 FileWriter fw;
         //File file = new File("D:\\Dev Projects\\Robot\\workspace robot\\Robot\\TextFiles\\personaldata.txt");
		 File file = new File("C:\\Development\\Robot\\personaldata.txt");
		if(var2 == false && !file.isFile() ) { 
           try {
           fw = new FileWriter(file,true);
           boolean var4 = false;
           boolean var5 = false;
           while(var4 == false && var5 == false) {
           System.out.println("What is your name?");
			String inputintro = br.readLine();
			if(inputintro.equals("My name is")) {
            fw.write("es klappt");
            fw.write(System.getProperty("line.separator"));
            var4 = true;
			}
			while(var5 == false && var4 == true) {
			System.out.println("With which of the following songs do you prefer to get woken up?");

			 PlaySound.sound("E:\\RobotProject\\Music\\Syneptic - The Hobbit (Calm Ambient Mix).mp3");
		    // PlaySound.sound("D:\\Dev Projects\\Robot\\workspace robot\\Robot\\Music\\Syneptic - The Hobbit (Calm Ambient Mix).mp3");
		      try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		     PlaySound.sound("E:\\RobotProject\\Music\\Syneptic - The Hobbit (Calm Ambient Mix).mp3");
		     //PlaySound.sound("D:\\Dev Projects\\Robot\\workspace robot\\Robot\\Music\\Syneptic - The Hobbit (Calm Ambient Mix).mp3");
		    	var5 = true;
		     }
		          
		    inputintro = br.readLine();
		    
		    if(inputintro.toLowerCase().contains("again") || inputintro.toLowerCase().contains("return")) {
		     var5 = false;	
		        }
		       }
			
           
			fw.write("Finished");
			fw.flush();
			fw.close();
           }catch(IOException e) {
        	   System.err.println("Cannot create textfile");
           }
       
		}
        FileInputStream in = new FileInputStream("C:\\Development\\Robot\\personaldata.txt");
      //  FileInputStream in = new FileInputStream("D:\\Dev Projects\\Robot\\workspace robot\\Robot\\TextFiles\\personaldata.txt");
        BufferedReader r = new BufferedReader(new InputStreamReader(in));
        String strLine = null, tmp;
        
        while((tmp = r.readLine()) != null) {
        	strLine = tmp;
        }
        String lastline = strLine;
		in.close();
		
		
		if(new File("C:\\Development\\Robot\\personaldata.txt").isFile() && lastline.equals("Finished") ) {
		var2 = true;
	}
        var2 = true;
		String name = ""; //get name out of personaldata.txt
		if(var2 == true) {
	     int i = 0;
	     boolean var5 = true;
	     boolean var6 = true;
	     boolean var7 = true;
	     boolean var8 = true;
	     boolean var9 = true; 
	     
		do{  
			// File fileInput = new File("D:\\Dev Projects\\Robot\\workspace robot\\Robot\\TextFiles\\IFS.txt");
			File fileInput = new File("C:\\Development\\Robot\\input.txt"); 
			//SmallTalk
			 
		    	while(var7 == true) {
		    		System.out.println("Sag etwas zu James:");
		    		var7 = false;
		    		var5 = true;
		    	}
		
		    	
		    while(var5 == true) {
			String input = CommandsforCoding.getfirstline();
			if(input != null) {
		    if(input.toLowerCase().contains("hi")) {
		    
			System.out.println("Hallo wie geht es dir?");
			System.out.println("Sag etwas zu James:");
			var5 = false;
		    input = null;
		    var6 = true;
		    while(var6 == true){
				String input2 = CommandsforCoding.getfirstline(); 
				if(input2 != null) {
		     if(input2.toLowerCase().contains("gut")) {
		           System.out.println("Das gef�llt mir");
		    	 var7 = true;
		    	 var6 = false;
		    	 input2 = null; 
		     
		     } else if(input2.toLowerCase().contains("schlecht")) {
		    	System.out.println("Schade! Was bedr�ckt dich denn ?");
		        System.out.println("Sag etwas zu James:");
		    	var8 = true;
		    	input2 = null;
		          while(var8 == true) {
		    		 String input3 = CommandsforCoding.getfirstline();
		    		 if(input3.toLowerCase().contains("gestorben")|| input3.toLowerCase().contains("tot")) {
		    			 System.out.println("OH! Das tut mir aufrichtig Leid...");
		    			 input3 = null;
		    			 var7 = true;
		    			 var8 = false;
		    			 var6 = false;
		    			 System.out.println(var7);
		    	   }
		          } 
		         }	 
				} 
		       } 

		    
		    }else  if (input.toLowerCase().contains("wie sp�t ist es ")) {
		    	 System.out.println("Es ist " + Clock.getTime() +" Uhr!");
		    	 var5 = false;
		    	 var7 = true;
		    	 input = null;
		    	 fileInput.delete();
		    	 fileInput.createNewFile();
		    }
		/*    else if(input.equals("Stelle Wecker")) {
		    	System.out.println("Wie sp�t?");
		    	System.out.println("Sag etwas zu James:"); 
		    	var5 = false;
		    	var9 = true;
		    	while(var9 == true){
		    	//check if time contains "Uhr"
		    	 * true:
		    	 * -get first Integer before "Uhr" as hours and after "Uhr" as minutes
		    	 * false:
		    	 * -Console out : "Bitte gib eine Uhrzeit an ! "
		    		String time = CommandsforCoding.getfirstline();
		    		boolean var10 = true;
		             while(var10 == true) {
		    		AlarmClock.alarm(time);
		    		System.out.println("Wecker wurde gestellt!");
		    		var10 = false;
		    	}
		    	}
		    	var7 = true;
		    	var5 = false;
		    	input = null;
		    	
		    	fileInput.delete();
		    	fileInput.createNewFile();
		    */
		    //	AlarmClock.alarm(scan.nextLine());
		    //	System.out.println("Wecker wurde gestellt!"); 
		    	  
		    	//Timer
		       
 			
		    } else {
			//	System.out.println("Keine Eingabe vorhanden");
	}
		     
		     
 }
	
	
		
	  
			
		
		
	    
		
		   
	   
					
			/*
	    	 // alarmclock
		 else if(lol1.equals("Stelle Wecker")) {
	    	  System.out.println("Wie sp�t?");
	    	AlarmClock.alarm(scan.nextLine());
	    	System.out.println("Wecker wurde gestellt!");
	    	  
	    	//Timer
	     }  
	     if(lol1.equals("Stelle Timer")) {
	    	 System.out.println("Wie lange?");
	    	 String text = Timer.scan.nextLine();
	    	 Scanner s = new Scanner(text);
	    	 int time = s.nextInt();
	    	 Calendar c = Calendar.getInstance();
	    	 int hours = LocalTime.now().getHour() ;
	    	 int minutes = LocalTime.now().getMinute() ;
	    	 int secs = LocalTime.now().getSecond();
	    	

	     
             // Seconds
	    	 if(text.contains(Timer.seconds) || text.contains(Timer.second)) {
	    			
	    			int h = LocalTime.now().getHour();
	    			int m = LocalTime.now().getMinute();
	    			int sec = LocalTime.now().getSecond();
	    			int d = c.get(Calendar.DAY_OF_MONTH);
	    			int mm = c.get(Calendar.MONTH);
	    			int y = c.get(Calendar.YEAR);
	    			secs = sec + time;
	    			
	    			if(secs >= 60){
	    				m ++;
	    			    secs = secs - 60;
	    				
	    			}if(m >= 60) {
	    				h ++;
	    				m = m - 60;
	    			}
	               
	    			String timeall = y + ":" + mm + ":" + d + ":" + h + ":" + m + ":" + secs;
	    			System.out.println("Timer beginnt...");
	    			Timer.alarm(timeall);
		    		}
	    	 

	    	 
	    	 // Minutes
	    	 
	    	 if(text.contains(Timer.minutes) || text.contains(Timer.minute)) {
	    			int h = LocalTime.now().getHour();
	    			int m = LocalTime.now().getMinute();
	    			int sec = LocalTime.now().getSecond();
	    			int d = c.get(Calendar.DAY_OF_MONTH);
	    			int mm = c.get(Calendar.MONTH);
	    			int y = c.get(Calendar.YEAR);
	    			minutes = m + time;
	    			
	    			if(minutes >= 60){
	    				h ++;
	    			    minutes = minutes - 60;	
	    			}
	    			if(h >= 60) {
	    				d++;
	    				h = h - 60;
	    			}
	               
	    			String timeall = y + ":" + mm + ":" + d + ":" + h + ":" + minutes + ":" + sec;
	    			System.out.println("Timer beginnt...");
	    			Timer.alarm(timeall);
		    		
	    	 }
	    	 //hours
	        if(text.contains(Timer.hours) || text.contains(Timer.hour)) {
	        	int h = LocalTime.now().getHour();
    			int m = LocalTime.now().getMinute();
    			int sec = LocalTime.now().getSecond();
    			int d = c.get(Calendar.DAY_OF_MONTH);
    			int mm = c.get(Calendar.MONTH);
    			int y = c.get(Calendar.YEAR);
    			hours = h + time;
    			
    			if(hours >= 60){
    				d ++;
    			    hours = hours - 60;
    				
    			}
               
    			String timeall = y + ":" + mm + ":" + d + ":" + hours + ":" + m + ":" + sec;
    			System.out.println("Timer beginnt...");
    			Timer.alarm(timeall);
	    				 
	         		
	     }
	        s.close();
	     }
	    	
	     
	    	 else{
	    	 System.out.println("Wie bitte? Kannst du das bitte nocheinmal wiederholen?");
	     } */
		
		}	while(var == false);
	}
}
}



