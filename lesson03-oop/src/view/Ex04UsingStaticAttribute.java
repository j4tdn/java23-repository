package view;

import bean.CarAdv;

public class Ex04UsingStaticAttribute {
	public static void main(String[] args) {
		
		CarAdv c1 = new CarAdv("A1", " Red", 220d);
		CarAdv c2 = new CarAdv("A2", " Green", 320d);
		CarAdv c3 = new CarAdv("A3", " Blue", 420d);
		CarAdv c4 = new CarAdv("A4", " White", 120d);
		
		//c2.setModel("Audi");
		
		System.out.println("c1 --> " + c1);
		System.out.println("c2 --> " + c2);
		System.out.println("c3 --> " + c3);
		System.out.println("c4 --> " + c4);
		
		//c4.setModel("MG");
		CarAdv.model = "MG";
		c4.setName("A444");
		
		
		// thuoc tinh non-static: thuoc pham vi cua doi tuong
		// -> moi doi tuong quan ly rieng
		// thuoc tinh static: thuoc pham vi cua class
		// -> cac doi tuong dung chung gia tri
		// -> k nen lay bien, goi ham setter de cap nhat gia tri
		// 		gay hieu nham la dang cap nhat cho rieng no 
		// -> nen lay classs de cap nhat
		System.out.println("=== Modified value of static attribute ===");
		
		
		
		
		
		
		
		// attribute
		
		// non-static: chi dc goi thong qua doi tuong (bat buoc)
		
		
		// static: thuoc pham vi cua class
		// --> co the goi qua class, doi tuong cua class
		// --> nen goi thong qua class
		// --> goi thong qua doi tuong --> warning
	}
}
