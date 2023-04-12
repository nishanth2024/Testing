package com.inheritance;

public class Parent extends Inheritance_Learning {
	
	public void Bike () {
		System.out.println("pulser");
	}
	public static void main(String[] args) {
		
		Parent obj = new Parent ();
		obj.Bike();
		obj.land();
		obj.house();
	}
}
