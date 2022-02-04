package com.belhard.university;

import java.math.BigDecimal;

import com.belhard.university.Department.DepName;
import com.belhard.university.Money.Currency;

public class App {

	public static void main(String[] args) {
		
		Cleaner cl1 = new Cleaner("Steven", "Rigley");
		Teacher th1 = new Teacher("George", "Washington");
		th1.setPhD(true);
		Teacher th2 = new Teacher("William", "Henry", "Harrison");
		th2.setPhD(false);
		Teacher th3 = new Teacher("Abe", "Lincoln");
		Teacher th4 = new Teacher("Dwight", "Eisenhower");
		th4.setPhD(true);
		Teacher th5 = new Teacher("Richard", "Nixon");
		
		cl1.setSalary(new Money(Currency.USD, BigDecimal.valueOf(1000)));
		th1.setSalary(new Money(Currency.USD, BigDecimal.valueOf(3000)));
		th2.setSalary(new Money(Currency.USD, BigDecimal.valueOf(3000)));
		th3.setSalary(new Money(Currency.USD, BigDecimal.valueOf(2000)));
		th4.setSalary(new Money(Currency.USD, BigDecimal.valueOf(2000)));
		th5.setSalary(new Money(Currency.USD, BigDecimal.valueOf(2000)));
		
		
		cl1.setYearsOfExperience(10);
		
		th1.setYearsOfExperience(10);
		th2.setYearsOfExperience(10);
		
		System.out.println("Current salary of " + th1.toString() + " is:");
		System.out.println(AccountantUtil.countTotalSalary(th1));
		System.out.println();
		System.out.println("Current salary of " + th2.toString() + " is:");
		System.out.println(AccountantUtil.countTotalSalary(th2));
		System.out.println();
		
		Department dp1 = new Department(DepName.HISTORY_AND_LITERATURE);
		dp1.setDepHead(th1);
		dp1.setDepAssistHead(th2);
		
		dp1.addTeacher(th3);
		dp1.addTeacher(th4);
		dp1.addTeacher(th5);
		dp1.setCleaner(cl1);		
		
		System.out.println(dp1.getDepInfo());
		System.out.println("Current department of " + dp1.getDepName() + " total salaries are: ");
		System.out.println(AccountantUtil.countDepTotalSalaries(dp1));
		System.out.println();
		
		dp1.removeTeacher(th4);
		dp1.setDepAssistHead(null);
		
		System.out.println(dp1.getDepInfo());
		System.out.println("Current department of " + dp1.getDepName() + " total salaries are: ");
		System.out.println(AccountantUtil.countDepTotalSalaries(dp1));
		
		Student student1 = new Student("James", "Riley");
		Student student2 = new Student("Alexander", "Ivanovich", "Prohorov");
		Student student3 = new Student("John", "Bell");
		Student student4 = new Student("Samuel", "Dunn");
		Student student5 = new Student("Noel", "Larkin");
		Student student6 = new Student("De'Andre", "Houston");
		Student student7 = new Student("William", "McDonough");
		Student student8 = new Student("Sven", "Christiansen");
		Student student9 = new Student("Li", "Xian Yun");
		Student student10 = new Student("Ari", "Goldman");
		Student student11 = new Student("Patrick", "Schwarz");
		Student student12 = new Student("Krzysztof", "Valemski");
		
		student1.setAcademicRecord(7.4);
		student2.setAcademicRecord(7.4);
		student3.setAcademicRecord(7.3);
		student4.setAcademicRecord(8.4);
		student5.setAcademicRecord(8.4);
		student6.setAcademicRecord(8.3);
		student7.setAcademicRecord(6.4);
		student8.setAcademicRecord(6.4);
		student9.setAcademicRecord(6.3);
		student10.setAcademicRecord(9.6);
		student11.setAcademicRecord(9.4);
		student12.setAcademicRecord(9.3);
		
		System.out.println();
		
		Group group1 = new Group(527);
		group1.setTeacher(th3);
		
		/*Group group2 = new Group(528);
		group2.setStudyYear(1);
		Group group3 = new Group(627);
		group3.setStudyYear(2);
		Group group4 = new Group(629);
		group4.setStudyYear(2);*/
		
		group1.addStudent(student1);
		group1.addStudent(student2);
		group1.addStudent(student3);
		group1.addStudent(student4);
		group1.addStudent(student5);
		group1.addStudent(student6);
		group1.addStudent(student7);
		group1.addStudent(student8);
		
		System.out.println("Initial group:");		
		System.out.println(group1.getGroupInfo());
		System.out.print("Initial group GPA: ");
		System.out.printf("%.2f", Util.getGradePointAverageGroup(group1));
		System.out.println();
		System.out.println();
		
		group1.removeStudent(student3);
		
		System.out.println("Corrected group:");		
		System.out.println(group1.getGroupInfo());
		System.out.print("Corrected group GPA: ");
		System.out.printf("%.2f", Util.getGradePointAverageGroup(group1));
		System.out.println();
		System.out.println();
		
		group1.addStudent(student9);		
		System.out.println("Newly corrected group:");
		System.out.println(group1.getGroupInfo());
		System.out.print("Newly corrected group GPA: ");
		System.out.printf("%.2f", Util.getGradePointAverageGroup(group1));
		System.out.println();
		
		/*Faculty faculty1 = new Faculty("Naval engineering");
		
		faculty1.addGroup(group2);
		faculty1.addGroup(group3);
		faculty1.addGroup(group4);
		
		System.out.print("GPA of naval engineers:");
		System.out.printf("%.2f", Util.getGradePointAverageFaculty(faculty1));
		System.out.println();
		
		System.out.print("GPA of naval engineers(second year of study):");
		System.out.printf("%.2f", Util.getGradePointAverageStudyYear(faculty1, 2));
		System.out.println();*/
		
	}

}
