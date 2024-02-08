package hw2.students;

import java.util.ArrayList;

public class StudentManager {
	
	private ArrayList<Student> students;
	
	public StudentManager() {
		this.students = new ArrayList<Student>();
	}

	public boolean readFromFile(String fileName) {
		return false;
	}
	
	public void displayStudents() {
		
		//check for an empty array
		if(this.students.isEmpty()) {
			System.out.println("There are no students in the StudentManager.");
			return;
		}
		
		//print the Student objects
		for(Student student : this.students) {
			System.out.println(student.toString());
		}
		return;
		
	}
	
	public boolean searchStudentById(int id) {
		return false;
	}
	
	public boolean updateStudentGradeById(int id, double grade) {
		return false;
	}
}
