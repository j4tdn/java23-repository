package view;

import bean.referBook;
import bean.textBook;

public class Ex5 {

	public static void main(String[] args) {
		textBook s1 = new textBook("SGK1",1000,"NhiDong","Moi");
		textBook s2 = new textBook("SGK2",2000,"TuoiTre","Moi");
		textBook s3 = new textBook("SGK3",3000,"ThanhNien","Cu");
		
		referBook s4 = new referBook("STK1",1000,"NhiDong",0.3);
		referBook s5 = new referBook("STK2",2000,"NhiDong",0.5);
	}

}
