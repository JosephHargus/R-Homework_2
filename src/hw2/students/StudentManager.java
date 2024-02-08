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
			
		} catch (FileNotFoundException e) {
			System.out.println("File was not found. Please try again.");
			return false;
		} catch(Exception e) {
			System.out.println("An error occurred: " + e);
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
		  for (Student s: students) {
	            if (s!= null && s.equals(new Student(id, "", 0))) {
	                System.out.println("Student found: " + s.toString());
	                return true;
	            }
	        }
		  System.out.println("Student " + id + " student id not found");
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
