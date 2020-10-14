package com.saptak.employeewage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class EmpWageBuilder implements CalcEmpWage {

	private ArrayList<CompanyEmpWage> empWages;

	public EmpWageBuilder() {
		empWages = new ArrayList<CompanyEmpWage>();
	}

	public static void main(String[] args) {

		EmpWageBuilder emps = new EmpWageBuilder();
		emps.empWages.add(new CompanyEmpWage("Big Basket", 280, 22, 110));
		emps.empWages.add(new CompanyEmpWage("JIO Mart", 200, 20, 100));

		for (CompanyEmpWage cew : emps.empWages) {
			emps.calcWagesForMonth(cew);
		}

		for (CompanyEmpWage cew : emps.empWages) {
			System.out.println(cew);
			System.out.println("-->Daily wages<--");
			for (String k : cew.dailyWagesRecord.keySet()) {
				System.out.println(k + ": " + cew.dailyWagesRecord.get(k));
			}
		}

		String query = "JIO Mart";
		System.out.println(getTotalWageByCompany(query, emps.empWages));
	}

	private static String getTotalWageByCompany(String query, ArrayList<CompanyEmpWage> empWages2) {
		for (CompanyEmpWage c : empWages2) {
			if (c.companyName.equals(query)) {
				return "Total Wage: " + c.monthlyWage;
			}
		}
		return "Company not found!";
	}

	@Override
	public void calcWagesForMonth(CompanyEmpWage compEmpWage) {
		long wages = 0;
		int workingHours = 0, workingDays = 0;
		Map<String, Long> dailyWages = new HashMap<String, Long>();
		while (workingDays < compEmpWage.workingDaysPerMonth && workingHours < compEmpWage.workingHoursPerMonth) {
			workingDays++;
			if (compEmpWage.isEmployeePresent()) {
				workingHours += CompanyEmpWage.FULL_DAY_WORKING_HOURS;
				wages += compEmpWage.dailyWage;
				dailyWages.put("Day#" + workingDays, (long) compEmpWage.dailyWage);
			} else {
				dailyWages.put("Day#" + workingDays, (long) 0);
			}
		}
		compEmpWage.setMonthlyWage(wages);
		compEmpWage.setDailyWagesRecord(dailyWages);
	}
}
