package entity;

import jakarta.persistence.*;

@Entity
@Table(name = "result")
public class Result {

	@EmbeddedId
	private ResultId id;

	@ManyToOne
	@MapsId("studentId")
	@JoinColumn(name = "student_id")
	private Student student;

	@Column(name = "score")
	private double score;

	// Getters and Setters
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

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}
}