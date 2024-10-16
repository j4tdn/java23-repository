package view;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex01Modified {

    public static void main(String[] args) {
        Random rd = new Random();
        Scanner ip = new Scanner(System.in);
        int n;

        // Yêu cầu người dùng nhập số n < 10
        do {
            System.out.print("Nhập số n (n < 10): ");
            n = ip.nextInt();
        } while (n >= 10);
        
        // Tạo mảng ngẫu nhiên với các phần tử trong khoảng từ 10 đến 50
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = rd.nextInt(41) + 10;
        }
        System.out.println("Mảng ban đầu --> " + Arrays.toString(arr));

        // Loại bỏ phần tử trùng nhau
        int[] filteredArr = removeDuplicates(arr);
        System.out.println("Mảng sau khi loại bỏ phần tử trùng nhau --> " + Arrays.toString(filteredArr));

        // So sánh giá trị trung bình giữa nửa đầu và nửa cuối
        compareAverages(arr);

        // Tìm số lớn thứ 3
        int thirdLargest = findThirdLargest(arr);
        System.out.println("Số lớn thứ 3 trong mảng --> " + thirdLargest);
    }

    // Phương thức loại bỏ các phần tử trùng nhau
    private static int[] removeDuplicates(int[] arr) {
        int[] result = new int[arr.length];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                result[count++] = arr[i];
            }
        }
        return Arrays.copyOf(result, count);
    }

    // Phương thức so sánh giá trị trung bình của nửa đầu và nửa cuối
    private static void compareAverages(int[] arr) {
        int mid = arr.length / 2;
        int sumFirstHalf = 0, sumSecondHalf = 0;

        for (int i = 0; i < mid; i++) {
            sumFirstHalf += arr[i];
        }
        for (int i = mid; i < arr.length; i++) {
            sumSecondHalf += arr[i];
        }

        double avgFirstHalf = (double) sumFirstHalf / mid;
        double avgSecondHalf = (double) sumSecondHalf / (arr.length - mid);

        if (avgFirstHalf > avgSecondHalf) {
            System.out.println("Giá trị trung bình nửa đầu lớn hơn nửa cuối");
        } else if (avgFirstHalf < avgSecondHalf) {
            System.out.println("Giá trị trung bình nửa cuối lớn hơn nửa đầu");
        } else {
            System.out.println("Giá trị trung bình của hai nửa bằng nhau");
        }
    }

    // Phương thức tìm số lớn thứ 3 trong mảng
    private static int findThirdLargest(int[] arr) {
        int[] uniqueArr = removeDuplicates(arr);
        if (uniqueArr.length < 3) {
            System.out.println("Không có đủ phần tử để tìm số lớn thứ 3");
            return Integer.MIN_VALUE; // Trả về giá trị nhỏ nhất nếu không có đủ phần tử
        }

        Arrays.sort(uniqueArr);
        return uniqueArr[uniqueArr.length - 3];
    }
}
