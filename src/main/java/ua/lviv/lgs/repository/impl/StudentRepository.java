package ua.lviv.lgs.repository.impl;

import java.util.LinkedList;
import ua.lviv.lgs.repository.RepositoryOperations;

public class StudentRepository<Student> implements RepositoryOperations<Student> {

	private LinkedList<Student> students = new LinkedList<>();

	@Override
	public Student create(int id, Student user) {
		students.add(id, user);
		return user;
	}

	@Override
	public Student read(int id) {
		return students.get(id);
	}

	@Override
	public Student update(int id, Student user) {
		students.set(id, user);
		return students.get(id);
	}

	@Override
	public void delete(int id) {
		students.remove(id);
	}

	@Override
	public LinkedList<Student> readAll() {
		return students;
	}

}
