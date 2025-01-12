package ex_150_java;

import java.rmi.server.UnicastRemoteObject;
import java.util.HashSet;
import java.util.Random;

public class Ex15 {
	public static void main(String[] args) {
		Random random = new Random();
        HashSet<Integer> uniqueNumbers = new HashSet<>();  // Set dùng để lưu các số duy nhất

        // Tiến hành sinh ra 5 số ngẫu nhiên từ 20 đến 30 mà không trùng nhau
        while (uniqueNumbers.size() < 5) {
            int randomNumber = random.nextInt(11) + 20; // Sinh số ngẫu nhiên trong khoảng từ 20 đến 30
            uniqueNumbers.add(randomNumber); // Thêm số vào Set (trùng sẽ không thêm)
        }


        System.out.println("Các số ngẫu nhiên không trùng nhau: ");
        for (int num : uniqueNumbers) {
            System.out.println(num);
        }
	}
}
