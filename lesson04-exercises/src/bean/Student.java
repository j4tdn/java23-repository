package bean;

import java.util.Scanner;

public class Student {
	
	private String id;
	private String fullname;
	private float theoreticalPoints;
	private float practicePoints;
	
	public Student() {
	}

	public Student(String id, String fullname, float theoreticalPoints, float practicePoints) {
		super();
		this.id = id;
		this.fullname = fullname;
		this.theoreticalPoints = theoreticalPoints;
		this.practicePoints = practicePoints;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public float getTheoreticalPoints() {
		return theoreticalPoints;
	}

	public void setTheoreticalPoints(float theoreticalPoints) {
		this.theoreticalPoints = theoreticalPoints;
	}

	public float getPracticePoints() {
		return practicePoints;
	}

	public void setPracticePoints(float practicePoints) {
		this.practicePoints = practicePoints;
	}
	
	public float calculateDTB() {
		float result = 0;
		result=(getTheoreticalPoints() + getPracticePoints())/2;
		return result;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", fullname=" + fullname + ", theoreticalPoints=" + theoreticalPoints
				+ ", practicePoints=" + practicePoints + ", Average score="+calculateDTB()+ "]";
	}
	
	public void input(Scanner ip) {
		 System.out.print("Nhập mã sinh viên: ");
	        setId(ip.nextLine());

	        System.out.print("Nhập họ tên sinh viên: ");
	        setFullname(ip.nextLine());

	        System.out.print("Nhập điểm lý thuyết: ");
	        setTheoreticalPoints(ip.nextFloat());

	        System.out.print("Nhập điểm thực hành: ");
	        setPracticePoints(ip.nextFloat());
	        
//	        ip.nextLine();
	}
}
