package com.belhard.university;

public class Util {

	public static double getGradePointAverageGroup(Collective c) {
		double sum = 0;
		for (int i = 0; i < c.getNumberOfPersons(); i++) {
			Student s = (Student) c.getPersons()[i];
			sum += s.getAcademicRecord();
		}
		double gradePointAverage = sum / c.getNumberOfPersons();
		return gradePointAverage;
	}

	/*public static double getGradePointAverageFaculty(Faculty faculty) {
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
	}*/
}
