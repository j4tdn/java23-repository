package inheritance.abstractclass;

public class BusinessEmailService extends EmailService{

	@Override
	void login() {
		System.out.println("BussinessEmailService#login");
	}

	@Override
	void login2Steps() {
		System.out.println("BussinessEmailService#login2Step");
	}
	
}
