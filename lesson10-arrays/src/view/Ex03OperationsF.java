package view;

import java.util.Arrays;

public class Ex03OperationsF {
	
		/*
		  Mảng :fix-length
		  --> Không thẻ thêm/xóa 1/n phần tử trong mảng
		  -->Thực tế : yêu cầu thêm / xóa mình vẫn phải xử lý
		  		     :Kết quả trả về mảng mới
		  		     
		  Collection : list,set,map
		  
		  Stream
		  
		  Yêu cầu cho mảng số nguyên gồm n phần tử {1,5,8,2,20}
		  Viết chương trình
		  +Thêm phần tử bất kỳ vào vị trí thứ i trong mảng
		  +Xóa phần tử tại ví trí thứ i trong mảng
		  
		  Biết rằng i[0,n)
		 */
	
	
	
		public static void main(String[] args) {
			
			int [] numbers = {1,9,5,36,12,33};
			
			int[] addedNumbers = add(numbers,3,18);
			System.out.println("add(source , 3 ,18)-->"+Arrays.toString(addedNumbers));
			
//			int removeNumbers = remove(number, 2);
//			System.out.println("remoe (source )-->"+Arrays.toString(removeNumbers));
		}
		
		private static int[] add(int[] source, int pos,int newValue) {
			int [] target = new int[source.length+1];
		
			for(int i=0; i< source.length;i++) {
				target[i] = source[i];
			}
			//B2: shift dichj phair 1  don vi
			
			for(int i= target.length-1;i>pos;i--) {
				target[i] = target[i-1];
			}
			
			return target;
		}
		private static int[] remove(int[] source, int pos) {
			int [] target = Arrays.copyOfRange(source, 0,source.length);
			
			//B3 shift left one unit from pos
			for(int i=pos;i<target.length - 1; i++) {
				target[i]= target[i+1];
			}
			
			
			//B1
			
			return Arrays.copyOfRange(target, 0, target.length-1);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
