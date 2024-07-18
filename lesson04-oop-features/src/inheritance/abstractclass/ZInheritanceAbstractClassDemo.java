package inheritance.abstractclass;

public class ZInheritanceAbstractClassDemo {
	public static void main(String[] args) {
		
		EmailService e1 = new StandarEmailService();
		
		EmailService e2 = new BusinessEmailService();
		
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
