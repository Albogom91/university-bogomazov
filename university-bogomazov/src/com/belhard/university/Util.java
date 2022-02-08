package com.belhard.university;

public class Util {

	public static double getGradePointAverageGroup(Group group) {
		double sum = 0;
		for (int i = 0; i < group.getNumberOfStudents(); i++) {
			Student s = (Student) group.getStudents().getInstances()[i];
			sum += s.getAcademicRecord();
		}
		double gradePointAverage = sum / group.getNumberOfStudents();
		return gradePointAverage;
	}
	
	public static void showObjectArray(Object[] objects) {
		for(int i = 0; i < objects.length; i++) {
			System.out.println(objects[i].toString());
		}
	}

}
