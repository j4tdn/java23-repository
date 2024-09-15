package bean;

import bean.*;

public class Students {
	private int id;
	private String name;
	private String ranhst ;
	
	public Students(){		
	}
	public Students(int id , String name , String rankst) {
		this.id = id ;
		this.name = name;
		this.ranhst = rankst;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRanhst() {
		return ranhst;
	}
	public void setRanhst(String ranhst) {
		this.ranhst = ranhst;
	}
	@Override
	public String toString() {
		return "Student [ id= " + id + ", name=" + name +  "]";
	}

}
