package bean;

public class Student {

	private long studentID;
	private String fullName;
	private double theoryMark;
	private double practiceMark;
	 
	public Student() {
	}

	public Student(long studentID, String fullName, double theoryMark, double practiceMark) {
		this.studentID = studentID;
		this.fullName = fullName;
		this.theoryMark = theoryMark;
		this.practiceMark = practiceMark;
	}

	public long getStudentID() {
		return studentID;
	}

	public void setStudentID(long studentID) {
		this.studentID = studentID;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public double getTheoryMark() {
		return theoryMark;
	}

	public void setTheoryMark(double theoryMark) {
		this.theoryMark = theoryMark;
	}

	public double getPracticeMark() {
		return practiceMark;
	}

	public void setPracticeMark(double practiceMark) {
		this.practiceMark = practiceMark;
	}
	
	// Calculate average score
    public double calAvrMark() {
        return (theoryMark + practiceMark) / 2;
    }

	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", fullName=" + fullName + ", theoryMark=" + theoryMark
				+ ", practiceMark=" + practiceMark + "]";
	}

}
