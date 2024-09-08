import java.util.Scanner;

public class Ex06 {
		
		/*
		 *Cho dãy các số tự nhiên được viết ra thành một dãy vô hạn trên đường thẳng:
	1234567891011121314 ........ (1). Hỏi số ở vị trí thứ 100 trong dãy trên là số nào ?
	Bạn hãy làm bài này theo hai cách: Cách 1 dùng suy luận logic trong vòng 30s rồi nhớ
	kết quả trong đầu và cách 2 viết chương trình để tính toán và so sánh hai kết quả với
	nhau.
	Tổng quát bài toán trên: Chương trình yêu cầu nhập số K từ bàn phím và in ra trên màn
	hình kết quả là số nằm ở vị trì thứ K trong dãy (1) trên. Yêu cầu chương trình chạy càng
	nhanh càng tốt.
		 */
	public static void main(String[] args) {
		 StringBuilder sb = new StringBuilder();
		int running = 1;
		int findingPos = 100;
		while(sb.length()<findingPos) {
			sb = sb.append(running++);
			
		}
		System.out.println("100th Number --> " + sb.charAt(findingPos - 1));
	}

}
