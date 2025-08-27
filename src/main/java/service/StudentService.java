package service;

import java.util.List;

import persistence.student;

public interface StudentService {
	/**
	 * get list of all student
	 * 
	 * @return list of {@link student}
	 */

	List<student> getAll();
}
