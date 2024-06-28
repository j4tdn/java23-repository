package bean;

import java.util.Scanner;

public class Vehicle {
	private Person chuxe;
	private String loaixe;
	private double giaxe;
	private int dungtich;
	
	public Vehicle() {}

	public Vehicle(Person chuxe, String loaixe, double giaxe, int dungtich) {
		this.chuxe = chuxe;
		this.loaixe = loaixe;
		this.giaxe = giaxe;
		this.dungtich = dungtich;
	}

	
	public Person getChuxe() {
		return chuxe;
	}

	public void setChuxe(Person chuxe) {
		this.chuxe = chuxe;
	}

	public String getLoaixe() {
		return loaixe;
	}

	public void setLoaixe(String loaixe) {
		this.loaixe = loaixe;
	}

	public double getGiaxe() {
		return giaxe;
	}

	public void setGiaxe(double giaxe) {
		this.giaxe = giaxe;
	}

	public int getDungtich() {
		return dungtich;
	}

	public void setDungtich(int dungtich) {
		this.dungtich = dungtich;
	}

	public void input() {
		Scanner ip = new Scanner(System.in);
		
		chuxe = new Person();
		chuxe.input();
		System.out.print("Nhập loại xe: ");
		loaixe = ip.nextLine();
		System.out.print("Nhập giá xe: ");
		giaxe = ip.nextDouble();
		System.out.print("Nhập dung tích xe: ");
		dungtich = ip.nextInt();
	}
	
	public void output(double tax) {
		System.out.printf("%-20s %-20s %-20d %-20.2f %-20.2f%n", chuxe.getName(), loaixe, dungtich, giaxe, tax);
	}
}
