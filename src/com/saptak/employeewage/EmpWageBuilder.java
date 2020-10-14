package com.saptak.employeewage;

public class EmpWageBuilder implements CalcEmpWage {

	private CompanyEmpWage[] empWages;

	public EmpWageBuilder() {
		empWages = new CompanyEmpWage[2];
	}

	public static void main(String[] args) {

		EmpWageBuilder emps = new EmpWageBuilder();
		emps.empWages[0] = new CompanyEmpWage("Big Basket", 280, 22, 110);
		emps.calcWagesForMonth(emps.empWages[0]);
		emps.empWages[1] = new CompanyEmpWage("JIO Mart", 200, 20, 100);
		emps.calcWagesForMonth(emps.empWages[1]);

		for (int i = 0; i < 2; i++) {
			System.out.println(emps.empWages[i]);
		}
	}

	@Override
	public void calcWagesForMonth(CompanyEmpWage compEmpWage) {
		long wages = 0;
		int workingHours = 0, workingDays = 0;
		while (workingDays < compEmpWage.workingDaysPerMonth && workingHours < compEmpWage.workingHoursPerMonth) {
			workingDays++;
			if (compEmpWage.isEmployeePresent()) {
				workingHours += CompanyEmpWage.FULL_DAY_WORKING_HOURS;
				wages += compEmpWage.dailyWage;
			}
		}
		compEmpWage.setMonthlyWage(wages);

	}
}
