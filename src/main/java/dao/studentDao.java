package dao;

import java.util.List;

import persistence.student;

public interface studentDao {
	/**
	 * get list of all student
	 * 
	 * @return list of {@link student}
	 */

	List<student> getAll();
}
