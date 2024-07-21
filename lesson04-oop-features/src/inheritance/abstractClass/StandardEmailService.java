package inheritance.abstractClass;

public class StandardEmailService extends EmailService{

	@Override
	void login() {
		System.out.println("StandardEmailService login");
	}
	
	
}
