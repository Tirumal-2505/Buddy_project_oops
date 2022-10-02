package com.greatlearning.hr;

import com.greatlearning.superdept.Super;

public class Hr extends Super{
	
	public String departmentName(){
		departmentName = "Welcome to HR Department";
		return departmentName;
	}
	
	public String doActivity() {
		doActivity = "team Lunch";
		return doActivity;
	}
	
	public String getTodaysWork() {
		getTodaysWork = "Fill today’s timesheet and mark your attendance";
		return getTodaysWork;
	}
	
	public String getWorkDeadline() {
		getWorkDeadline = "Complete by EOD";
		return getWorkDeadline;
	}
	
	public void displayHr() {
		System.out.println(departmentName());
		System.out.println(doActivity());
		System.out.println(getTodaysWork());
		System.out.println(getWorkDeadline());
		System.out.println(super.isTodayAHoliday());
	}
	
}