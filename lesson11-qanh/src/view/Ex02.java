package view;

import java.util.ArrayList;
import java.util.List;

import bean.CD;


public class Ex02 {
	  public static void main(String[] args) {
		  List<CD> CDs = new ArrayList<>();
		  CDs.add(new CD(101, "bolero", "Dan Trường", 10, 199000));
	      CDs.add(new CD(102, "rap"   , "krit", 2, 99000));
	      CDs.add(new CD(103, "kpop"  , "son tung", 6, 150000));
	      CDs.add(new CD(104, "children", "jack", 15, 200000));
	      CDs.add(new CD(105, "Hip-Hop", "HKT", 20, 350000));
		      	

	  
	 
			for (CD cds: CDs) {
				if (cds.getId() == CD.getId()) {
					System.out.println(" ");
					return;
				}
			}			

		}

}