package com.belhard.university;

import java.math.BigDecimal;

public class AccountantUtil {
	private static BigDecimal BONUS = BigDecimal.valueOf(1.2);
	//20% bonus as base bonus for example
	private static BigDecimal BONUS_PER_YEAR_MODIFIER = BigDecimal.valueOf(0.01);
	//Each year adds 1% to base bonus for example
	private static BigDecimal HOLIDAY_MODIFIER = BigDecimal.valueOf(2.5);
	private static BigDecimal PHD_BONUS = BigDecimal.valueOf(1.3);
	//30% bonus for Ph.D. for example
	
	public static BigDecimal countTotalBonus(Employee e) {
		BigDecimal exp = BigDecimal.valueOf(e.getYearsOfExperience());
		BigDecimal totalBonus = BONUS.add(exp.multiply(BONUS_PER_YEAR_MODIFIER));
		return totalBonus;
	}
	
	public static BigDecimal countTotalSalary(Employee e) {
		BigDecimal total = BigDecimal.valueOf(0);
		BigDecimal amount = e.getSalary().getAmount();
		BigDecimal totalBonus = countTotalBonus(e);
		if(e instanceof Teacher) {
			Teacher teacher = (Teacher) e;
			if (teacher.getPhD()) {
				totalBonus = totalBonus.multiply(PHD_BONUS);
			}
		}
		total = amount.multiply(totalBonus);
		return total;
	}
	
	public static BigDecimal countHolidayPay(Employee e) {
		BigDecimal amount = e.getSalary().getAmount();
		BigDecimal holidayPay = amount.multiply(HOLIDAY_MODIFIER);
		return holidayPay;
	}
	
	public static BigDecimal countDepTotalSalaries(Department d) {
		BigDecimal totalSalaries = BigDecimal.valueOf(0);
		Cleaner c = d.getCleaner();
		if (c != null) {
			totalSalaries = totalSalaries.add(countTotalSalary(c));
		}
		Teacher head = d.getDepHead();
		if (head != null) {
		totalSalaries = totalSalaries.add(countTotalSalary(head));
		}
		Teacher assistantHead = d.getDepAssistHead();
		if (assistantHead != null) {
		totalSalaries = totalSalaries.add(countTotalSalary(assistantHead));
		}
		for(int i = 0; i < d.getTeachers().getNumberOfInstances(); i++) {
			Teacher t = (Teacher) d.getTeachers().getInstances()[i];
			totalSalaries = totalSalaries.add(countTotalSalary(t));
		}
		return totalSalaries;		
	}
	
}
