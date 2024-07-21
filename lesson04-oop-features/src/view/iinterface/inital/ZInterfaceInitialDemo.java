package view.iinterface.inital;

public interface ZInterfaceInitialDemo {
	public static void main(String[] args) {
		// Tạo đối tượng/ giá trị cho biến có KDL IntTest/ StringTest
		
		// C1:
		
			IntTest it1 = new IntTesstImpl();
			StringTest st1 = new StringTestImpl();
			it1.test(2);
			// lúc compile --> gọi hàm test của interface IntTest
			// lúc runtime --> gọi hàm test của clas IntTestImpl
			
		// C2: Anonymous class
			IntTest it2 = new IntTest() {
				
				@Override
				public boolean test(int number) {
					return number<0;
				}
			};
			
			StringTest st2 = new StringTest() {
				
				@Override
				public boolean isUpperCase(String text) {
					
					return false;
				}
				
				@Override
				public boolean isLowerCase(String text) {
					return false;
				}
			};
			
			it2.test(4);
//			// lúc compile -> gọi hàm test của interface IntTest
//			// lúc runtime -> gọi hàm test của anonymous class
			
			IntTest it3 = (int number) ->{
				System.out.println("AnonymousFunction#test --> input= "+ number);
				return number>0;
			};
			it3.test(77);
//			 lúc compile -> gọi hàm test của interface IntTest
//			 lúc runtime -> gọi hàm test của anonymous function
			
			IntTest it4 = number -> number % 5 ==0;
			System.out.println("it4#test --> "+it4.test(15));
//			 Trong anonymous function 
//			 + Ko cần ghi KDL của tham số ở hàm override Nếu:
//				+ Số lượng tham số của hàm trừu tượng chỉ có 1 --> bỏ luôn ()
//				+ Khi body chỉ có 1 dòng -> bỏ luôn {}
//										 -> bỏ luôn return (nếu có)
	
//			IntOperator 
//			sum operator --> anonymous class
			IntOperator io1 = new IntOperator() {
				
				@Override
				public int operator(int a, int b) {
					System.out.println("io1#operator");
					return a+b;
				}
			};
			System.out.println("i01 --> result " + io1.operator(2,4));

			// sum operator -> anonymous function(lamda)
			IntOperator i02 = (int a, int b) ->{
				System.out.println("io2#operator");
				return a-b;
			};
			System.out.println("i02 --> result " + i02.operator(2,4));
			//mul operator
			IntOperator i03 = (a,b) -> a*b;
			System.out.println("i03 --> result " + i03.operator(2,4));

	}
}
