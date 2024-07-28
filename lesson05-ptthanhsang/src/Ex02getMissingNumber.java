import java.util.Scanner;

public class Ex02getMissingNumber {

	public static int getMissingNumber(int[] mang, int n) {

		int tongDaySo = n * (n + 1) / 2;

		int tongMang = 0;
		for (int so : mang) {
			tongMang += so;
		}

		return tongDaySo - tongMang;
	}

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);

		System.out.print("Nhập giá trị n: ");
		int n = ip.nextInt();

		int[] mang = new int[n - 1];
		System.out.println("Nhập các phần tử của mảng: ");
		for (int i = 0; i < n - 1; i++) {
			mang[i] = ip.nextInt();
		}

		int soBiThieu = getMissingNumber(mang, n);
		System.out.println("Phần tử bị thiếu là: " + soBiThieu);
	}
}
