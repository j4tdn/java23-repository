package utils;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import bean.CD;
import bean.Card;

public class MultiUlti {

	 public static void generate(String prefix,Object e) {
    	 System.out.println(prefix + "--> " + e);  
       }
	
	public static void printf(String prefix, Collection<CD> collection){
		System.out.println(prefix + "--> ");
	collection.forEach(e -> System.out.println(e + " "));
	}
	
	public static void printf2(String prefix, Collection<Card> collection){
		System.out.println(prefix + "--> ");
	collection.forEach(e -> System.out.println(e + " "));

	}
	
	
	 public static <K,V> void print(String prefix,Map<K,V> map) {
		 System.out.println("prefix + --> { ");
	Set<Entry<K,V>> entries = map.entrySet();
	for(Entry<K,V> entry : entries) {
		System.out.println("    + " +entry);
	}
		 System.out.println("}\n");
	 }
	 
}