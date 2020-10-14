package com.saptak.employeewage;

public class EmpWageBuilder {

	private CompanyEmpWage[] empWages;

	public EmpWageBuilder() {
		empWages = new CompanyEmpWage[2];
	}

	public static void main(String[] args) {

		EmpWageBuilder emps = new EmpWageBuilder();
		emps.empWages[0] = new CompanyEmpWage("Big Basket", 280, 22, 110);
		emps.empWages[1] = new CompanyEmpWage("JIO Mart", 200, 20, 100);

		for (int i = 0; i < 2; i++) {
			System.out.println(emps.empWages[i]);
		}
	}
}
