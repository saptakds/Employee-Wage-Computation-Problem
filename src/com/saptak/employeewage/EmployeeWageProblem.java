package com.saptak.employeewage;

import java.util.Random;

public class EmployeeWageProblem {

	private static final int FULL_DAY_WORKING_HOURS = 8;
	private final String companyName;
	private final int dailyWage;
	private final int workingDaysPerMonth;
	private final int workingHoursPerMonth;

	public EmployeeWageProblem(String companyName, int dailyWage, int workingDaysPerMonth, int workingHoursPerMonth) {
		this.companyName = companyName;
		this.dailyWage = dailyWage;
		this.workingDaysPerMonth = workingDaysPerMonth;
		this.workingHoursPerMonth = workingHoursPerMonth;
	}

	public String getCompanyName() {
		return companyName;
	}

	public long getWagesForMonth() {
		long wages = 0;
		int workingHours = 0, workingDays = 0;
		while (workingDays < workingDaysPerMonth && workingHours < workingHoursPerMonth) {
			workingDays++;
			if (isEmployeePresent()) {
				workingHours += FULL_DAY_WORKING_HOURS;
				wages += dailyWage;
			}
		}
		return wages;
	}

	private boolean isEmployeePresent() {
		return new Random().nextBoolean();
	}

	public static void main(String[] args) {

		EmployeeWageProblem jioMart = new EmployeeWageProblem("JIO Mart", 160, 20, 100);
		EmployeeWageProblem bigBasket = new EmployeeWageProblem("Big Basket", 280, 22, 110);

		System.out.println("Monthly wage for an employee of company " + jioMart.getCompanyName() + " is "
				+ jioMart.getWagesForMonth());
		System.out.println("Monthly wage for an employee of company " + bigBasket.getCompanyName() + " is "
				+ bigBasket.getWagesForMonth());
	}
}
