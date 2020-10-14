package com.saptak.employeewage;

import java.util.Random;

public class EmpWageBuilder {

	private static final int FULL_DAY_WORKING_HOURS = 8;
	private final String companyName;
	private final int dailyWage;
	private final int workingDaysPerMonth;
	private final int workingHoursPerMonth;
	private long monthlyWage;

	public EmpWageBuilder(String companyName, int dailyWage, int workingDaysPerMonth, int workingHoursPerMonth) {
		this.companyName = companyName;
		this.dailyWage = dailyWage;
		this.workingDaysPerMonth = workingDaysPerMonth;
		this.workingHoursPerMonth = workingHoursPerMonth;
		calcWagesForMonth();
	}

	public void calcWagesForMonth() {
		long wages = 0;
		int workingHours = 0, workingDays = 0;
		while (workingDays < workingDaysPerMonth && workingHours < workingHoursPerMonth) {
			workingDays++;
			if (isEmployeePresent()) {
				workingHours += FULL_DAY_WORKING_HOURS;
				wages += dailyWage;
			}
		}
		monthlyWage = wages;
	}

	private boolean isEmployeePresent() {
		return new Random().nextBoolean();
	}

	@Override
	public String toString() {
		return "Monthly wage for an employee of company " + companyName + " is " + monthlyWage;
	}

	public static void main(String[] args) {

		EmpWageBuilder jioMart = new EmpWageBuilder("JIO Mart", 160, 20, 100);
		EmpWageBuilder bigBasket = new EmpWageBuilder("Big Basket", 280, 22, 110);

		jioMart.calcWagesForMonth();
		bigBasket.calcWagesForMonth();

		System.out.println(jioMart);
		System.out.println(bigBasket);
	}
}
