package view.iinterface.initial;

public class ZInterfaceInitialDemo {

	public static void main(String[] args) {
		
		// Tạo đối tượng/giá trị cho biến có KDL IntTest/StringTest
		
		// Cách 1: Implementation Class
		
		IntTest it1 = new IntTestImpl();
		StringTest st1 = new StringTestImpl();
		
		it1.test(2);
		// lúc compile --> gọi hàm test của interface IntTest
		// lúc runtime --> gọi hàm test của class IntTestImpl
		// Cách 2: Anonymous class
		IntTest it2 = new IntTest() {
			
			@Override
			public boolean test(int number) {
				System.out.println("AnonymousClass#test");
				return number < 0;
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
		// lúc compile --> gọi hàm test của interface IntTest
		// lúc runtime --> gọi hàm test của anonymous class
		
		// Cách 3: Anonymous Function (chỉ áp dụng cho Functional Interface(interface có duy
		//			nhất một hàm trừu tượng.
		
		IntTest it3 = (int number) -> {
			System.out.println("AnonymousFunction#test --> input = " + number);
			return number > 0;
		};
		
		it3.test(77);
		// lúc compile --> gọi hàm test của interface IntTest
		// lúc runtime --> gọi hàm test của anonymous function
		
		IntTest it4 = number -> number % 5 == 0;
		System.out.println("it4#test --> " + it4.test(15));
		
		// Trong anonymous function
		// + không cần ghi KDL của tham số ở hàm cần override
		// Nếu:
		// + Số lượng tham số của hàm trừu tượng chỉ có 1 --> bỏ luôn ()
		// + Body chỉ có 1 dong --> bỏ luôn { }
		// 						--> bỏ luôn return (nếu có)
		
		/*
		StringTest st3 = (String test) -> {
			return true;
		}; (String test) -> {
			return true;
		*/
		
		// IntOperator
		
		// sum operator --> anonymous class
		IntOperator io1 = new IntOperator() {
			
			@Override
			public int operate(int a, int b) {
				System.out.println("io1#operator");
				return a + 1;
			}
		};
		System.out.println("io1 result --> " + io1.operate(2, 4));
		// sup operator -> anonymous function(lambda)
		IntOperator io2 = (int a, int b) -> {
			System.out.println("io2#operator");
			return a - b;
		};
		System.out.println("io1 result --> " + io2.operate(2, 4));
		// mul operator -> anonymous function
		IntOperator io3 = (a, b) -> a * b;
		System.out.println("io1 result --> " + io3.operate(2, 4));
		
	}
	
}
