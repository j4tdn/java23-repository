package bean;

public class Student {

	private int studentCode;
	private String name;
	private Double theoPoint;
	private Double pracPoint;
//	private Double avgPoint;

	public Student() {

	}

	public Student(int studentCode, String name, Double theoPoint, Double pracPoint){
		//, Double avgPoint) {
		this.studentCode = studentCode;
		this.name = name;
		this.theoPoint = theoPoint;
		this.pracPoint = pracPoint;
//		this.avgPoint = avgPoint;
	}

	public int getStudentCode() {
		return studentCode;
	}

	public void setStudentCode(int studentCode) {
		this.studentCode = studentCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getTheoPoint() {
		return theoPoint;
	}

	public void setTheoPoint(Double theoPoint) {
		this.theoPoint = theoPoint;
	}

	public Double getPracPoint() {
		return pracPoint;
	}

	public void setPracPoint(Double pracPoint) {
		this.pracPoint = pracPoint;
	}
	
	

	public Double avgPoint() {
		return (getTheoPoint()+ getPracPoint())/2 ;
	}

	@Override
	public String toString() {
		return "Student [studentCode=" + studentCode + ", name=" + name + ", theoPoint=" + theoPoint + ", pracPoint="
				+ pracPoint +
				"]"; 
						//+ "//+ "avgPoint=" + avgPoint "]";
	}

}
