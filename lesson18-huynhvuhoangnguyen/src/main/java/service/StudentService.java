package service;

import java.util.List;

import persistence.Student;

public interface StudentService {
	
	/**
	 * Get all student by class id
	 * 
	 * @param id the given id
	 * @return {@link Student}
	 */
	List<Student> getByClassId();

}
