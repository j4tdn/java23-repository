package inheritance.abstractclass;

public class ZinheritanceAbstractClassDemo {
	public static void main(String[] args) {
		EmailService e1 = new StandardEmailService ();
		EmailService e2 = new BusinessEmailService ();
		
		// anonymous class hoat dong khi new interface hoac abstract class co abstract method
		EmailService e3 = new EmailService () {
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
