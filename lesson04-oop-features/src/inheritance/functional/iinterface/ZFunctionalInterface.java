package inheritance.functional.iinterface;

public class ZFunctionalInterface {
	public static void main(String[] args) {
		//Tạo 1 đối tượng IntComparator
		
		//Tạo 1 đối tượng class 
		//Tốn class 
		
		//Anonymous class
		//Dài code chỗ tạo đối tượng
		IntComparator ic1 = new IntComparator() {
			
			@Override
			public int compare(int a, int b) {
				// TODO Auto-generated method stub
				return a-b;
			}
		};
		System.out.println("Test anonymous class --> " + ic1.compare(5, 7));
		
		//Anonymous function (Java 8 trở đi)
		//Là đoạn code override hàm trừu tượng từ interface
		//Chỉ dùng cho interface có duy nhất 1 hàm trừu tượng.
		//--> lambda func
		IntComparator ic2 = (int a, int b) -> {
			return a+b;
		};
		
		ic2.compare(4, 3);
		System.out.println("Test anonymous function --> " + ic2.compare(4, 3));
		
		//Ko bắt buộc khai báo KDL cho các tham số
		//Nếu chỉ 1 tham số, có thể bỏ ()
		//Nếu body 1 dòng -> xoá luôn {}
		
		IntComparator ic3 = (a,b) -> a * b;
		
		ic3.compare(5, 5);
		
		//strategy pattern
		//viết 1 hàm truyền vào strategy là 1 hàm biết được số lượng tham số hoặc KDL truyền vào
		//khi nào ai gọi hàm này sẽ truyền nội dung strategy vào.
		
		// --> a + b
		// --> a - b
		// strategy: int strategy (int a, int b)
		
		//Tạo ra 1 functional interface với tên bất kì
		
		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(countIf(numbers, new IntTest() {
			
			@Override
			public boolean test(int number) {
				// TODO Auto-generated method stub
				return number % 2 == 0;
			}
		}));
		
		System.out.println(countIf(numbers,  (int number) -> {return number % 2 != 0;}));
		
		System.out.println(countIf(numbers, a -> a%3==0));
	}
	
	private static int countIf(int[] numbers, IntTest intTest){
		int counter = 0;
		for (int number: numbers) {
			if(intTest.test(number)) {
				counter++;
			}
		};
		return counter;
	}
}
