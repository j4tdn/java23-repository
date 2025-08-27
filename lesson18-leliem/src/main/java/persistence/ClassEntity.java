package persistence;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "class")
public class ClassEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String teacher;

    @OneToMany(mappedBy = "classEntity", cascade = CascadeType.ALL)
    private List<StudentEntity> students;

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getTeacher() { return teacher; }
    public void setTeacher(String teacher) { this.teacher = teacher; }

    public List<StudentEntity> getStudents() { return students; }
    public void setStudents(List<StudentEntity> students) { this.students = students; }
}
