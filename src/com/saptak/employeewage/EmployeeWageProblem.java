package com.saptak.employeewage;

import java.util.Random;

public class EmployeeWageProblem {

	private static final int FULL_DAY_WORKING_HOURS = 8;
	private static final int WAGE_PER_HOUR = 20;
	private static final int DAILY_WAGE = FULL_DAY_WORKING_HOURS * WAGE_PER_HOUR;
	private static final int PART_TIME_WORKING_HOURS = 8;
	private static final int WORKING_DAYS_PER_MONTH = 20;

	public static void main(String[] args) {
		System.out.println("-->Welcome to Employee Wage Computation<--");
		switch (getEmployeeType()) {
		case "Full-time":
			System.out.println("Employment: Full-time");
			break;
		case "Part-time":
			System.out.println("Employment: Part-time");
			break;
		default:
			break;
		}
		System.out.println("Daily wage: " + DAILY_WAGE);
		System.out.println("Wages for month: " + getWagesForMonth());
	}

	private static long getWagesForMonth() {
		long wages = 0;
		for (int i = 1; i <= WORKING_DAYS_PER_MONTH; i++) {
			System.out.println("Day #" + i);
			if (isEmployeePresent()) {
				System.out.println("Present");
				wages += DAILY_WAGE;
			} else {
				System.out.println("Absent");
			}
		}
		return wages;
	}

	private static boolean isEmployeePresent() {
		return new Random().nextBoolean();
	}

	private static String getEmployeeType() {
		String[] arr = { "Full-time", "Part-time" };
		return arr[new Random().nextInt(arr.length)];
	}
}
