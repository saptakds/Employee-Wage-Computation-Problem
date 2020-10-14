package com.saptak.employeewage;

import java.util.Random;

public class CompanyEmpWage {

	static final int FULL_DAY_WORKING_HOURS = 8;
	private final String companyName;
	final int dailyWage;
	final int workingDaysPerMonth;
	final int workingHoursPerMonth;
	long monthlyWage;

	public CompanyEmpWage(String companyName, int dailyWage, int workingDaysPerMonth, int workingHoursPerMonth) {
		this.companyName = companyName;
		this.dailyWage = dailyWage;
		this.workingDaysPerMonth = workingDaysPerMonth;
		this.workingHoursPerMonth = workingHoursPerMonth;
	}

	public void setMonthlyWage(long monthlyWage) {
		this.monthlyWage = monthlyWage;
	}

	boolean isEmployeePresent() {
		return new Random().nextBoolean();
	}

	@Override
	public String toString() {
		return "Monthly wage for an employee of company " + companyName + " is " + monthlyWage;
	}

}
