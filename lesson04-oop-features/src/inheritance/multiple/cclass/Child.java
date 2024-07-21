package inheritance.multiple.cclass;

public class Child extends Father /*, Mother*/ implements Ancestor, GrandFather{

	//Mấu chốt: Java ko hỗ trợ đa thừa kế
	//Vì khi 1 class extends 1 class cha
	//Không bắt buộc override các methods từ cha
	
	//VD Father có cooking, Mother cũng có cooking.
	//Child extends Father, Mother, đồng thời ko override
	//-> child.cooking() sẽ ko biết thừa kế ai.
	
	@Override
	public void drinking() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eating() {
		// TODO Auto-generated method stub
		
	}

	
	
	
	
}
