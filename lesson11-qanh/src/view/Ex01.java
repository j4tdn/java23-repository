package view;

public class Ex01 {
    public static void main(String[] args) {
        int n = 3;
        int max = 2 * n - 1;

        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(j+" ");
            for (int k = 1; k <= 2 * (n - i) - 1; k++)
                System.out.print("  ");
            for (int j = max - i + 1; j <= max; j++)
                System.out.print(j+" ");
            System.out.println();
        }

        for (int i = 1; i <= max; i++)
            System.out.print(i+" ");
        System.out.println();

        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++)
                System.out.print(j+" ");
            for (int k = 1; k <= 2 * (n - i) - 1; k++)
                System.out.print("  ");
            for (int j = max - i + 1; j <= max; j++)
                System.out.print(j+" ");
            System.out.println();
        }
    }
}
