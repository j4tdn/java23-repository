package persistence;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.*;


@Entity
@Table(name = "t01_class")
public class Class {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "C01_CLASS_ID")
    private Integer classId;
	
	@Column(name = "C01_CLASS_NAME", nullable = false)
    private String className;
	
	@Column(name = "C01_CLASS_TEACHER")
    private String classTeacher;
	
	@OneToMany(mappedBy = "studentClass", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Student> students = new ArrayList<>();

	public Class() {
	}
	
	public Class(String className, String classTeacher) {
        this.className = className;
        this.classTeacher = classTeacher;
    }

	public Integer getClassId() {
		return classId;
	}

	public void setClassId(Integer classId) {
		this.classId = classId;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getClassTeacher() {
		return classTeacher;
	}

	public void setClassTeacher(String classTeacher) {
		this.classTeacher = classTeacher;
	}
	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		
		if (!(o instanceof Class that)) {
			return false;
		}
		
		return Objects.equals(getClassId(), that.getClassId());
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getClassId());
	}

	@Override
	public String toString() {
		return "Class [classId=" + classId + ", className=" + className + ", classTeacher=" + classTeacher + "]";
	}
	
}

