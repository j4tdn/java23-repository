import java.util.Scanner;

import exception.InvaliPasswordException;

public class Ex02Password {

		public static void main(String[] args) {
			
			Scanner ip = new Scanner(System.in);
			
			while(true) {
				
			
			try {
				System.out.println("Enter pasword: ");
				String password = ip.nextLine();
				valuePassword(password);
				break;
			} catch (InvaliPasswordException e) {
				System.out.println("erorr ==> " + e.getMessage());
			}
		}
			
		}
		private static void valuePassword(String password) throws InvaliPasswordException {
			if(password.length() < 8) {
				throw new InvaliPasswordException("At least 8 characters");
			}
			if(password.length()>256) {
				throw new InvaliPasswordException("At most 256 characters");
			}
			if(!password.matches("(.*)[a-z](.*)")) {
				throw new InvaliPasswordException("At least 1 lowercases alphabetic characters"); 
			}
			if(!password.matches("(.*)[A-Z](.*)")) {
				throw new InvaliPasswordException("At least 1 uppercases alphabetic characters"); 
			}
			if(!password.matches("(.*)[1-9](.*)")) {
				throw new InvaliPasswordException("At least 1 number");
			}
//			if(!password.matches("(.*)[@*](.*)")) {
//				throw new InvaliPasswordException("At least 1 special characters");
//			}
			System.out.println("Successfully registered account");
			System.out.println("your password: " + password);
		}

}
