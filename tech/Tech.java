package com.greatlearning.tech;

import com.greatlearning.superdept.Super;

public class Tech extends Super{
	
	public String departmentName(){
		departmentName = "Welcome to Tech Department";
		return departmentName;
	}
	
	public String getTodaysWork() {
		getTodaysWork = "Complete coding of module 1";
		return getTodaysWork;
	}
	
	public String getWorkDeadline() {
		getWorkDeadline = "Complete by EOD";
		return getWorkDeadline;
	}
	
	public String getTechStackInformation() {
		getTechStackInformation = "core Java";
		return getTechStackInformation;
	}
	
	public void displayTech() {
		System.out.println(departmentName());
		System.out.println(getTodaysWork());
		System.out.println(getWorkDeadline());
		System.out.println(getTechStackInformation());
		System.out.println(super.isTodayAHoliday());
	}
}