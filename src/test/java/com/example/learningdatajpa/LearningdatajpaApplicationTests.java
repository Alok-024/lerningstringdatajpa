package com.example.learningdatajpa;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.learningdatajpa.entities.Student;
import com.example.learningdatajpa.repository.StudentRepository;

@SpringBootTest
class LearningdatajpaApplicationTests {
	private StudentRepository repo;

	@Test
	public void testSaveStudent() {
		Student student=new Student();
		student.setId(1l);
		student.setName("Alok");
		student.setTestScore(100);
		repo.save(student);
		Student savedStudent=repo.findById(1l).get();

		assertNotNull(savedStudent);
		
	}

}
