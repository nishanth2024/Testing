package com.inheritance;

public class GrandChild extends Inheritance_Learning {
	
	public void car () {
		System.out.println("BMW");
	}
	
	public static void main(String[] args) {
		
		GrandChild obj = new GrandChild ();

		obj.land();
		obj.house();
		obj.car();
		
	}

}
