package entity;

import java.io.Serializable;
import jakarta.persistence.*;

@Embeddable
public class ResultId implements Serializable {
	private int studentId;
	private String subject;

	// Getters and Setters
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	// equals & hashCode
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof ResultId))
			return false;
		ResultId that = (ResultId) o;
		return studentId == that.studentId && subject.equals(that.subject);
	}

	@Override
	public int hashCode() {
		return studentId + subject.hashCode();
	}
}