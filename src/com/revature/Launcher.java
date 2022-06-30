package com.revature;

public class Launcher {
	
	public static void main(String[] args) {
		
		checkForGymDay();
		
	}
	
	static void checkForGymDay() {
		
		String[] daysOfWeek = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
		
		for (String day : daysOfWeek) {
			
			//Print day
			System.out.println(day);
			
			//Get first char and make decision
			char firstChar = day.charAt(0); 
			
			if (firstChar == 'T' || firstChar == 'S' ) {
				System.out.println("Go to gym!\n");
			} else {
				System.out.println("Stay home.\n");
			}
			
		}
		
	}
	
}
