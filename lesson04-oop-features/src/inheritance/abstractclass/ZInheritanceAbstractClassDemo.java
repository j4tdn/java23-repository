package inheritance.abstractclass;

public class ZInheritanceAbstractClassDemo {

	public static void main(String[] args) {
           
		EmailService e1 = new StandardEmailService();
	
		EmailService e2 = new BussinessEmailService();
		
		EmailService e3 = new EmailService() {
			
		@Override
		void login() {
			// TODO Auto-generated method stub
			
		}
		
		
}
}
}
