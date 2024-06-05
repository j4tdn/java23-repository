package loop;

public class EX03DoWhile {
public static void main(String[] args) {
	// chay truoc roi check
	/*
	 * int a =8; int b = 26; int running =a; do { if(running %5 ==0)
	 * System.out.println("boi cua 5  --> "+running); running++; }while(running
	 * <=b);
	 * 
	 * 
	 * //ket thuc vong lap -> break //ket thuc vong lap hien tai -> continue running
	 * =a ; while(running <=b) { System.out.println("prefix -> "+running);
	 * if(running==10) {break;} System.out.println("suffix ->" + running);
	 * running++; }
	 */
	 int x =0;
	 int y =0;
	 for(int z =0; z<5;z++) {
		 if((++x >2)&& (++y >2)) {
			 x++;
		 }
	 }
	 System.out.println(x+ " " +y);
} 
}

