package dao;

import java.util.List;

import persistence.Student;

public interface StudentDao {

	/**
	 * Get all student by class id
	 * 
	 * @param id the given id
	 * @return {@link Student}
	 */
    List<Student> getByClassId(int classId);

    /**
     * Get students who have Math >= 8 and Literature >= 8,
     * along with their class name and total count per class
     */
    List<Object[]> getExcellentStudentsWithClassInfo();

}
