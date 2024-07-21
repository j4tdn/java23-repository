package bean;

import java.util.Scanner;

public class Student {

	private int studentId;
	private String studentName;
	private Double theoreticalPoint;
	private Double practicePoint;
	
	public Student() {
	}

	public Student(int studentId, String studentName, Double theoreticalPoint, Double practicePoint) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.theoreticalPoint = theoreticalPoint;
		this.practicePoint = practicePoint;
	}

	public int getStudentId() {
		return studentId;
	}

	public int setStudentId(int studentId) {
		this.studentId = studentId;
		return studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Double getTheoreticalPoint() {
		return theoreticalPoint;
	}

	public Double setTheoreticalPoint(Double theoreticalPoint) {
		this.theoreticalPoint = theoreticalPoint;
		return theoreticalPoint;
	}

	public Double getPracticePoint() {
		return practicePoint;
	}

	public Double setPracticePoint(Double practicePoint) {
		this.practicePoint = practicePoint;
		return practicePoint;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", theoreticalPoint="
				+ theoreticalPoint + ", practicePoint=" + practicePoint + "]";
	}
	
	public double avgPoint () {
		return (theoreticalPoint + practicePoint) / 2;
	}
	
	public void inputInfomation() {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter student's ID: ");
		while(true) {
			if(ip.hasNextInt()) {
				int n = setStudentId(ip.nextInt());
				if(n > 0 && n <= 10) {
					break;
				} else {
					System.out.println("Invalid input.");
					ip.next();
				}
			}
		}
		ip.nextLine();
		
		System.out.println("Enter student's name: ");
		setStudentName(ip.nextLine());
		
		System.out.println("Enter student's theoretical point: ");
		while(true) {
			if(ip.hasNextDouble()) {
				double n = setTheoreticalPoint(ip.nextDouble());
				if(n > 0 && n <= 10) {
					break;
				} else {
					System.out.println("Invalid input.");
					ip.next();
				}
			}
		}
		ip.nextLine();
		
		System.out.println("Enter student's practice point: ");
		while(true) {
			if(ip.hasNextDouble()) {
				double n = setPracticePoint(ip.nextDouble());
				if(n > 0) {
					break;
				} else {
					System.out.println("Invalid input.");
					ip.next();
				}
			}
		}
		
		ip.close();
		
	}
}