package com.belhard.university;

import java.math.BigDecimal;


import com.belhard.university.Department.DepName;
import com.belhard.university.Faculty.FacultyName;
import com.belhard.university.Money.Currency;
import com.belhard.university.Teacher.Discipline;

import com.belhard.university.datastructures.*;

public class App {

	public static void main(String[] args) {
		
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
		
		Teacher teacher3 = new Teacher("Abe", "Lincoln");
		
		Group group1 = new Group(527);
		group1.setTeacher(teacher3);
		
		System.out.println(group1.getGroupInfo());
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
		System.out.printf("%.2f\n\n", Util.getGradePointAverageGroup(group1));
		
		group1.removeStudent(student3);
		group1.removeStudent(student7);
		
		System.out.println("Corrected group:");		
		System.out.println(group1.getGroupInfo());
		System.out.println("Number of elements in group1 dynamic array: " + group1.size());
		System.out.print("Corrected group: GPA: ");
		System.out.printf("%.2f\n\n", Util.getGradePointAverageGroup(group1));
		
		group1.addStudent(student9);		
		group1.addStudent(student10);
		
		System.out.println("Newly corrected group:");		
		System.out.println(group1.getGroupInfo());
		System.out.println("Number of elements in group1 dynamic array: " + group1.size());
		System.out.print("Newly corrected group GPA: ");
		System.out.printf("%.2f\n\n", Util.getGradePointAverageGroup(group1));
		
		student1.setStudyYear(2);
		System.out.println(student1.introduceYourself());
		
		System.out.println("Group1 contains student4: " + group1.containsStudent(student4));
		
		System.out.println("Student with index 3 in group1: " + group1.getStudent(3).toString());
		
		System.out.println();
		
		System.out.println("Students array in group1:");
		Util.showObjectArray(group1.toArrayStudents());
		
		System.out.println();
		
		Cleaner cleaner1 = new Cleaner("Steven", "Rigley");
		Teacher teacher1 = new Teacher("George", "Washington");
		teacher1.setPhD(true);
		Teacher teacher2 = new Teacher("William", "Henry", "Harrison");
		Teacher teacher4 = new Teacher("Dwight", "Eisenhower");
		teacher4.setPhD(true);
		Teacher teacher5 = new Teacher("Richard", "Nixon");
		Teacher teacher6 = new Teacher("Theodore", "Roosevelt");
		
		teacher1.setDiscipline(Discipline.HISTORY);
		System.out.println(teacher1.introduceYourself());
		cleaner1.setFloorToClean(3);
		System.out.println(cleaner1.introduceYourself());
		
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
		
		Department department1 = new Department(DepName.HISTORY_AND_LITERATURE);
		department1.setDepHead(teacher1);
		department1.setDepAssistHead(teacher2);
		
		department1.setCleaner(cleaner1);	
		
		department1.addTeacher(teacher3);
		department1.addTeacher(teacher4);
		department1.addTeacher(teacher5);
		
		System.out.println(department1.getDepInfo());
		System.out.println("Current department of " + department1.getName() + " total salaries are: ");
		System.out.println(AccountantUtil.countDepTotalSalaries(department1));
		System.out.println();
		
		department1.removeTeacher(teacher4);
		department1.addTeacher(teacher6);
		department1.setDepAssistHead(null);
		
		System.out.println(department1.getDepInfo());
		System.out.println("Current department of " + department1.getName() + " total salaries are: ");
		System.out.println(AccountantUtil.countDepTotalSalaries(department1));
		
		Department department2 = new Department(DepName.CHEMESTRY);
		Department department3 = new Department(DepName.MATH_AND_PHYSICS);
		
		Faculty faculty1 = new Faculty(FacultyName.NATURAL_SCIENCES);
		
		faculty1.setFacultyHead(teacher4);
		faculty1.addDepartment(department2);
		faculty1.addDepartment(department3);
		
		System.out.println(faculty1.getFacultyInfo());
		
		System.out.println("Hash codes:");
		System.out.println("Student:" + student1.hashCode());
		System.out.println("Teacher:" + teacher1.hashCode());
		System.out.println("Cleaner:" + cleaner1.hashCode());
		System.out.println("Group:" + group1.hashCode());
		System.out.println("Department:" + department1.hashCode());
		System.out.println("Faculty:" + faculty1.hashCode());
		
		System.out.println();
		
		System.out.println("Department1 equals department2: " + department1.equals(department2));
		System.out.println("Department1 equals department1: " + department1.equals(department1));
		System.out.println("Department1 equals null: " + department1.equals(null));
		
		System.out.println();
		System.out.println("Id's:");
		System.out.println(group1.getId());
		System.out.println(department2.getId());
		System.out.println(faculty1.getId());
		System.out.println(student10.getId());
		System.out.println(teacher1.getId());
		System.out.println(cleaner1.getId());
		
		System.out.println();
		System.out.println("Student1 equals Student1: " + student1.equals(student1));
		student1.setFirstName(null);
		System.out.println("Student1 equals Student1(after firstName set to null in student1): " + student1.equals(student1));
		System.out.println("Department1 contains teacher2: " + department1.containsTeacher(teacher2));
		System.out.println("Department1 contains teacher3: " + department1.containsTeacher(teacher3));
		System.out.println("Group1 contains student12: " + group1.containsStudent(student12));
		System.out.println("Group1 contains student8: " + group1.containsStudent(student8));
		System.out.println("Faculty1 contains department1: " + faculty1.containsDepartment(department1));
		System.out.println("Faculty1 contains department3: " + faculty1.containsDepartment(department3));
		
		System.out.println();
		Group group2 = new Group(555);
		group2.addStudent(student12);
		group2.addStudent(student12);
		System.out.println(group2.getGroupInfo());
		
		System.out.println("***Linked list***");
		System.out.println();
		
		LinkList<Student> groupList = new LinkedList<Student>("Group2");
		
		student1.setFirstName("James");
		groupList.addNode(student1);
		groupList.addNode(student2);
		groupList.addNode(student3);
		groupList.addNode(student4);
		groupList.addNode(student5);
		groupList.addNode(student6);
		
		groupList.displayList();
		
		groupList.removeNode(student4);
		groupList.removeNode(student5);
		groupList.addNode(student7);
		
		groupList.displayList();
		
		System.out.println(groupList.containsObjectInList(student1));
		System.out.println(groupList.containsObjectInList(student4));
		
		System.out.println();
		
		System.out.println("List to objects array:");
		Util.showObjectArray(groupList.getListToArray());
		
		System.out.println();
		System.out.println("***Exceptions***");
		System.out.println();
		
		student1.setAge(6);
		System.out.println(student1.getAge());
		
		cleaner1.setSalary(new Money(Currency.USD, BigDecimal.valueOf(-1000)));
		System.out.println(cleaner1.getSalary().getAmount());
		
		teacher3.setYearsOfExperience(-1);
		System.out.println(teacher3.getYearsOfExperience());
		
		cleaner1.setFloorToClean(-2);
		System.out.println(cleaner1.getFloorToClean());
		
		student1.setStudyYear(-1);
		System.out.println(student1.getStudyYear());
		
		student1.setAcademicRecord(11.1);
		System.out.println(student1.getAcademicRecord());
		
		group1.setNumber(-1);
		System.out.println(group1.getNumber());
	}

}
