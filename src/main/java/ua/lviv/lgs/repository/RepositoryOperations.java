package ua.lviv.lgs.repository;

import java.util.LinkedList;

public interface RepositoryOperations<T> {

	T create(int id, T t);

	T read(int id);

	T update(int id, T t);

	void delete(int id);

	LinkedList<T> readAll();

}
