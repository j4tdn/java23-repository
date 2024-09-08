package view;

public class Ex07 {

    public static void main(String[] args) {
        String text = "aaabbbbaaabbaaaaaaa";
        int maxLength = findMaxLength(text);
        int minLength = findMinLength(text);
        
        System.out.println("Độ dài lớn nhất của dãy con đúng: " + maxLength);
        System.out.println("Độ dài nhỏ nhất của dãy con đúng: " + minLength);
    }

    public static int findMaxLength(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        int max = 1;
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
            	count++;
            } else {
                if (count > max) {
                	max = count;
                }
                count = 1;
            }
        }
        if (count > max) {
        	max = count;
        }
        return max;
    }

    public static int findMinLength(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        int min = Integer.MAX_VALUE;
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
            	count++;
            } else {
                if (count < min) {
                	min = count;
                }
                count = 1;
            }
        }
        if (count < min) {
            min = count;
        }
        return min;
    }
}

