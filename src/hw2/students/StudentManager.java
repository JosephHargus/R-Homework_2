package hw2.students;

import java.util.ArrayList;

public class StudentManager {
	
	ArrayList<Student> students;
	
	public StudentManager() {
		this.students = new ArrayList<Student>();
	}

	public boolean readFromFile(String fileName) {
		return false;
	}
	
	public void displayStudents() {
		
	}
	
	public boolean searchStudentById(int id) {
		return false;
	}
	
	public boolean updateStudentGradeById(int id, double grade) {
		boolean stuExists = searchStudentById(id);
		if (stuExists) {
			for (Student student : students) {
				if (student.getId() == id) {
					student.setGrade(grade);
					return true;
				}
			}
		}
		return false;
	}
}
