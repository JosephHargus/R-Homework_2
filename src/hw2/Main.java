package hw2;

import hw2.students.StudentManager;



                                                   // Main from Ekincan Ufuktepe
		public class Main {
			public static void main(String[] args) {
			
			StudentManager studentManager = new StudentManager();

			boolean fileReadStatus = studentManager.readFromFile("studentData.txt");
		
			studentManager.displayStudents();
			
			boolean studentFound = studentManager.searchStudentById(101);
			
			boolean studentGradeUpdateStatus = studentManager.updateStudentGradeById(102, 95);

			studentManager.displayStudents();
		
			}
		}
		
	

