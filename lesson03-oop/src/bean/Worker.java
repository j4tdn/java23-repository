package bean;

import java.util.Scanner;

public class Worker extends Cadre {

    private String level;

    public Worker() {

    }
	public Worker(String name, String date, String gender, String address, String level) {
		super(name, date, gender, address);
		this.level = level;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

     public void nhapThongTin(Scanner sc) {
    	 super.nhapThongTin(sc);
    	 System.out.print("Nhập bậc:"); level = sc.nextLine();
     }

     public void hienThiThongTin() {
    	 super.hienThiThongTin();
    	System.out.println("Bậc: " +level); 
     }
}
