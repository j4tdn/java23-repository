package bean;

public class Student {
	private Integer id;
	private String name;
	private Double theoryScore;
	private Double practiceScore;
	
	public Student() {}

	public Student(Integer id, String name, Double theoryScore, Double practiceScore) {
		this.id = id;
		this.name = name;
		this.theoryScore = theoryScore;
		this.practiceScore = practiceScore;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getTheoryScore() {
		return theoryScore;
	}

	public void setTheoryScore(Double theoryScore) {
		this.theoryScore = theoryScore;
	}

	public Double getPracticeScore() {
		return practiceScore;
	}

	public void setPracticeScore(Double practiceScore) {
		this.practiceScore = practiceScore;
	}
	public double averageScoreCalculate() {
		return (this.theoryScore + practiceScore) /2;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", theoryScore=" + theoryScore + ", practiceScore="
				+ practiceScore + "]";
	}
	
}
