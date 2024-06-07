package view;

import java.util.Random;

public class Ex07ExchangeBinary {
//	Viết chương trình chuyển đổi cơ số một số tự nhiên ở hệ cơ số 10(thập phân) thành số ở hệ
//	cơ số 2(nhị phân)
//	Tham khảo công thức: https://bit.ly/3QuVyXx
//	VD: Nhập N = 0 → 0
//	N = 1 → 1
//	N = 2 → 10
//	N = 3 → 11
//	N = 4 → 100
//	N = 5 → 101
	public static void main(String[] args) {
		int n = new Random().nextInt(15);
		System.out.println("Numeber in decimal: " + n);
		String rs = "";
		while(n!=0) {
			rs += String.valueOf(n%2);
			n = n/2;
		}
		String binaryNumber = "";
		for(int i = rs.length()-1;i>=0;i--)
		{
			binaryNumber += rs.charAt(i);
		}
		System.out.println("Number in binary: " + binaryNumber);
	}
}	
