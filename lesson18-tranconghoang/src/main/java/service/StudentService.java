package service;

import java.util.List;

import persistence.Student;

public interface StudentService {

	/**
	 * Get all items
	 * 
	 * @return list of items
	 */
	List<Student> getAll();
}
