package view;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import bean.Word;
import utils.MultiUlti;

public class Ex04Libraries {
	static Scanner sc = new Scanner(System.in);
 public static void main(String[] args) {
	 List<Word> mockWords = new LinkedList<>();
	 int luaChon= 0;
	
     do {
    	 System.out.println("Các lựa chọn: ");
    	 System.out.print("1: Thêm từ\n");
    	 System.out.print("2: Tra từ điển\n");
    	 System.out.print("0: Thoát chương trình\n");
    	  luaChon = sc.nextInt();
    	 sc.nextLine();
     if(luaChon == 1) {
    	 System.out.println("Nhập vào từ:");
    	 String word = sc.nextLine();
    	 System.out.println("Nhập vào nghĩa:");
    	 String mean = sc.nextLine();
    	 System.out.println("Nhập vào từ loại:");
    	 String type = sc.nextLine();
    	 System.out.println("Nhập vào ghi chú:");
    	 String note = sc.nextLine();
    	 
    	 Word tuVung = new Word(word, mean, type, note);
    	 mockWords.add(tuVung);
     }else 
    	 if(luaChon == 2) {
    		 System.out.println("Nhập từ cần tra: ");	
    		 String checkWord = sc.nextLine();
           Word kq = findWord(mockWords, checkWord);
           MultiUlti.generate("Từ cần tìm: ", kq);
    	 }
    	 
     }while(luaChon!=0);
		
	}
	
	public static Word findWord(List<Word> mockWords, String checkWord) {
		for(var tu: mockWords ) {
             if(tu.getWord().equalsIgnoreCase(checkWord)){
            	 return tu;
             }
	   }
		return null;
	}
}
