package service;

import java.util.List;

import persistence.dto.ClassStudentCountDTO;

public interface ClassService {

	List<ClassStudentCountDTO> getClassNameAndStudentCount();}
