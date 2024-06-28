package view.bai2;

import java.util.Scanner;

public class Vehicle {
	private String chuxe;
	private String loaixe;
	private double giaxe;
	private int dungtich;

	public Vehicle() {
	}

	public Vehicle(String chuxe, String loaixe, double giaxe, int dungtich) {
		this.chuxe = chuxe;
		this.loaixe = loaixe;
		this.giaxe = giaxe;
		this.dungtich = dungtich;
	}

	public String getChuxe() {
		return chuxe;
	}

	public void setChuxe(String chuxe) {
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

	public void Nhap() {
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhập tên chủ xe: ");
		chuxe = ip.nextLine();
		System.out.print("Nhập loại xe: ");
		loaixe = ip.nextLine();
		System.out.print("Nhập giá xe: ");
		giaxe = ip.nextDouble();
		System.out.print("Nhập dung tích xe: ");
		dungtich = ip.nextInt();
	}
}
