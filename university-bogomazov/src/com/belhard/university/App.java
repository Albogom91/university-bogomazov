package com.belhard.university;

import java.math.BigDecimal;

import com.belhard.university.Department.DepName;
import com.belhard.university.Faculty.FacultyName;
import com.belhard.university.Money.Currency;

public class App {

	public static void main(String[] args) {
		
		Cleaner cleaner1 = new Cleaner("Steven", "Rigley");
		Teacher teacher1 = new Teacher("George", "Washington");
		teacher1.setPhD(true);
		Teacher teacher2 = new Teacher("William", "Henry", "Harrison");
		Teacher teacher3 = new Teacher("Abe", "Lincoln");
		Teacher teacher4 = new Teacher("Dwight", "Eisenhower");
		teacher4.setPhD(true);
		Teacher teacher5 = new Teacher("Richard", "Nixon");
		Teacher teacher6 = new Teacher("Theodore", "Roosevelt");
		
		cleaner1.setSalary(new Money(Currency.USD, BigDecimal.valueOf(1000)));
		teacher1.setSalary(new Money(Currency.USD, BigDecimal.valueOf(3000)));
		teacher2.setSalary(new Money(Currency.USD, BigDecimal.valueOf(3000)));
		teacher3.setSalary(new Money(Currency.USD, BigDecimal.valueOf(2000)));
		teacher4.setSalary(new Money(Currency.USD, BigDecimal.valueOf(2000)));
		teacher5.setSalary(new Money(Currency.USD, BigDecimal.valueOf(2000)));
		teacher6.setSalary(new Money(Currency.USD, BigDecimal.valueOf(2000)));
		
		cleaner1.setYearsOfExperience(10);
		
		teacher1.setYearsOfExperience(10);
		teacher2.setYearsOfExperience(10);
		
		System.out.println("Current salary of " + teacher1.toString() + " is:");
		System.out.println(AccountantUtil.countTotalSalary(teacher1));
		System.out.println();
		System.out.println("Current salary of " + teacher2.toString() + " is:");
		System.out.println(AccountantUtil.countTotalSalary(teacher2));
		System.out.println();
		
		Collective.setCollectiveSize(10);
		Department department1 = new Department(DepName.HISTORY_AND_LITERATURE);
		department1.setDepHead(teacher1);
		department1.setDepAssistHead(teacher2);
		
		department1.setCleaner(cleaner1);	
		
		department1.addTeacher(teacher3);
		department1.addTeacher(teacher4);
		department1.addTeacher(teacher5);
		
		System.out.println(department1.getDepInfo());
		System.out.println("Current department of " + department1.getDepName() + " total salaries are: ");
		System.out.println(AccountantUtil.countDepTotalSalaries(department1));
		System.out.println();
		
		department1.removeTeacher(teacher4);
		department1.addTeacher(teacher6);
		department1.setDepAssistHead(null);
		
		System.out.println(department1.getDepInfo());
		System.out.println("Current department of " + department1.getDepName() + " total salaries are: ");
		System.out.println(AccountantUtil.countDepTotalSalaries(department1));
		
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
		
		Collective.setCollectiveSize(8);
		Group group1 = new Group(527);
		group1.setTeacher(teacher3);
		
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
		group1.removeStudent(student7);
		
		System.out.println("Corrected group:");		
		System.out.println(group1.getGroupInfo());
		System.out.print("Corrected group GPA: ");
		System.out.printf("%.2f", Util.getGradePointAverageGroup(group1));
		System.out.println();
		System.out.println();
		
		group1.addStudent(student9);		
		group1.addStudent(student10);		
		System.out.println("Newly corrected group:");
		System.out.println(group1.getGroupInfo());
		System.out.print("Newly corrected group GPA: ");
		System.out.printf("%.2f", Util.getGradePointAverageGroup(group1));
		System.out.println();
		System.out.println();
		
		Collective.setCollectiveSize(10);
		Department department2 = new Department(DepName.CHEMESTRY);
		Department department3 = new Department(DepName.MATH_AND_PHYSICS);
		Collective.setCollectiveSize(20);
		Faculty faculty1 = new Faculty(FacultyName.FACULTY_OF_NATURAL_SCIENCES);
		
		faculty1.addDepartment(department2);
		faculty1.addDepartment(department3);
		
		System.out.println(faculty1.getFacultyInfo());
		
	}

}
