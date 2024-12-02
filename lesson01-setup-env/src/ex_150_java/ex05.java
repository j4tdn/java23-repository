package ex_150_java;

public class ex05 {
	
	
	// xóa khoản trắng trong chuỗi
	
	public static void main(String[] args) {
		
		String n = "F   re et     u  t  s.n et";
		System.out.println("Khi chưa xóa khoảng trắng"+n);
		
		n=n.replaceAll(" ", "");
		System.out.println("Đã xóa khoảng trắng"+n);
	}
}
