package com.saptak.employeewage;

import java.util.Random;

public class EmployeeWageProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-->Welcome to Employee Wage Computation<--");
		if (isEmployeePresent()) {
			System.out.println("Employee is PRESENT");
		} else {
			System.out.println("Employee is ABSENT");
		}
	}

	public static boolean isEmployeePresent() {
		return new Random().nextBoolean();
	}
}
