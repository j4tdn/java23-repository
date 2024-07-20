package inheritance.abstractclass;

public class zInheritanceAbstractClassDemo {

	public static void main(String[] args) {
		
		EmailService e1 = new StandardEmailService();
		
		EmailService e2 = new BussinessEmailService();
		
		// anonymous class hoạt động khi new interface hoặc abstract class có abstract method
		EmailService e3 = new EmailService() {
			
			@Override
			void login() {
				System.out.println("E3#login");
			}
		};
		
		e1.login();
		e2.login();
		e3.login();
	}
}
