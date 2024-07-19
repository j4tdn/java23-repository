package inheritance.abstractclass;

public class StandardEmailServide extends EmailService{

	@Override
	void login() {
		System.out.println("StandardEmailService#login ...");
	}
	
}
