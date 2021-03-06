package ua.lviv.lgs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import ua.lviv.lgs.model.Student;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext appContext = SpringApplication.run(SpringBootDemoApplication.class, args);

		Student student = (Student) appContext.getBean("student");
		System.out.println(student);
	}

}
