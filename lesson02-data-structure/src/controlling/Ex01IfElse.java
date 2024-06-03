package controlling;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.Year;
import java.util.Random;
import java.util.Scanner;

import javax.management.loading.PrivateClassLoader;

public class Ex01IfElse {
	public static void main(String[] args) {
		Random rd = new Random();
		
		/*
		 * câu 1 : random 1 số nguyên ngẩu nhiên từ  5- 20 
		 * kiểm tra số nguyên đó có phải là số chẳn không 
		 * nếu là số chẳn thì in ra  năm hiện tại + số chẳn đó 
		 * nếu không phải in ra không phải 
		 */
//		int number = rd.nextInt(5,20);
//		if(number % 2==0) {
//			System.out.println("giá trị --> "+Year.now().getValue() + number  );
//		}else {
//			System.out.println("không phải số chẳng ");
//		}
		
		/*
		 * câu 2 : nhập vào mật khảu  kiểm tra dộ dài của mật khẩu có hợp lệ không
		 * nếu độ dài mâtj khẩu lớp hơn >= 8 in ra mật khẩu hợp lệ 
		 * ngược lại nếu mâtj khẩu út hơn 8 chữ số thì in ra mật khẩu không hợp lệ
		 */
//		Scanner ip = new Scanner(System.in);
//		System.out.println("enter password ");
//		String password = ip.nextLine();
//		if(password.length()>=8) {
//			System.out.println("đăng nhập thành công  ");
//			
//		}else {
//			System.out.println("mật khảu không hợp lệ ");
//		}
//		ip.close();
		
		/*
		 * câu 3 : random điểm trung bình của học sinh 0.0 - 10.0
		 * kq số không biết được số thập phân bao nhiêu làm tròn lấy một chữ số số  thập phân
		 * nếu đểm mà 
		 * 0-5     : yếu
		 * 5-6.5   : trung bình 
		 * 6.5-8   : khá 
		 * 8-10    : giỏi
		 */
		float avgpoint = rd.nextFloat(0, 10);
		System.out.println("average point : "+avgpoint);
		// làm tron một chữ số thập phân kết quả commercial round 
		// 2.352(2.4) , 9.97 (10.0)
		BigDecimal bdAvgpoint = BigDecimal.valueOf(avgpoint).setScale(1, RoundingMode.HALF_UP);
		
		float roundeAvgpoint = bdAvgpoint.floatValue();
		System.out.println("============ "+roundeAvgpoint);
		
//		String ranking = "";
//		if(roundeAvgpoint< 5) {
//			ranking = "yếu";
//		}else if(roundeAvgpoint<6.5) {
//			ranking = "trung bình ";
//		}else if(roundeAvgpoint<8) {
//			ranking = "khá";
//		}else {
//			ranking ="giỏi";
//		}
//		System.out.println("ranking -> "+ranking);
		
			
		
	}

}
