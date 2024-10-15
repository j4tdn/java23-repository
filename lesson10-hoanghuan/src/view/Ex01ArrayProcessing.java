package view;

public class Ex01ArrayProcessing {
	public static void main(String[] args) {
        int[] array = {7, 8, 8, 8, 6, 2, 5, 1};
        System.out.println("Mảng ban đầu: ");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();

        int[] uniqueElements = removeDuplicates(array);
        System.out.println("Các phần tử xuất hiện duy nhất: ");
        for (int value : uniqueElements) {
            System.out.print(value + " ");
        }
        System.out.println();

        if (array.length % 2 == 0) {
            compareAverage(array);
        } else {
            System.out.println("Không thể so sánh trung bình vì n không chia hết cho 2.");
        }

        int thirdLargest = findThirdLargest(array);
        if (thirdLargest != -1) {
            System.out.println("Số lớn thứ 3 trong mảng: " + thirdLargest);
        }
    }
	
    public static int[] removeDuplicates(int[] array) {
        int n = array.length;
        int[] frequency = new int[51]; 
        for (int num : array) {
            frequency[num]++;
        }

        int count = 0;
        for (int num : array) {
            if (frequency[num] == 1) {
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0;
        for (int num : array) {
            if (frequency[num] == 1) {
                result[index++] = num;
            }
        }
        return result;
    }

    public static void compareAverage(int[] array) {
        int n = array.length;
        int half = n / 2;

        double sumFirstHalf = 0;
        for (int i = 0; i < half; i++) {
            sumFirstHalf += array[i];
        }
        double avgFirstHalf = sumFirstHalf / half;

        double sumSecondHalf = 0;
        for (int i = n - half; i < n; i++) {
            sumSecondHalf += array[i];
        }
        double avgSecondHalf = sumSecondHalf / half;

        System.out.println("Trung bình n/2 phần tử đầu: " + avgFirstHalf);
        System.out.println("Trung bình n/2 phần tử cuối: " + avgSecondHalf);
        if (avgFirstHalf > avgSecondHalf) {
            System.out.println("Phần đầu có trung bình lớn hơn.");
        } else if (avgFirstHalf < avgSecondHalf) {
            System.out.println("Phần cuối có trung bình lớn hơn.");
        } else {
            System.out.println("Hai phần có trung bình bằng nhau.");
        }
    }

    public static int findThirdLargest(int[] array) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

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

        if (third == Integer.MIN_VALUE) {
            System.out.println("Không có đủ phần tử để tìm số lớn thứ 3.");
            return -1; 
        }

        return third;
    }
}
