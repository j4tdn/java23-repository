import java.util.Scanner;

public class Ex01Equation {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		double a,b,x;
		while(true) {
			
		
			try {
				System.out.println("a = ");
				a = Integer.parseInt(ip.nextLine());
				if(a == 0) {
					throw new ArithmeticException("denominator should mot be zero!");
				}else {
					break;
				}
			} catch (NumberFormatException e) {
				System.out.println(e.getMessage());
			}
			
		}
		while(true) {
			
			
			try {
				
				System.out.println("b = ");
				b = Integer.parseInt(ip.nextLine());
				if(b ==0) {
					x = 0;
				}else {
					x = -b/a;
				}
					
					System.out.println("x==> " + x);
					break;
			} catch (NumberFormatException e) {
				System.out.println(e.getMessage());
			}
			
		}
	}
	}


