package com.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class SetLearning {

	public static void main(String[] args) {
		
		//hashset
	/*	Set <Object> a = new HashSet <Object> (); 
		
		
      a.add(23);
      a.add("nis");
      a.add(239);
      a.add(67);
      System.out.println(a);
      
      int size = a.size();
      System.out.println(size);
      
      boolean contains = a.contains("nis");
      System.out.println(contains);
      
      //a.clear();
     // System.out.println(a);
      
     Set <Object> b = new HashSet <Object> (); 
     b.add(null);
     b.add("g");
     b.add("nis");
     b.add(600);
     System.out.println(b);
      
	//	a.addAll(b);
	//	System.out.println(a);
		
	//	b.removeAll(a);
		//System.out.println(b);
		
	  a.retainAll(b);
	  System.out.println(a);
	  
	   boolean empty = a.isEmpty();
		System.out.println(empty);
		
		
		System.out.println("---------------");
		 
		//LinkedHashSet
		
		Set <Object> n = new LinkedHashSet <Object>();
		
		n.add("read");
		n.add(345);
		n.add(" monkey ");
		n.add(null);
		System.out.println(n);
		
		System.out.println("-------------");
		
		Set <Object> o = new TreeSet <Object>();
		
		o.add(12.0);
		o.add(6.4);
		o.add(23.2);
		o.add(3.4);
		o.add(2.5);
		System.out.println(o);
		
		int size2 = o.size();
		System.out.println(size2);
		
		boolean contains2 = o.contains(42.6);
		System.out.println(contains2);
		
		
		
		Set <Object> h = new TreeSet <Object>();
		
		h.add(23.2);
		h.add(123.7);
		System.out.println(h);
		
		//h.clear();
	//	System.out.println(o);
		
	//	h.addAll(o);
		//System.out.println(h); 
		
	//	boolean empty2 = h.isEmpty();
		//System.out.println(empty2);
		
		//o.removeAll(h);
	//	System.out.println(o);
		
		o.retainAll(h);
		System.out.println(o);*/
		
		System.out.println("---------------");
		
		//map
		
		Map <Object, Object> j = new HashMap <Object,Object>();
		
		//j.put(102, "io");
		j.put(98, "nishanth");
		j.put(67, null);
		j.put(671, null);
		System.out.println(j);
		
		int size3 = j.size();
		System.out.println(size3);
		
		Object object = j.get(102);
		System.out.println(object);
		
		Set<Entry<Object, Object>> entrySet = j.entrySet();
		System.out.println(entrySet);
		
		Set<Object> keySet = j.keySet();
		System.out.println(keySet);
		
		Collection<Object> values = j.values();
		System.out.println(values);
		
		boolean containsValue = j.containsValue("nishanth");
		System.out.println(containsValue);
		
		boolean containsKey = j.containsKey(104);
		System.out.println(containsKey);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
