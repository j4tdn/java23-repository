package persistence;

import jakarta.persistence.*;

@Entity
@Table(name = "result")
public class ResultEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private StudentEntity student;

    @Column(nullable = false)
    private String subject;

    @Column(nullable = false)
    private float score;

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public StudentEntity getStudent() { return student; }
    public void setStudent(StudentEntity student) { this.student = student; }

    public String getSubject() { return subject; }
    public void setSubject(String subject) { this.subject = subject; }

    public float getScore() { return score; }
    public void setScore(float score) { this.score = score; }
}
