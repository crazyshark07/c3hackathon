package com.example.hackathonapp;

public class event {
	int month, day, startTime, endTime;
	String description;
	
	public event(int month, int day, int startTime, int endTime){
		this.month = month;
		this.day = day;
		this.startTime = startTime;
		this.endTime = endTime;
	}
	
	public void setDate(int month, int day, int startTime, int endTime){
		this.month = month;
		this.day = day;
		this.startTime = startTime;
		this.endTime = endTime;
	}
	public void setDescription(String description){
		this.description = description;
	}
	
	public int getMonth(){
		return month;
	}
	public int getDay(){
		return day;
	}
	public int getStartTime(){
		return startTime;
	}
	public int getEndTime(){
		return endTime;
	}
	public String getDescription(){
		return description;
	}
}
