package persistence;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Embeddable;

@Embeddable
public class ResultId implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer studentId;
	private String subject;
	
	public ResultId() {
	}

	public ResultId(Integer studentId, String subject) {
		super();
		this.studentId = studentId;
		this.subject = subject;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ResultId)) return false;
        ResultId that = (ResultId) o;
        return Objects.equals(studentId, that.studentId) &&
               Objects.equals(subject, that.subject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId, subject);
    }
}
