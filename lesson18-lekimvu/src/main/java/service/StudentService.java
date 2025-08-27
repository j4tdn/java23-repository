package service;

import java.util.List;
import persistance.Student;
public interface StudentService {
	
	/**
	 * Get all items
	 * 
	 * @return list of items
	 */
	List<Student> getAll();
}


