package ex01;

public class Student {

	 private int studentID;
	    private String fullName;
	    private double theoryScore;
	    private double practiceScore;
	    
	    public Student() {
		}

		public Student(int studentID, String fullName, double theoryScore, double practiceScore) {
			this.studentID = studentID;
			this.fullName = fullName;
			this.theoryScore = theoryScore;
			this.practiceScore = practiceScore;
		}

		public int getStudentID() {
			return studentID;
		}

		public void setStudentID(int studentID) {
			this.studentID = studentID;
		}

		public String getFullName() {
			return fullName;
		}

		public void setFullName(String fullName) {
			this.fullName = fullName;
		}

		public double getTheoryScore() {
			return theoryScore;
		}

		public void setTheoryScore(double theoryScore) {
			this.theoryScore = theoryScore;
		}

		public double getPracticeScore() {
			return practiceScore;
		}

		public void setPracticeScore(double practiceScore) {
			this.practiceScore = practiceScore;
		}
	    
		public double calculateAverageScore() {
	        return (theoryScore + practiceScore) / 2;
	    }

		@Override
		public String toString() {
			return "Student [studentID=" + studentID 
					+ ", fullName=" + fullName 
					+ ", theoryScore=" + theoryScore
					+ ", practiceScore=" + practiceScore 
					+ ", calculateAverageScore()=" + calculateAverageScore() + "]";
		}
		
		
}
