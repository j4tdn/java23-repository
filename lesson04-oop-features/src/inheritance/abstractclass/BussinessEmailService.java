package inheritance.abstractclass;

public class BussinessEmailService extends EmailService {
	
	@Override
	void login() {
		System.out.println("BussinessEmailService#login");
	}
	
	@Override
	void login2Steps() {
		System.out.println("BussinessEmailService#login2steps");
	}
}
