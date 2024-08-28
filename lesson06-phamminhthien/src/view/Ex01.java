	package view;
	
	import java.util.InputMismatchException;
	import java.util.Scanner;
	
	public class Ex01 {
	
		// Giải phương trình bậc nhất ax + b = 0
		public static void main(String[] args) {
			input();
		}
	
		private static void input() {
			double a = 0;
			double b = 0;
			Scanner ip = new Scanner(System.in);
			while(true){
				try {
					System.out.print("Nhập hệ số a: ");
					a = ip.nextInt();
					System.out.print("Nhập hệ số b: ");
					b = ip.nextInt();
					break;
					
				} 
				catch (InputMismatchException e) {
					System.out.println("\nLỗi !!! \nVui lòng nhập lại 1 số hợp lê.\n");
					ip.nextLine();
				}
			}
			solveLinearEquation(a,b);
	
		}
		private static void solveLinearEquation(double a, double b) {
			try {
				if(a==0) {
					if(b==0)
						System.out.println("-> Phương trình có vô số nghiệm.");
					else {
						 System.out.println("-> Phương trình vô nghiệm.");
					}
				}
				else 
				{
					double x=-b/a;
					System.out.println("-> Nghiệm của phương trình là: x = " + x);
				}
			}
			catch (Exception e) {
				System.out.println("Đã xảy ra lỗi " + e.getMessage());
			}
		}
	
	}
