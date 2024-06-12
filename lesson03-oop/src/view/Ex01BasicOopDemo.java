package view;

import bean.Car;

public class Ex01BasicOopDemo {
	public static void main(String[] args) {
		//Car :model, name,color ,price
		
		//yêu cầu :tạo 3 đối tượng car có kiểu dữ liệu bất kì và in ra
		
		//khi in ra biến là KDL đối tượng ->tự động gọi hàm toString ủa class object
					//					  ->tên package.class@hash
		
		//Nếu muồn in ra giá trị của ô nhớ HEAP mà biến đổi đối tượng đang trỏ đến
		//-->overide hàm toString
		
		Car c1= new Car("A","A1","Yellow",2000d);
		Car c2= new Car("A","A2","Red",4000d);
		Car c3= new Car("A","A3","Green",3000d);
		
		c2.setName("A22");//c2.setName("");
//		c3.setPrice(c1.getPrice()*2);
		c1.doublePrice();
		//Cập nhật tên của xe c2 thành A22
		//Cập nhât giá của xe c3 thành 6000
		//Cập nhật giá gấp đôi giá bán cho xe c1
		
		System.out.println("c1->"+c1);
		System.out.println("c2->"+c2);
		System.out.println("c3->"+c3);
		
		/*
		 * 
		 * FOP:data(no restriction, ttats cả đều truy cập được , không phân quền)
		 * OOP:data(access modifier, mỗi class cần quản lý dữ liệu riêng của nó)
		 * VD:Car:model  color price
		 * -->class cho thuộc tính có access modfier thành private
		 * quản lý riêng thông tin cho từng đối tượng
		  Vấn đề 1.các thuốc tích tron class car đang để access modifier là ""public 
					-->dùng ở đâu cũng được
			+ sử dụng private attribute để class bên ngoài ko thể truy cập trược tiếp thuộc tính
			
			+nhưng mình trong thực tế mình vẫn muốn classs bên ngoài có thể lấy/cập nhật giá trị cho các thuộc tính bên trong class
			
			VD 	công ty :
				nhân Viên:chứa tt private
				
				
				+setter -->cho phép cập nhật giá trị của thuộc tính private
				+getter -->lấy giá trị của thuộc tính private
		 */	

	}
}
