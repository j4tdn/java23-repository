package inheritance.abstractclass;

public class ZInheritanceAbstractClassDemo {

	public static void main(String[] args) {
		
		EmailService e1 = new StandardEmailService();
		
		EmailService e2 = new BusinessEmailService();
		
		// anonymous hoat dong khi new interface hoac abstract class co abstract method
		EmailService e3 = new EmailService() {
			
			@Override
			void login() {
				// TODO Auto-generated method stub
				System.out.println("E3#login");
			}
		};
	}
}
