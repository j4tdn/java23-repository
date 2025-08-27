package persistence;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "t02_Student")
public class Student {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "C02_STUDENT_ID")
    private Integer id;

    @Column(name = "C02_NAME", nullable = false)
    private String name;

    @Column(name = "C02_GENDER", nullable = false)
    private String gender;

    @Column(name = "C02_CLASS_ID")
    private Integer classId;

    /**
     * Empty constructor
     */
    public Student() {
    }

    /**
     * Constructor with name
     */
    public Student(String name, String gender, Integer classId) {
        this.name = name;
        this.gender = gender;
        this.classId = classId;
    }

    /**
     * Full constructor
     */
    public Student(Integer id, String name, String gender, Integer classId) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.classId = classId;
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

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student that)) return false;
        return Objects.equals(getId(), that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", classId=" + classId + "]";
    }
}