package inheritance.abstractclass;

public class BusinessEmailService extends EmailService {

	@Override
	void login() {
		System.out.println("BusinessEmailService#login");
	}

	void login2Steps() {
		System.out.println("BusinessEmailService#login2Steps");
	}
}
