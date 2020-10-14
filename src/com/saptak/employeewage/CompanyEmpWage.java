package com.saptak.employeewage;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class CompanyEmpWage {

	static final int FULL_DAY_WORKING_HOURS = 8;
	private final String companyName;
	final int dailyWage;
	final int workingDaysPerMonth;
	final int workingHoursPerMonth;
	long monthlyWage;
	Map<String, Long> dailyWagesRecord;

	public CompanyEmpWage(String companyName, int dailyWage, int workingDaysPerMonth, int workingHoursPerMonth) {
		this.companyName = companyName;
		this.dailyWage = dailyWage;
		this.workingDaysPerMonth = workingDaysPerMonth;
		this.workingHoursPerMonth = workingHoursPerMonth;
		dailyWagesRecord = new HashMap<String, Long>();
	}

	public void setMonthlyWage(long monthlyWage) {
		this.monthlyWage = monthlyWage;
	}

	public void setDailyWagesRecord(Map<String, Long> dailyWagesRecord) {
		this.dailyWagesRecord = dailyWagesRecord;
	}

	boolean isEmployeePresent() {
		return new Random().nextBoolean();
	}

	@Override
	public String toString() {
		return "Monthly wage for an employee of company " + companyName + " is " + monthlyWage;
	}

}
