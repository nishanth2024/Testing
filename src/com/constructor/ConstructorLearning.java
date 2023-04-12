package com.constructor;

public class ConstructorLearning {

	
	public ConstructorLearning (String name) {
		System.out.println(name);
	}
	public ConstructorLearning (int a, int b, long c) {
		
	   System.out.println(a+" "+b+" "+c); 
	}
    
	

  public  ConstructorLearning () { //default constructor
	
	System.out.println("URGENTINA WON THE WORLD CUP");	
	
  }
  
  public void colours () {
	 System.out.println("red, blue,green"); 
  }
  
  public static void main (String[] args) {
	  ConstructorLearning obj2 = new ConstructorLearning () ;
	  ConstructorLearning obj1 = new ConstructorLearning (50, 100, 2000) ;
	  
	  ConstructorLearning obj3 = new ConstructorLearning ("gandhi");
	  obj2.colours();
	 

  }
  
 }

