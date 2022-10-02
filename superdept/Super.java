package com.greatlearning.superdept;

public class Super{
	
	public String departmentName, getTodaysWork, getWorkDeadline, isTodayAHoliday, doActivity, getTechStackInformation; 
	
	public String departmentName() {
		departmentName = "Welcome to Super Department";
		return departmentName;
	}
	
	public String getTodaysWork() {
		getTodaysWork = "No Work as of now";
		return getTodaysWork;
	}
	
	public String getWorkDeadline() {
		getWorkDeadline = "Nil";
		return getWorkDeadline;
	}
	
	public String isTodayAHoliday() {
		isTodayAHoliday = "Today is not a holiday";
		return isTodayAHoliday;
	}
	
	public void displaySuper() {
		System.out.println(departmentName());
		System.out.println(getTodaysWork());
		System.out.println(getWorkDeadline());
		System.out.println(isTodayAHoliday());
	}
	
}