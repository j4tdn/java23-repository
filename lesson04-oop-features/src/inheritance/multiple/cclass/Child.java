package inheritance.multiple.cclass;

public class Child extends Father implements Ancestor,GrandFather

{
	
	//Mấu chốt vấn đề : Java ko hỗ trợ đa thừa kế
	//Vì khi 1 class  con extends tuwf 1 class cha
	// -->Khoong bat buoc phai override ham tu class cha
	
	//Ví dụ father có hàm cooking , mother cũng có hàm class
	//Chill extends Father, mother đồng thời ko override
	//chill.cooking() sẽ không biết thừa kế, gọi class cha/ mẹ nào
	
	@Override
	public void drinking() {
		System.out.println("Child drinking");
		
	}
	@Override
	public void eating() {
		System.out.println("Child eating");
		
	}
	
}
