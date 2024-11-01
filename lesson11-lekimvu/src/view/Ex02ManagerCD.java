package view;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import utils.MultiUlti;

import bean.CD;

public class Ex02ManagerCD {

 static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

		List<CD> mockData = new LinkedList<>();
		System.out.println("Nhap so luong cd: ");
		int n = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < n; i++) {
//			try {
			System.out.println("Nhap id CD: ");
			Integer id = Integer.parseInt(sc.nextLine());
		  
			System.out.println("Nhap loai CD: ");
		  String genre = sc.nextLine();
		  
		  System.out.println("Nhap ten ca si CD: ");
		  String singer = sc.nextLine();
		  
		  System.out.println("Nhap so bai hat: ");
		  Integer songs = Integer.parseInt(sc.nextLine());
		  
		  System.out.println("Nhap gia thanh CD:");
		  Double prices = Double.parseDouble(sc.nextLine());
			
		  mockData.add(new CD(id, genre, singer, songs, prices));
		}
		System.out.println("Danh sách các item:");
        for (CD cd : mockData) {
            System.out.println(cd);
        }

       MultiUlti.generate( "Số Lượng CD: ", quanityCD(mockData));
       MultiUlti.generate("Tổng giá thành CD: ", sumCD(mockData));
        
        mockData.sort( (cd1, cd2) -> {
        return cd2.getPrices().compareTo(cd1.getPrices());
        }); 
        MultiUlti.printf("Prices after : ", mockData);
        
        mockData.sort( (cd1, cd2) -> {
            return cd1.getId().compareTo(cd2.getId());
            }); 
            MultiUlti.printf("Prices after Asc: ", mockData);
	}
	

	public static int quanityCD(List<CD> mockData) {
		return mockData.size();

	}
	
	public static double sumCD(List<CD> mockData) {
		double sum = 0;
		for(CD cd :mockData) {
			sum = sum + cd.getPrices();
		}
		return sum;
				
	}
}