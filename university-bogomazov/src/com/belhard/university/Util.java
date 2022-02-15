package com.belhard.university;

public class Util {

	public static double getGradePointAverageGroup(Group group) {
		double sum = 0;
		Student[] temp = group.toArrayStudents();
		for (int i = 0; i < group.getNumberOfStudents(); i++) {
			sum += temp[i].getAcademicRecord();
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
