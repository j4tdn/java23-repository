package inheritance.abstractclass;

public class BusinessEmailService extends EmailService {
	@Override
	void login() {
		System.out.println("Business Email Service # login...");
		
	}
	@Override
	void login2Steps() {
		System.out.println("Business Email Service # login2Steps ...");
	}
}
