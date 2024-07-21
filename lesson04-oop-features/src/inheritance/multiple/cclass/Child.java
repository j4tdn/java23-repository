package inheritance.multiple.cclass;

public class Child extends Father /* Mother */ implements Ancestor, GrandFather	 {

	/*
	 * Mấu chốt của vấn đề:Java k hỗ trợ đa thừa kế 
	 * Vì khi 1 class con extends từ 1 class cha 	
	 * --> ko bắt buộc phải overide hàm từ cha 
	 * 
	 * Vd: Father có hàm cooking,Mother cũng có hàm cooking 
	 * Child extends Father,Mother đồng thời k có override
	 * child.cooking() sẽ k biết thừa kế gọi từ cha/mẹ nào 
	 */

 @Override
public void eating() {
	// TODO Auto-generated method stub
	
}
 @Override
public void drinking() {
	// TODO Auto-generated method stub
	
}
}
