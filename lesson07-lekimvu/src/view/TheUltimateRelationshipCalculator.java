package view;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import utils.DateUtils;

public class TheUltimateRelationshipCalculator {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		Calendar c = Calendar.getInstance();
boolean valid = false;
		while(!valid) {
			System.out.println("Tình trạng hẹn hò: ");
			String relationship = sc.nextLine();
            if(relationship.equalsIgnoreCase("Yes")){
		System.out.println("Nhap thời gian yêu nhau: ");
		String firstDayOfLove = sc.nextLine();
		System.out.println("First day --> " + DateUtils.toDate(firstDayOfLove, "dd.MM.yyyy"));
		break;
            }else 
                if(relationship.equalsIgnoreCase("No")){

			System.out.println("Nhap thời gian chia tay: ");
			String eLoveDay = sc.nextLine();
System.out.println("End love day --> " + DateUtils.toDate(eLoveDay, "dd.MM.yyyy"));
		      valid = true;
		}else 
			System.out.println("Input again: ");

//		System.out.println("Thứ của ngày đầu tiên: Thứ " +day);
		
//	}catch (Exception e) {
//          e.printStackTrace();
	
//		long pastTime = System.currentTimeMillis();
		
	
	}
}
}