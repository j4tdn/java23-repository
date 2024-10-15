package view;

import java.util.Arrays;
import java.util.Random;

public class Ex01 {
	
	public static void main(String[] args) {
		Random rd = new Random();
		int[] elements = new int[10];
		for(int i=0; i<elements.length; i++) {
			elements[i] = rd.nextInt(10,51);
		}
//		Câu a
		System.out.println("Arrays : " + Arrays.toString(elements));
//		int[] uniqueElements = removeDuplicateParts(elements)
		System.out.println("1.Mảng sau khi loại bỏ phần tử trùng: " + Arrays.toString(removeDuplicateParts(elements)));
	
//		Cau b
		compareAverages(elements);
	
//		Cau c
		System.out.println("\n3.Giá trị lớn thứ 3: " + findThirdLargest(elements));
	}
	
//	Loại bỏ những phần tử trùng nhau 
	private static int[] removeDuplicateParts(int[] elements) {
		int size = 0;
		int[] result = new int[elements.length];
		for(int i=0; i<elements.length; i++) {
			int j;
			for(j=0; j<i; j++) {
				if (elements[i] == elements[j]) {
	                System.out.println("-> Phần tử trùng: " + elements[i]);
					break;
				}
			}
			if(i == j)
				result[size++] = elements[i];
		}
		return Arrays.copyOf(result, size);
	}
	
//	So sánh giá trị trung bình của n/2 phần tử đầu tiên với n/2 phần tử cuối cùng
	private static void compareAverages(int[] elements) {
		int mid = elements.length/2;
		int sumFirstHalf = 0;
		int sumSecondHalf = 0;
		
		for(int i=0; i<mid; i++) {
			sumFirstHalf += elements[i];
		}
		for(int i=mid; i<elements.length; i++) {
			sumSecondHalf += elements[i];
		}
		
		double avgFirstHalf = (double)sumFirstHalf/mid;
		double avgSecondHalf = (double)sumSecondHalf/elements.length-mid;

		System.out.println("\nGiá trị trung bình n/2 phần tử đầu: " + avgFirstHalf);
        System.out.println("Giá trị trung bình n/2 phần tử cuối: " + avgSecondHalf);

        String result = (avgFirstHalf > avgSecondHalf) ? "Giá trị trung bình n/2 phần tử đầu lớn hơn." : 
        			    (avgFirstHalf < avgSecondHalf) ? "Giá trị trung bình n/2 phần tử cuối lớn hơn." : 
        			    								 "Hai giá trị trung bình bằng nhau.";
        System.out.println("2."+result);
	}
	
//	Tìm số lớn thứ 3 trong mảng, lưu ý trường hợp các phần tử lớn nhất trùng nhau ví dụ {7, 8, 8, 8, 6, 2, 5, 1} → kết quả 6
	private static int findThirdLargest(int[] elements) {
		int first = Integer.MIN_VALUE; // Số lớn nhất
        int second = Integer.MIN_VALUE; // Số lớn thứ 2
        int third = Integer.MIN_VALUE; // Số lớn thứ 3

        // Duyệt qua từng phần tử trong mảng
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] > first) {
                third = second;
                second = first;
                first = elements[i]; 
            } else if (elements[i] > second && elements[i] != first) {
                third = second;
                second = elements[i]; 
            } else if (elements[i] > third && elements[i] != first && elements[i] != second) {
                third = elements[i]; 
            }
        }
        return third; 
	}
}
