package persistence;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "t02_class")
public class Class {

    @Id
    @Column(name = "C02_CLASS_ID")
    private Integer id;

    @Column(name = "C02_CLASS_NAME")
    private String name;

    @Column(name = "C02_TEACHER")
    private String teacher;

    // Quan hệ 1-N: Một lớp có nhiều học sinh
    @OneToMany(mappedBy = "classEntity")
    private List<Student> students = new ArrayList<>();

    public Class() {
    }

    public Class(Integer id, String name, String teacher) {
        this.id = id;
        this.name = name;
        this.teacher = teacher;
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
		if (this == o) {
			return true;
		}
		
		if (!(o instanceof Class that)) {
			return false;
		}
		
		return Objects.equals(getId(), that.getId());
	}

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "ClassEntity [id=" + id + ", name=" + name + ", teacher=" + teacher + "]";
    }
}
