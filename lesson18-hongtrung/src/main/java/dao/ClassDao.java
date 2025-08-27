package dao;

import java.util.List;

import persistence.dto.ClassStudentCountDTO;

public interface ClassDao {

	/**
	 * Get class name and student count
	 */
	List<ClassStudentCountDTO> getClassNameAndStudentCount();
}
