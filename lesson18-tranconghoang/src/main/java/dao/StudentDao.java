package dao;

import java.util.List;

import persistence.Student;

public interface StudentDao {

	/**
	 * Get all items
	 * 
	 * @return list of items
	 */
	List<Student> getByClassId();

}