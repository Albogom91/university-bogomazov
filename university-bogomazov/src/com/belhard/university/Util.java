package com.belhard.university;

public class Util {

	public static double getGradePointAverageGroup(Group group) {
		double sum = 0;
		for (int i = 0; i < group.getNumberOfInstances(); i++) {
			Student s = (Student) group.getInstances()[i];
			sum += s.getAcademicRecord();
		}
		double gradePointAverage = sum / group.getNumberOfInstances();
		return gradePointAverage;
	}

}
