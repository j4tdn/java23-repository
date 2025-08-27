package persistence;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import common.Gender;
import jakarta.persistence.*;


@Entity
@Table(name = "t02_student")
public class Student {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "C02_STUDENT_ID")
    private Integer studentId;
	
	@Column(name = "C02_STUDENT_NAME", nullable = false)
    private String studentName;
	
	@Enumerated(EnumType.STRING) 
    @Column(name = "C02_STUDENT_GENDER", nullable = false)
    private Gender studentGender;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "C02_CLASS_ID", referencedColumnName = "C01_CLASS_ID")
    private Class studentClass;
	

	@OneToMany(mappedBy = "student", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Result> results = new ArrayList<>();
	
	public Student() {
	}

	public Student(Integer studentId, String studentName, Gender studentGender, Class studentClass) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentGender = studentGender;
		this.studentClass = studentClass;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Gender getStudentGender() {
		return studentGender;
	}

	public void setStudentGender(Gender studentGender) {
		this.studentGender = studentGender;
	}

	public Class getStudentClass() {
		return studentClass;
	}

	public void setStudentClass(Class studentClass) {
		this.studentClass = studentClass;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		
		if (!(o instanceof Student that)) {
			return false;
		}
		
		return Objects.equals(getStudentId(), that.getStudentId());
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getStudentId());
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentGender=" + studentGender
				+ ", studentClassName=" + studentClass.getClassName() + "]";
	}
	
	
}
