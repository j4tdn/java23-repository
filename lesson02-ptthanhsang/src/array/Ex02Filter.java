package array;

  /*
  Tìm những phần tử lẻ trong mảng số nguyên
  - Input : Mảng
  - Output : Mảng số lẻ
   
  */
public class Ex02Filter {
	
		public static void main(String[] args) {
			int[] numbers = {};
			int[] oddNumbers= findOddNumbers(numbers);
			System.out.println(oddNumbers);
		}
		private static int[] findOddNumbers(int[] elements) {
			 int[] oddElements = new int[elements.length];
			 int count = 0;
		for(int element: elements) {
			if(element % 2 != 0) {
				oddElements[count] = element;
				count++;
			}
		}
		int[] result = new int[count];
		for (int i = 0; i < count ; i++) {
			result[i]= oddElements[i];
		}
		return result;

	}
}
