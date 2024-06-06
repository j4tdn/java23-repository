package view;

public class Ex05OperatorTests {

	public static void main(String[] args) {
//		stack(ngăn xếp): LIFO:vào trước ra sau, vào sau ra trước:++i
//		queue(hàng đợi): FIFO:vào trước ra trước,vào sau ra sau: i++
		
		int i =2;
		if(++i >2  && i++ > 2) {
		}
if( i++ > 4 || +i > 5) {
      System.out.println("i11 ---->" +i);	
}
  if( i++ < 4 || ++i > 5) {
	  System.out.println("i14 ---->" +i);
  }
}
}