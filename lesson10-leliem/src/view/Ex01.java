package view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Ex01 {
	
	public static void main(String[] args) {
		Random rand = new Random();
	    int n = rand.nextInt(9) + 1; 
        int[] arr = createRandomArray(n);
        
        System.out.println("Mảng ban đầu:");
        printArray(arr);

        
        int[] uniqueArr = removeDuplicates(arr);
        System.out.println("Mảng sau khi loại bỏ phần tử trùng:");
        printArray(uniqueArr);

        compareAverage(arr);

        int thirdLargest = findThirdLargest(arr);
        if (thirdLargest != -1) {
            System.out.println("Số lớn thứ 3 trong mảng là: " + thirdLargest);
        } else {
            System.out.println("Không đủ phần tử khác nhau để tìm số lớn thứ 3.");
        }
    }

    public static int[] createRandomArray(int n) {
        Random rand = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(41) + 10; 
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static int[] removeDuplicates(int[] arr) {
        Map<Integer, Integer> frequency = new HashMap<>();
        for (int num : arr) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }
        List<Integer> result = new ArrayList<>();
        for (int num : arr) {
            if (frequency.get(num) == 1) {
                result.add(num);
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void compareAverage(int[] arr) {
        int half = arr.length / 2;
        double firstHalfAverage = Arrays.stream(arr, 0, half).average().orElse(0);
        double secondHalfAverage = Arrays.stream(arr, half, arr.length).average().orElse(0);
        
        System.out.println("Trung bình nửa đầu: " + firstHalfAverage);
        System.out.println("Trung bình nửa cuối: " + secondHalfAverage);
        
        if (firstHalfAverage > secondHalfAverage) {
            System.out.println("Nửa đầu lớn hơn.");
        } else if (firstHalfAverage < secondHalfAverage) {
            System.out.println("Nửa cuối lớn hơn.");
        } else {
            System.out.println("Hai nửa bằng nhau.");
        }
    }

    public static int findThirdLargest(int[] arr) {
        Set<Integer> uniqueValues = new TreeSet<>(Collections.reverseOrder());
        for (int num : arr) {
            uniqueValues.add(num);
        }
        if (uniqueValues.size() < 3) {
            return -1; 
        } else {
            Iterator<Integer> iterator = uniqueValues.iterator();
            iterator.next(); 
            iterator.next(); 
            return iterator.next(); 
        }
    }
}
