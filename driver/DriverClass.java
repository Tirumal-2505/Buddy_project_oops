package com.greatlearning.driver;

import com.greatlearning.admin.Admin;
import com.greatlearning.hr.Hr;
import com.greatlearning.superdept.Super;
import com.greatlearning.tech.Tech;

public class DriverClass{
	
	public static void main(String[] args) {
		
		Super superDept = new Super();
		Hr hrDept = new Hr();
		Tech techDept = new Tech();
		Admin adminDept = new Admin();
		superDept.displaySuper();
		System.out.println();
		adminDept.displayAdmin();
		System.out.println();
		hrDept.displayHr();
		System.out.println();
		techDept.displayTech();
	
	}	
	
}