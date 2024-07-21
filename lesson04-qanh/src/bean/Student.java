package bean;

import java.util.Scanner;

public class Student {
	
	private int id;
	private String name;
	private float theoreticalPoints;
	private float practicePoints;
	
	public Student() {
	}

	public Student(int i, String name, float theoreticalPoints, float practicePoints) {
		this.id = i;
		this.name = name;
		this.theoreticalPoints = theoreticalPoints;
		this.practicePoints = practicePoints;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
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
	
	public float mediumScore() {
		float result = 0;
		result=(getTheoreticalPoints() + getPracticePoints())/2;
		return result;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", fullname=" + name + ",  medium Score = "+mediumScore()+ "]";
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		 System.out.print("Nhập id sinh viên: ");
	        setId(sc.nextInt());

	        System.out.print("Nhập tên sinh viên: ");
	        setname(sc.nextLine());

	        System.out.print("Nhập điểm lý thuyết: ");
	        setTheoreticalPoints(sc.nextFloat());

	        System.out.print("Nhập điểm thực hành: ");
	        setPracticePoints(sc.nextFloat());
	        
//	        ip.nextLine();
	}
}
