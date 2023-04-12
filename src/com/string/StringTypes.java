package com.string;

public class StringTypes {

	public static void main(String[] args) {
		
	   String a =  " welcome to java ";
		System.out.println(System.identityHashCode(a));
	    String b = " welcome to java ";                                //immutable
	    String c =" welcome to java ";
	    System.out.println(System.identityHashCode(c));
		System.out.println(System.identityHashCode(b));
	   System.out.println(a+b+c);
		System.out.println(System.identityHashCode(a+b+c));	
		
		System.out.println("---------------------");
		
		//mutable
		
		String cfc = "nishanth";
		StringBuffer n = new StringBuffer (cfc);
		System.out.println(n);
		System.out.println(System.identityHashCode(n));
		String gfg = "nishanth";                                 //StringBuffer
		StringBuffer m = new StringBuffer (gfg);
		System.out.println(m);
		System.out.println(System.identityHashCode(m));
		System.out.println(n.append(m));
		System.out.println(System.identityHashCode(n.append(m)));
		
		System.out.println("------------");
		
		String cf = "nishanth";
		StringBuilder ne = new StringBuilder (cf);
		System.out.println(ne);
		System.out.println(System.identityHashCode(ne));
		String gf = "nishanth";                                   //StringBuilder
		StringBuilder me = new StringBuilder (gf);
		System.out.println(me);
		System.out.println(System.identityHashCode(me));
		System.out.println(ne.append(me));
		System.out.println(System.identityHashCode(ne.append(me)));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}	
}
