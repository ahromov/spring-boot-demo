package ua.lviv.lgs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import ua.lviv.lgs.model.Student;
import ua.lviv.lgs.repository.impl.StudentRepository;

@SpringBootApplication
public class SpringDemoApplication {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ConfigurableApplicationContext appContext = SpringApplication.run(SpringDemoApplication.class, args);

		Student student = (Student) appContext.getBean("student");
		StudentRepository<Student> studentsDao = (StudentRepository<Student>) appContext.getBean("studentRepository");

		studentsDao.create(student.getId(), student);
		
		System.out.println(studentsDao.readAll());

		System.out.println(studentsDao.read(student.getId()));

		student.setName("Andrew");		
		studentsDao.update(student.getId(), student);
		
		System.out.println(studentsDao.readAll());

		studentsDao.delete(student.getId());
		
		System.out.println(studentsDao.readAll());
	}

}
