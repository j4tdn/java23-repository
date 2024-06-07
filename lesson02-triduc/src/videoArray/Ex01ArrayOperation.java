package videoArray;

public class Ex01ArrayOperation {
	//2 cách tạo:
	//data_type arr[]  //still work but not be preferred
	//data_type[] arr = {a1, a2, a3, ...} //prefer
	//data_type[] arr = new data_type[ArraySize];
	public static void main(String[] args) {
		int[] numbers = null;
		numbers = new int[6];
		
		//for
		for(int i = 0; i < numbers.length;i++) { //luôn luôn bé hơn 0 thể bằng vì thừa ptu cúi
			System.out.println("Value at index " + i +": " + numbers[i]);
		}
		
		//foreach
		for(int number: numbers) {
			System.out.println("Value: " + number);
		}
		
		String[] sequences = {"hello", "hi", "hiii"};
		
		for(String s : sequences) {
			System.out.println(s);
		}
	}
	
}
