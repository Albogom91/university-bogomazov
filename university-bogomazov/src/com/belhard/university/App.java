package com.belhard.university;

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
		
		System.out.println(student1.getShortStudentInfo());
		
		Teacher teacher1 = new Teacher("Ollie", "Johnson");
		Teacher teacher2 = new Teacher("Peter", "Stevenson");
		
		System.out.println(teacher1.getShortTeacherInfo());
		
		System.out.println();
		
		Group group1 = new Group(527);
		group1.setTeacher(teacher1);
		group1.setStudyYear(1);
		
		Group group2 = new Group(528);
		group2.setStudyYear(1);
		Group group3 = new Group(627);
		group3.setStudyYear(2);
		Group group4 = new Group(629);
		group4.setStudyYear(2);
		
		group1.addStudent(student1);
		group1.addStudent(student2);
		group1.addStudent(student3);
		group2.addStudent(student5);
		group2.addStudent(student6);
		group2.addStudent(student7);
		group3.addStudent(student8);
		group3.addStudent(student9);
		group3.addStudent(student10);
		group4.addStudent(student11);
		group4.addStudent(student12);
		
		System.out.println("Initial group:");		
		System.out.println(group1.getGroupInfo());
		System.out.print("Initial group GPA:");
		System.out.printf("%.2f", Util.getGradePointAverageGroup(group1));
		System.out.println();
		System.out.println();
		
		group1.removeStudent(student3);
		
		System.out.println("Corrected group:");		
		System.out.println(group1.getGroupInfo());
		
		group1.addStudent(student4);		
		System.out.println("Newly corrected group:");
		System.out.println(group1.getGroupInfo());
		System.out.print("Newly corrected group GPA:");
		System.out.printf("%.2f", Util.getGradePointAverageGroup(group1));
		System.out.println();
		System.out.println();
		
		group1.setTeacher(teacher2);		
		System.out.println("Newly corrected (new teacher) group:");
		System.out.println(group1.getGroupInfo());
		
		Faculty faculty1 = new Faculty("Naval engineering");
		
		faculty1.addGroup(group2);
		faculty1.addGroup(group3);
		faculty1.addGroup(group4);
		
		System.out.print("GPA of naval engineers:");
		System.out.printf("%.2f", Util.getGradePointAverageFaculty(faculty1));
		System.out.println();
		
		System.out.print("GPA of naval engineers(second year of study):");
		System.out.printf("%.2f", Util.getGradePointAverageStudyYear(faculty1, 2));
		System.out.println();
		
	}

}
