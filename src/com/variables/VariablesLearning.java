package com.variables;

public class VariablesLearning {
	int b = 90;                               // class variable
	
	static int c ;            // static variable
	
	public void varidables (){
		int a;                             //local variables
		a =24;
		System.out.println(a);
		System.out.println(c);
		System.out.println(b);
		
	}
	public static void main(String[] args) {
		
	VariablesLearning obj = new VariablesLearning ();
	
	obj.varidables();
   System.out.println(obj.b);               // class variable
	
	System.out.println(c);                               // static variable
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
}		


