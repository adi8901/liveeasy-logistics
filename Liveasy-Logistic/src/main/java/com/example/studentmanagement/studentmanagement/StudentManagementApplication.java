package com.example.studentmanagement.studentmanagement;

import com.example.studentmanagement.studentmanagement.entity.Student;
import com.example.studentmanagement.studentmanagement.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementApplication implements CommandLineRunner {
	
	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
//		Student student1 = new Student("Adi","Bhojani","bhojaniadi@gmail.com");
//		studentRepository.save(student1);
//
//		Student student2 = new Student("Ishan","Jatt","ishanjat@gmail.com");
//		studentRepository.save(student2);
//
//		Student student3 = new Student("Vaidik","Khorasia","vak3301@gmail.com");
//		studentRepository.save(student3);
//
//		Student student4 = new Student("Anish","Navadiya","anishnavadiya@gmail.com");
//		studentRepository.save(student4);
//
//		Student student5 = new Student("Jay","Pandit","jp1410@gmail.com");
//		studentRepository.save(student5);
	}
}
