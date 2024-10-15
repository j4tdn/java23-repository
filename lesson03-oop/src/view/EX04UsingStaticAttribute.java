package view;

import bean.CarAdv;

public class EX04UsingStaticAttribute {
public static void main(String[] args) {
	CarAdv c1 = new CarAdv("A1","Red",220d);
	CarAdv c2 = new CarAdv("A2","Yellow",220d);
	CarAdv c3 = new CarAdv("A3","Blue",220d);
	CarAdv c4 = new CarAdv("A4","White",220d);
	CarAdv.model = "Audi";
	//c2.setModel("Audi");
	System.out.println("c1--->"+c1);
	System.out.println("c2--->"+c2);
	System.out.println("c3--->"+c3);
	System.out.println("c4--->"+c4);
	CarAdv.model = "MG";
	//c4.setModel("MG");
	c4.setName("A222");
	System.out.println("--------------");
	System.out.println("c1--->"+c1);
	System.out.println("c2--->"+c2);
	System.out.println("c3--->"+c3);
	System.out.println("c4--->"+c4);
}
	
	
}
