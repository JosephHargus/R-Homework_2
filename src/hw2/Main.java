package hw2;

import hw2.students.StudentManager;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentManager studentManager = new StudentManager();
		boolean fileReadStatus = studentManager.readFromFile("studentsData.txt");

	}

}
