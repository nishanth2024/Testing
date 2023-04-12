package com.castinginobjectparent;

public class ChildCastingInObject extends CastingInObjectParent {

	public void childCycle () {
		System.out.println("herculis");
		System.out.println("-------------------------------------");
	}

	
	public static void main(String[] args) {
		
		ChildCastingInObject obj1 = new ChildCastingInObject ();
		obj1.childCycle();	
		
	    CastingInObjectParent obj2 = new ChildCastingInObject ();
	
	    obj2.parentProperty();
	    obj2.bike();
	}	
}
