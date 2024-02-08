package hw2.students;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
	
	private ArrayList<Student> students;
	
	public StudentManager() {
		this.students = new ArrayList<Student>();
	}

	public boolean readFromFile(String fileName) {
		try {
			FileInputStream file = new FileInputStream(fileName);
			Scanner fileContents = new Scanner(file);
			
			while(fileContents.hasNext()) {
				String studentInfo = fileContents.nextLine();
				String[] studentInfoArray = studentInfo.split(" ");
				
				int id = Integer.parseInt(studentInfoArray[0]);
				String name = studentInfoArray[1] + " " + studentInfoArray[2];
				double grade = Double.parseDouble(studentInfoArray[3]);
				
				Student newStudent = new Student(id, name, grade); 
				students.add(newStudent);
			}
			fileContents.close();
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
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
