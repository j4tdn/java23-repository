package persistence;

import java.math.BigDecimal;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "T03_RESULT")
public class Result {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ManyToOne
    @JoinColumn(name = "C03_STUDENT_ID")
    private Student id;

    @Id
    @Column(name = "C03_SUBJECT")
    private String subject;

    @Column(name = "C03_SCORE")
    private BigDecimal score;
    
    public Result() {
	}

	public Result(Student id, String subject, BigDecimal score) {
		this.id = id;
		this.subject = subject;
		this.score = score;
	}

	public Student getId() {
		return id;
	}

	public void setStudent(Student student) {
		this.id = student;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public BigDecimal getScore() {
		return score;
	}

	public void setScore(BigDecimal score) {
		this.score = score;
	}
    
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Result that)) return false;
        return Objects.equals(getId(), that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

	@Override
	public String toString() {
		return "Result [subject=" + subject + ", score=" + score + "]";
	}
    
}


