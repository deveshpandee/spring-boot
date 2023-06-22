package com.luv2code.cruddemo;

import com.luv2code.cruddemo.dao.StudentDAO;
import com.luv2code.cruddemo.dao.StudentDAOImpl;
import com.luv2code.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandlinerunner (StudentDAO studentDAO) {
		return runner -> {
//			createStudent(studentDAO)

			createMultipleStudent(studentDAO);

//			readStudent(studentDAO);

//			queryForStudents(studentDAO);

//			queryForStudentsByLastName(studentDAO);

//			updateStudent(studentDAO);

//			deleteStudent(studentDAO);

//			deleteAllStudent(studentDAO);
		};
	}

	private void createMultipleStudent(StudentDAO studentDAO) {
		//		create the student object
		System.out.println("Creating new object ... ");
		Student tempStudent1 = new Student("MS1", "Dhoni", "dhoni@gmail.com");
		Student tempStudent2 = new Student("Dinesh", "Kartik", "kartik@gmail.com");
		Student tempStudent3 = new Student("Gautam", "Gambhir", "gambhir@gmail.com");
		Student tempStudent4 = new Student("Shreyesh", "Iyer", "iyer@gmail.com");
		Student tempStudent5 = new Student("Shuryakumar", "Yadav", "surya@gmail.com");


//		save the student object
		System.out.println("Saving the student ...");
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);
		studentDAO.save(tempStudent4);
		studentDAO.save(tempStudent5);

//		display the id of saved object
		System.out.println("Saved student. Generated id: " + tempStudent1.getId()+" "+ tempStudent2.getId()+" "+
				tempStudent3.getId()+" "+ tempStudent4.getId()+" "+ tempStudent5.getId()+" " );

	}

	private void deleteAllStudent(StudentDAO studentDAO) {
		System.out.println("Deleting all rows.");
		int rowsDeleted = studentDAO.deleteAll();
		System.out.println(rowsDeleted+ " rows deleted");

	}

	private void deleteStudent(StudentDAO studentDAO) {
		int id=9;
		System.out.println("deleting student with id: "+ id);
		studentDAO.deleteStudent(id);


	}

	private void updateStudent(StudentDAO studentDAO) {
		//retrieve student
		int id =9;
		System.out.println("Getting details for student with id: "+id);
		Student theStudent = studentDAO.findById(id);

		//change first name
		System.out.println("Updating first name...");
		theStudent.setFirstName("Prithvi");

		//update first name
		studentDAO.updateStudent(theStudent);

		//display the updated student
		System.out.println("Updated student: "+ theStudent);
	}

	private void queryForStudentsByLastName(StudentDAO studentDAO) {
//		get a list of students
		List<Student> theStudents = studentDAO.findByLastName("Jadeja");

//		display the list
		for(Student tempStudent: theStudents){
			System.out.println(tempStudent.getFirstName());
		}
	}

	private void queryForStudents(StudentDAO studentDAO) {

		//create list of students
		List<Student> theStudents = studentDAO.findAll();

		//display list of students
		for(Student theStudent: theStudents){
			System.out.println(theStudent.getFirstName() + (" ") + theStudent.getLastName());
		}

	}

	private void readStudent(StudentDAO studentDAO) {
//		create the student object
		System.out.println("Creating new object ... ");
		Student tempStudent = new Student("Shubhaman", "Gill", "gill@gmail.com");

//		save the student object
		System.out.println("Saving the student ...");
		studentDAO.save(tempStudent);

//		display the id of saved object
		int theId = tempStudent.getId();
		System.out.println("Saved student. Generated id: " + theId );

//		retrieve student based on the id: primary key
		System.out.println("Retrieving student...");
		Student myStudent = studentDAO.findById(theId);

//		display student
		System.out.println("Found the student: " + myStudent);
	}


}
