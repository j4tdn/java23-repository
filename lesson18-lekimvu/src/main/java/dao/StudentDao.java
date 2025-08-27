package dao;

import java.util.List;
import persistance.Student;

public interface StudentDao {
	
	/**
	 * Get all Student
	 * 
	 * @return list of items
	 */
	List<Student> getAll();

}
