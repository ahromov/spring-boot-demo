package ua.lviv.lgs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ua.lviv.lgs.model.Student;

@Configuration
public class CustomConfiguration {

	@Bean(name = "student")
	public Student getStudent() {
		return new Student(0, "Student", 20);
	}

}
