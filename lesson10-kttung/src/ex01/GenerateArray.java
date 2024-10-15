package ex01;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class GenerateArray {
	 public static int[] generateRandomArray(int n) {
	        Random random = new Random();
	        int[] array = new int[n];
	        for (int i = 0; i < n; i++) {
	            array[i] = random.nextInt(41) + 10; // [10, 50]
	        }
	        return array;
	    }

	    // Loại bỏ những phần tử trùng nhau
	    public static Set<Integer> removeDuplicates(int[] array) {
	        Set<Integer> set = new HashSet<>();
	        Set<Integer> duplicates = new HashSet<>();
	        for (int num : array) {
	            if (!set.add(num)) {
	                duplicates.add(num);
	            }
	        }
	        set.removeAll(duplicates);
	        return set;
	    }

	    // So sánh giá trị trung bình của n/2 phần tử đầu tiên với n/2 phần tử cuối cùng
	    public static void compareAverages(int[] array) {
	        int n = array.length;
	        int sumFirstHalf = 0;
	        int sumLastHalf = 0;
	        for (int i = 0; i < n / 2; i++) {
	            sumFirstHalf += array[i];
	            sumLastHalf += array[n - 1 - i];
	        }
	        double avgFirstHalf = sumFirstHalf / (n / 2.0);
	        double avgLastHalf = sumLastHalf / (n / 2.0);
	        
	        if (avgFirstHalf > avgLastHalf) {
	            System.out.println("Trung bình của nửa đầu lớn hơn nửa sau");
	        } else if (avgFirstHalf < avgLastHalf) {
	            System.out.println("Trung bình của nửa sau lớn hơn nửa đầu");
	        } else {
	            System.out.println("Trung bình của nửa đầu và nửa sau bằng nhau");
	        }
	    }

	    // Tìm số lớn thứ 3 trong mảng
	    public static int findThirdLargest(int[] array) {
	        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE, third = Integer.MIN_VALUE;
	        for (int num : array) {
	            if (num > first) {
	                third = second;
	                second = first;
	                first = num;
	            } else if (num > second && num != first) {
	                third = second;
	                second = num;
	            } else if (num > third && num != second && num != first) {
	                third = num;
	            }
	        }
	        return third;
	    }

	    public static void main(String[] args) {
	        int n = 8; // Số phần tử của mảng, n < 10
	        int[] array = generateRandomArray(n);

	        System.out.println("Mảng ngẫu nhiên: " + Arrays.toString(array));

	        Set<Integer> resultSet = removeDuplicates(array);
	        System.out.println("Mảng sau khi loại bỏ phần tử trùng lặp: " + resultSet);

	        compareAverages(array);

	        int thirdLargest = findThirdLargest(array);
	        System.out.println("Số lớn thứ 3 trong mảng: " + thirdLargest);
	    }
}
