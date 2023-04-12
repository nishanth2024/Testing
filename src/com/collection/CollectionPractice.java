package com.collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionPractice {

public static void main(String[] args) {
	
	//collection
	//list
	//array
	
  List <Object> abc = new ArrayList <Object>();
	
  abc.add("nishanth");
  abc.add(934);
  abc.add(934);
  abc.add(90.743);	
  abc.add('+');	
  abc.add('m');
	
	System.out.println(abc);
	
   int k = abc.size();	
	System.out.println(k);
	
Object i = abc.get(4);
	System.out.println(i);
	
	abc.set(3, "red");
	System.out.println(abc);
	
	abc.remove(4);
	System.out.println(abc);
	
	int h = abc.indexOf("red");
	System.out.println(h);
	
   boolean c	= abc.contains(934);
    System.out.println(c);
    
   // abc.clear();
  //  System.out.println(abc);
    
    List <Object> ccc = new ArrayList <Object>();
    ccc.add("rajni");
    ccc.add(34);
    ccc.add(934);
    ccc.add(2.3);	
    ccc.add('*');	
    ccc.add('m');
    
 //   ccc.addAll(abc);
 //   System.out.println(ccc);
    
  //  abc.removeAll(ccc);
//    System.out.println(abc);
    
    abc.retainAll(ccc);
    System.out.println(abc);
    
}	
		
	
}
