package dao;

import java.util.List;

import persistence.Student;

public interface StudentDao {

	/**
	 * Get students by classId
	 */
	List<Student> getByClassId(int classId);
}
