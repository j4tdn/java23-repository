package structure.array;

import java.util.Arrays;

/**  
 * 1. Tìm kiếm những phần tử là bội của 2 trong mảng số nguyên
 * 	  Input(Parameter): Mảng
 *    Output(return type): Mảng số là bội của 2
 */
public class Ex02Filter {
    public static void main(String[] args) {
        int[] numbers = { 23, 25, 16, 33, 66 };
        int[] multiplesOfTwo = findMultiplesOfTwo(numbers);
        System.out.println(Arrays.toString(multiplesOfTwo));
    }

    private static int[] findMultiplesOfTwo(int[] elements) {
        int count = 0;

        // Đếm số lượng phần tử là bội của 2
        for (int element : elements) {
            if (element % 2 == 0) {
                count++;
            }
        }

        // Tạo mảng mới có kích thước bằng số lượng phần tử là bội của 2
        int[] result = new int[count];
        int index = 0;

        // Lưu các phần tử là bội của 2 vào mảng mới
        for (int element : elements) {
            if (element % 2 == 0) {
                result[index] = element;
                index++;
            }
        }

        return result;
    }
}
