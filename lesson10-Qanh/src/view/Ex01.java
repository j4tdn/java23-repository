package view;

import java.util.Random;
import java.util.Arrays;

public class Ex01 {
    public static void main(String[] args) {
        int n = 8;
        int[] arr = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
        	arr[i] = rand.nextInt(41) + 10;
        }
        System.out.println("Mảng ban đầu: " + Arrays.toString(arr));
        int[] arrWithoutDuplicates = removeAllDuplicates(arr);
        compareAverage(arr);  
        findThirdLargest(arr);  

        System.out.println("Mảng sau khi loại bỏ tất cả phần tử trùng nhau: " + Arrays.toString(arrWithoutDuplicates));
    }

    // Loại bỏ tất cả các phần tử trùng nhau
    public static int[] removeAllDuplicates(int[] arr) {
        boolean[] duplicateFlags = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    duplicateFlags[i] = true;
                    duplicateFlags[j] = true;
                }
            }
        }
        int uniqueCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!duplicateFlags[i]) uniqueCount++;
        }
        int[] uniqueArray = new int[uniqueCount];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!duplicateFlags[i]) uniqueArray[index++] = arr[i];
        }
        return uniqueArray;
    }

    // So sánh giá trị trung bình của nửa đầu và nửa cuối
    public static void compareAverage(int[] arr) {
        int half = arr.length / 2;
        double avgFirstHalf = 0, avgSecondHalf = 0;
        for (int i = 0; i < half; i++) avgFirstHalf += arr[i];
        for (int i = half; i < arr.length; i++) avgSecondHalf += arr[i];

        avgFirstHalf /= half;
        avgSecondHalf /= arr.length - half;
        
        System.out.println("TB nửa đầu: " + avgFirstHalf + ", TB nửa cuối: " + avgSecondHalf);
        if (avgFirstHalf > avgSecondHalf) System.out.println("Nửa đầu lớn hơn");
        else if (avgFirstHalf < avgSecondHalf) System.out.println("Nửa cuối lớn hơn");
        else System.out.println("Hai nửa bằng nhau");
    }

    // Tìm số lớn thứ 3
    public static void findThirdLargest(int[] arr) {
        if (arr.length < 3) {
            System.out.println("Không đủ phần tử để tìm số lớn thứ 3");
            return;
        }

        Arrays.sort(arr);
        int count = 1, thirdLargest = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] != arr[i + 1]) count++;
            if (count == 3) {
                thirdLargest = arr[i];
                break;
            }
        }
        System.out.println(count >= 3 ? "Số lớn thứ 3: " + thirdLargest : "Không tìm thấy số lớn thứ 3");
    }
}


