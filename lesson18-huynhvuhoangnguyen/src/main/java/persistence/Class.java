package persistence;

import java.util.List;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "T01_CLASS")
public class Class {
   
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "C01_CLASS_ID")
    private Integer id;

    @Column(name = "C01_CLASS_NAME")
    private String name;

    @Column(name = "C01_TEACHER")
    private String teacher;

    @OneToMany(mappedBy = "classEntity")
    private List<Student> students;
    
    public Class() {
	}

	public Class(Integer id, String name, String teacher, List<Student> students) {
		this.id = id;
		this.name = name;
		this.teacher = teacher;
		this.students = students;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
    
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Class that)) return false;
        return Objects.equals(getId(), that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

	@Override
	public String toString() {
		return "Class [name=" + name + ", teacher=" + teacher + ", students=" + students + "]";
	}
    
}

