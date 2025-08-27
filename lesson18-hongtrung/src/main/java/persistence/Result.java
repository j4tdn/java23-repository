package persistence;

import java.math.BigDecimal;

import jakarta.persistence.*;

@Entity
@Table(name = "t03_result")
public class Result {

	@EmbeddedId
    private ResultId id;

	@ManyToOne(fetch = FetchType.LAZY)
	@MapsId("studentId") 
	@JoinColumn(name = "C03_STUDENT_ID",referencedColumnName = "C02_STUDENT_ID", nullable = false)
	private Student student;
	
	@Column(name = "C03_SCORE", precision = 4, scale = 2)
    private BigDecimal score;
	
	public Result() {
	}

	public Result(ResultId id, Student student, BigDecimal score) {
		super();
		this.id = id;
		this.student = student;
		this.score = score;
	}

	public ResultId getId() {
		return id;
	}

	public void setId(ResultId id) {
		this.id = id;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public BigDecimal getScore() {
		return score;
	}

	public void setScore(BigDecimal score) {
		this.score = score;
	}

	
	
}
