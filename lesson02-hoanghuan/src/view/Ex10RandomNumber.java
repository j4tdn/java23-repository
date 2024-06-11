package view;

import java.util.Random;

public class Ex10RandomNumber {
	public static void main(String[] args) {
        int[] n = new int[11]; 
        int[] result = new int[5]; 
        
        Random random = new Random();
        
        int count = 0;
        while (count < 5) {
            int RandomNumber = random.nextInt(11) + 20; 
            if (n[RandomNumber - 20] == 0) { 
                n[RandomNumber - 20] = 1; 
                result[count] = RandomNumber; 
                count++;
            }
        }
        System.out.println(java.util.Arrays.toString(result));
    }
}
