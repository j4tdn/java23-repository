package view;

import java.util.Scanner;
import bean.Vehicle;
import bean.TheDepartmentOfTransport;
public class TaxDeclaration {
	
	
	public static void main(String[] args) {
		int n=0;
		
		System.out.print("Nhập số lượng xe muốn nhập: ");
		Scanner ip = new Scanner(System.in);
		n=ip.nextInt();
		Vehicle[] vehicles = new Vehicle[n];
		
		for(int i=0; i<vehicles.length; i++) {
			Vehicle xe = new Vehicle();
			System.out.print("\nNhập thông tin xe - " + (i+1)+"\n");
			xe.input();
			vehicles[i] = xe;
		}
		
		TheDepartmentOfTransport dot = new TheDepartmentOfTransport();
		dot.displayVehicleTaxes(vehicles);


	}
	

}
