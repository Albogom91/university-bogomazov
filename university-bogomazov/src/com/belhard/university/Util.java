package com.belhard.university;

public class Util {

	public static double getGradePointAverageGroup(Group group) {
		double sum = 0;
		Student[] temp = group.getStudents();
		for (int i = 0; i < group.getNumberOfStudents(); i++) {
			sum += temp[i].getAcademicRecord();
		}
		double gradePointAverage = sum / group.getNumberOfStudents();
		return gradePointAverage;
	}

	public static double getGradePointAverageFaculty(Faculty faculty) {
		double sum = 0;
		int numberOfStudents = 0;
		Group[] temp = faculty.getGroups();
		for (int i = 0; i < faculty.getNumberOfGroups(); i++) {
			sum += getGradePointAverageGroup(temp[i]) * temp[i].getNumberOfStudents();
			numberOfStudents += temp[i].getNumberOfStudents();
		}
		double gradePointAverageFaculty = sum / numberOfStudents;
		return gradePointAverageFaculty;
	}

	public static double getGradePointAverageStudyYear(Faculty faculty, int studyYear) {
		double sum = 0;
		int numberOfStudents = 0;
		Group[] temp = faculty.getGroups();
		for (int i = 0; i < faculty.getNumberOfGroups(); i++) {
			if (temp[i].getStudyYear() == studyYear) {
				sum += getGradePointAverageGroup(temp[i]) * temp[i].getNumberOfStudents();
				numberOfStudents += temp[i].getNumberOfStudents();
			}
		}
		double gradePointAverageStudyYear = sum / numberOfStudents;
		return gradePointAverageStudyYear;
	}
}
