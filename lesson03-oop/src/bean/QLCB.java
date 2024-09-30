package bean;

import java.util.ArrayList;
import java.util.Scanner;

public class QLCB {

	// Tạo mảng có thể thêm hoặc xóa ta dùng ArrayList
      private ArrayList<Cadre> dscb;
	
      public QLCB() {
           dscb = new ArrayList<Cadre>(10);	
      }
      // thêm cán bộ
      
      public void themCanBo(Cadre cb) {
    	  dscb.add(cb);	
      }
     
      public void nhapDanhSach(Scanner sc) {
    	  	Cadre canbo;
    	  	System.out.println("Nhập số lượng cán bộ: "); 
    	  	int n = sc.nextInt();
    	  	System.out.println("Nhập thông tin chi tiết: ");
    	  	System.out.println("Chọn cán bộ (1:Kỹ sư); (2:Nhân viên); (3: Công nhân) ");
    	  	int chon = sc.nextInt();
    	  	sc.nextLine();
    	  	canbo = new Cadre();
    	  	switch(chon) {
    	  	case 1: 
    	  		canbo = new Engineer();
    	  		break;
    	  	case 2: 
    	  		canbo = new Staff();
    	  		break;
    	  	case 3: 
    	  		canbo = new Worker();
    	  		break;
      }
    	canbo.nhapThongTin(sc);
         themCanBo(canbo);
      }
      
      public void findName(String name) {
    	  for(Cadre cb:dscb) {
    		  if(name.equals(cb.getName())){
                     cb.hienThiThongTin();
    		  }
    	  }
      }
      
      
}
