package service;

import java.util.List;

import persistence.Student;

public interface StudentService {

	/**
	 * Get students by classId
	 * 
	 * @return list of students
	 */
//	List<Student> getAll();
	List<Student> getByClassId(int classId);
}
