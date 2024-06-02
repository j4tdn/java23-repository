 package datastructure.object;

import bean.Item;

public class Ex04AvailableObjectType {
		public static void main(String[] args) {
			
			int a=5;
			double b= 7;
			
			//object :type
			//custom : Item , Employee, Store ..
			//available : Integer, double , character , string , bigDecimal
			
			Item item1 = new Item(1,'A',11);
			// class integer có một thuộc tính (là số nguyên)
			Integer i1 =new Integer(22);
			Integer i2 =44;
			//class double có một thuộc tính (số thực)
			Double d1 = new Double(44d);
			Double d2 = 88d;
			//class String có một thuộc tính(chuỗi)
			String s1 = new String("hello");
			String s2 = new String("xin chao ");
			String s3 = new String("hello");
			String s4= null;
			
			String x1= "java";
			String x2= "php";
			String x3= "java";
			x3= "spring";
			
			
			
			//interger , double ,string --> immutable class
			//--> mmot thuộc tính
			//HEAP(constant pool)
			//immutable class : là class ở đó khu tạo ra đối tượng, ô nhớ ở heap
			//bên trong ô nhớ đó chứa giá trị thuộc tính mà không thể cập nhật giá trị thuộc tính trong ô nhớ đó đc
			
			//Item --> Mutable class
			// --> 1 hoặc n thuộc tính
			//HEAP
			//Muốn 1 class từ Mutable -> Immutable
			// 1-> cho các thuộc tính có access modifire : private
			//2-> thêm từ khóa final để không thể truy cập giá trị
			
			
		}
	}

