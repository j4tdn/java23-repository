package persistence;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "t01_student")
public class Student {

    @Id
    @Column(name = "C01_STUDENT_ID")
    private Integer id;

    @Column(name = "C01_STUDENT_NAME")
    private String name;

    @Column(name = "C01_GENDER")
    private String gender;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "C01_CLASS_ID", referencedColumnName = "C02_CLASS_ID")
    private Class classEntity;

    public Student() {
    }

    public Student(Integer id, String name, String gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Class getClassEntity() {
        return classEntity;
    }

    public void setClassEntity(Class classEntity) {
        this.classEntity = classEntity;
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
        return "Student [id=" + id + ", name=" + name + ", gender=" + gender + "]";
    }
}
