package view;

import java.util.Arrays;

public class Ex03OperationsF {

	/*
	 Mảng: fixed-length
	 --> Không thể thêm/xóa 1/n phần tử trong mảng
	 --> Thực tế: yêu cầu thêm/xóa mình vẫn phải xử lý
	 -->		: kết quả 100% phải trả về mảng mới
	 
	 Collection: list, set, map
	 
	 Stream
	 
	 Yêu cầu:
	 Cho mảng số nguyên gồm n phần tử {1, 5, 8, 2, 20}
	 Viết chương trình/hàm
	 
	 + Thêm phần tử bất kì vào vị trí thứ i trong mảng
	 + Xóa phần tử tại vị trí thứ i trong mảng
	 
	 Biết rằng i[0, n)
	 */
	
	public static void main(String[] args) {
	
		int[] numbers = {1, 9, 5, 36, 12, 33};
		
		int[] addedNumbers = add1(numbers, 3, 18);
		
        System.out.println(
        		"add(source, 3, 18) --> " + Arrays.toString(addedNumbers));
		
        int[] removedNumbers = remove1(numbers, 2);
        
        System.out.println(
        		"remove (source, 3) --> " + Arrays.toString(removedNumbers));

		
	}
	
	// Cách 1:
		// Lưu ý: Muốn dịch phải -> duyệt từ phải sang trái (vd: dịch 345 sang 456 => duyệt i từ 6 đến > 3 -> a[i] = a[a-1]
		//		  Muốn dịch trái -> duyệt từ trái sang phải
	// Thêm bằng cách dịch qua phải
	private static int[] add1(int[] source, int pos, int newValue) {
		int[] target = new int[source.length + 1];

		// B1: copy source -> target
		for (int i = 0; i < source.length; i++) {
			target[i] = source[i];
		}

		// B2: shift right 1 unit from addedPos
		for (int i = target.length - 1; i > pos; i--) {
			target[i] = target[i - 1];
		}

		// B3: assign newValue to pos
		target[pos] = newValue;

		return target;
	}
	
	// Xóa bằng cách dịch qua trải
	private static int[] remove1(int[] source, int pos) {
//		int [] target = source; //không nên gán bằng source vì nó sẽ bị ảnh hưởng target -> nguy hiểm
		
		// B1&2:
		int [] target = Arrays.copyOfRange(source, 0, source.length);
		
		//B3: shift left one unit from pos (đọc lại lưu ý)
		for (int i = pos; i < target.length - 1; i++) {
			target[i] = target[i+1];
		}
		
		// target.length-1 để xóa pt cuối cùng trong mảng
		return Arrays.copyOfRange(target, 0, target.length-1);
	}
	
	
	// Cách 2:
	private static int[] add2(int[] source, int pos, int newValue) {
		int [] target = new int[source.length+1];
		
        for (int i = 0; i < pos; i++) {
            target[i] = source[i];
        }
        target[pos] = newValue;
        for (int i = pos; i < source.length; i++) {
            target[i + 1] = source[i];
        }
		
		return target;
	}
	
	//xóa bằng cách coppy rồi đè lên vị trí cần xóa
	private static int[] remove2(int[] source, int pos) {
		int [] target = new int[source.length-1];
		
        for (int i = 0; i < pos; i++) {
            target[i] = source[i];
        }
        for (int i = pos + 1; i < source.length; i++) {
            target[i - 1] = source[i];
        }
		
		return target;
	}
}
