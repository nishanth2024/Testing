package com.keywords;

public class ChildKey3 extends KeywordsLearning {

	int g = 700;
	 public void method3 () {
		 System.out.println(this.g);
	 }
	 
	public static void main(String[] args) {                //this
		
		ChildKey3 obj = new ChildKey3 ();
		obj.method3();
	
		
	}	
	}