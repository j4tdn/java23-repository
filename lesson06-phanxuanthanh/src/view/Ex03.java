package view;

public class Ex03 {
	
	public static void main(String[] args) {
			String[] emails = {"abc-@mail.com",
							   "abc.def@mail.com",
							   ".abc@mail.com",
							   "abc#def@mail.com",
							   
							   "abc-d@mail.com",
							   "abc.def@mail.com",
							   "abc@mail.com",
							   "abc_def@mail.com"
			};
			
			String emailTest = "[a-z]+[_.-]?[a-z]+@[a-z]+.[a-z]+";

			for (String email : emails) {
				System.out.println(email + "validate --> " + email.matches(emailTest));
			}
		}
	
}
