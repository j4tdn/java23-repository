package inheritance.abstractclass;

public class BussinessEmailService extends EmailService {
	
	@Override
	void login() {
		System.out.println("BussinessEmailService#login");
	}

	@Override
	void login2steps() {
		System.out.println("BussinessEmailService#login2Steps");

	}
}
