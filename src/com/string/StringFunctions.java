package com.string;

public class StringFunctions {

	public static void main(String[] args) {
		
		
		String a = "nishanth";
		 
	    	int a1 =  a.length();
		
		System.out.println(a1);
		
	String b = "NIShANtH";
	
	    boolean b1  = b.equals(a);
		
	   System.out.println(b1);
		
	 boolean c = b.equalsIgnoreCase(a);
	 System.out.println(c);
		
	String d = a.toUpperCase();	
		System.out.println(d);
		
	String e = b.toLowerCase ();		
	System.out.println(e);
	 
	System.out.println("-------------------------------");
	
	String start = " welcome to ";
	 String s2 =   "welcome to java";	 
	 
  boolean  sw = s2.startsWith(start);
		System.out.println(sw);
	
	boolean f = s2.endsWith(start);
		System.out.println(f);
	
	boolean t = start.contains(" welcome ");  //contains
		System.out.println(t);
		
	int q = b.indexOf('h');              //indexOf
		System.out.println(q);
		
	int r = a.lastIndexOf('h');       //lastIndexOf
		System.out.println(r);
		
	char y	= a.charAt(6);            //char At
	System.out.println(y);
	
	String fR = s2.replace("java", "python");  //replace
	System.out.println(fR);
	
     String hj = s2.trim();
	System.out.println(hj);   // trim
	
	 String bn = s2.substring(1, 12);
	       System.out.println(bn);           //substring
	   
	 String[] cf= s2.split("to");
	  for(String mv : cf ) {                 //split
	  System.out.print(mv);              
	   }
	  
	                            
	       
	}	
	
}
