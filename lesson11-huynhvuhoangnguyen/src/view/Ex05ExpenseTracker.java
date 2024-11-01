package view;

import java.util.Scanner;

import bean.Expense;

public class Ex05ExpenseTracker {
	
	public static void main(String[] args) {
		
		Expense expense = new Expense();
		Scanner ip = new Scanner(System.in);
		
		while(true) {
			System.out.println("1. Enter expense");
			System.out.println("2. List out expenses greater than 500.000VND");
			System.out.println("3. Sort expenses by name (asc)");
			System.out.println("4. Sort expenses by amount (desc)");
			System.out.println("5. Exit");
			System.out.println("Choose a function!!!");
			
			int choice = ip.nextInt();
			ip.nextLine();
			
			switch(choice) {
			case 1:
				System.out.println("Enter expense infomation:");
				String description = ip.nextLine();
				System.out.println("Enter amount:");
				double amount = ip.nextDouble();
				expense.addExpense(description, amount);
				break;
			case 2:
				expense.listExpenses();
				break;
			case 3:
				// expense.sortExpensesByKey();
				System.out.println("Enter sorting catagory:");
				String sortBy = "key";
				expense.sortExpense(sortBy);
				break;
			case 4:
				// expense.sortExpensesByValueDesc();
				System.out.println("Enter sorting catagory:");
				sortBy = "value";
				expense.sortExpense(sortBy);
				break;
			case 5:
				System.out.println("Exit the program");
				ip.close();
				return;
			default:
				System.out.println("Invalid function. Please try again");
			}
		}
		
	}

}