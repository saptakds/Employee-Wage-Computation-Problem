package com.saptak.employeewage;

import java.util.Random;

public class EmployeeWageProblem {

	private static final int FULL_DAY_WORKING_HOURS = 8;
	private static final int WAGE_PER_HOUR = 20;
	private static final int DAILY_WAGE = FULL_DAY_WORKING_HOURS * WAGE_PER_HOUR;
	private static final int PART_TIME_WORKING_HOURS = 8;

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
		if (isEmployeePresent()) {
			System.out.println("Employee is PRESENT");
		} else {
			System.out.println("Employee is ABSENT");
		}
	}

	private static boolean isEmployeePresent() {
		return new Random().nextBoolean();
	}

	private static String getEmployeeType() {
		String[] arr = { "Full-time", "Part-time" };
		return arr[new Random().nextInt(arr.length)];
	}
}
