package com.example.hackathonapp;


public class person {
	String firstName, lastName;
	int [][] schedule = new int[7][24];
	boolean arrayInitialized = false, checkedIn = false;
	
	public person(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName){
		this.lastName = lastName;
	}

	public String getFirstName(){
		return firstName;
	}

	public String getLastName(){
		return lastName;
	}
	
	public void checkIn(){
		checkedIn = true;
	}
	
	public void checkOut(){
		checkedIn = false;
	}
	
	public boolean isCheckedIn(){
		return checkedIn;
	}
	//check imported sting to determine which day to add the time to
	public void addTimes(int[][] input){
		for(int i = 0; i < 7; i++){
			for(int j = 0; j < 24; j++){
				schedule[i][j] = input[i][j];
			}
		}
		arrayInitialized = true;
	}
	//return 2D array of available times 
	public int[][] getTimes(String day){
		if(arrayInitialized == false){
			for(int i = 0; i < 7; i++){
				for(int j = 0; j < 24; j++){
					schedule[i][j] = 0;
				}
			}
		}
		return schedule;
	}
	

}
