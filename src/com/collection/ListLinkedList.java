package com.collection;

import java.util.LinkedList;
import java.util.List;

public class ListLinkedList {

	public static void main(String[] args) {
		
		List<Object> bbb = new LinkedList <Object>();
		
		bbb.add("iphone");
		bbb.add(456);
		bbb.add("car");
		bbb.add(456);
		bbb.add('g');
		
	System.out.println(bbb);	
	
	int f = bbb.size();
	System.out.println(f);	
	
	 Object w = bbb.get(3);
	System.out.println(w);	
		
		bbb.set(2, "tiger");
		System.out.println(bbb);
		 
		//bbb.remove(4);
	//	System.out.println(bbb);
		
		   int mb = bbb.indexOf(456);
		   System.out.println(mb);
		    
		  boolean n = bbb.contains("tiger");
		   System.out.println(bbb);
		   
		 //  bbb.clear();
		 //  System.out.println(bbb);
		   List<Object> ff = new LinkedList <Object>();
			
			ff.add("samsung");
			ff.add(456);
			ff.add("lion");
			ff.add(456);
			ff.add('m');
			
		 // bbb.addAll(ff);
		   //System.out.println(bbb);
		  
		//bbb.removeAll(ff);
     //  System.out.println(bbb);
			
			bbb.retainAll(ff);
			System.out.println(bbb);
        
		   
	}	
}
