package view;

public class Ex02Boxing {
	public static void main(String[] args) {
		// boxing, unboxing , auto-boxing,auto-Unboxing
		//chỉ áp dụng các kdl đối tượng có sẵn của java: Integer, double,float,long , char
		
		int p1 = 5;//stack 
		
		Integer o1=7;//heap
		Integer o2=null;
		Integer o3= null;
		//Boxing : biến kdl nguyên thủy chuyển thành kdl đối tượng 
		//unboxing : kdl đối tượng chuyển thành kdl nguyên thủy
		p1= o1; //p1 =o1.value (bị lỗi nullPointerException)khi o1 đang là null
		o1 = p1;//o1.value=p1
		
		System.out.println("p1 -->"+p1);
		
		//p1 = o2; //npe vì o2 null không thể gọi hàm intvalue
		o3= p1;
		System.out.println("o3 -->"+o3);
	}
}
