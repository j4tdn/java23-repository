package view;

import java.util.Scanner;

public class Input_Vehicle {
	
	private ChuXE tenchuxe;
	private String loaixe;
	private double giaxe;
	private int dungtich;
	
	public Input_Vehicle() {}

	public Input_Vehicle(ChuXE tenchuxe, String loaixe, double giaxe, int dungtich) {
		this.tenchuxe = tenchuxe;
		this.loaixe = loaixe;
		this.giaxe = giaxe;
		this.dungtich = dungtich;
	}

	public ChuXE getChuxe() {
		return tenchuxe;
	}
	public void setChuxe(ChuXE chuxe) {
		this.tenchuxe = tenchuxe;
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
		Scanner sc = new Scanner(System.in);
	
		tenchuxe = new ChuXE();
		tenchuxe.input();
		System.out.print("Nhập loại xe: ");
		loaixe = sc.nextLine();
		System.out.print("Nhập giá xe: ");
		giaxe = sc.nextDouble();
		System.out.print("Nhập dung tích xe: ");
		dungtich = sc.nextInt();
	}
	
	public void output(double tax) {
		System.out.printf("%-20s %-20s %-20d %-20.2f %-20.2f%n", tenchuxe.getName(), loaixe, dungtich, giaxe, tax);
	}
}
