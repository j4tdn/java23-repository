package view;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		System.out.println("The Ultimate Relationship Calculation");

		Scanner sc = new Scanner(System.in);

		do { 
			try {
				System.out.println("Enter the first dating date (dd/MM/yyyy): ");
				String date = sc.nextLine();
				System.out.println("You have dated in " + getDaysIntoCurrentDate(date) + " days");
				break;
			} catch (ParseException e) {
				System.out.println("Enter wrong type of date!");
			}
		} while (true);

	}

	private static long getDaysIntoCurrentDate(String date) throws ParseException {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date datingDate = df.parse(date);

		Date currentDate = new Date();

		long dateCounting = (currentDate.getTime() - datingDate.getTime()) / 1000 / 60 / 60 / 24;

		return dateCounting;
	}
}
