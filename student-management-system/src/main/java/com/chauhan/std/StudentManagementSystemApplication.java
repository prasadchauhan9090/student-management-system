package com.chauhan.std;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.chauhan.std.entity.Student;
import com.chauhan.std.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
//		Student student1 = new Student("PRASAD", "CHAUHAN", "prasadchauan@gmail.com");
//		studentRepository.save(student1);
//		
//        Student student2 = new Student("SRINU", "CHAUHAN", "srinuchauan@gmail.com");
//		studentRepository.save(student2);
//		
//		Student student3 = new Student("SARVIN", "CHAUHAN", "sarvichauan@gmail.com");
//		studentRepository.save(student3);
		
		
	}

	
}
