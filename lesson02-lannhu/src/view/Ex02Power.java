package view;

public class Ex02Power {
	
         public static void main(String[] args) {
         if (args.length == 0) {
            System.out.println("vui lòng cung cấp một số nguyên dương");
            return;    
         }
   int attempts = 0;
   int N = -1;   
   while (attempts < 5 && N == -1) {
	   try {
		N = Integer.parseInt(args[0]);
		if (N <= 0) {
			 throw new NumberFormatException();
			}
	   }catch (NumberFormatException e) {
		   attempts++;
			   if (attempts < 5) {
				   System.out.println("dữ liệu nhập vào không hợp lệ hoặc không phải là số nguyên dương. vui lòng nhâp lại");
				args[0] = "6";
			   }
	   }
   }
   
   if (N == -1) {
	   System.out.println("bạn đã vượt quá số lần thử tối đa");
   }else {
	   if (isPowerOfTwo(N)) {
		   System.out.println(N + "là lũy thừa của 2");
	   }else {
		  System.out.println(N + "không phải là lũy thừa của 2");
		  
	   }
   } 
	   }
   
    public static boolean isPowerOfTwo(int N) {
	return (N > 0) && ((N & (N -1)) == 0);
   }
}
		   
	   
   
         
         
         
         
