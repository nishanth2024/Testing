package com.exception;

public class ExceptionPractice {

	public static void main(String[] args) {
		
		//number format exception
		
		String a = "12345";
         int r =  Integer.parseInt(a);
	System.out.println(r);
	
	System.out.println("--------------");
	
	//exeption handel
	
	
		
			try {
				String d = null ;
				int y = d.length();
				System.out.println(y);
			} catch (ArithmeticException e) {	
				e.printStackTrace();	
			} catch (Exception e) {
				e.printStackTrace();
			}
		
	
	System.out.println(" next codes");
	
	int p = 23;
	int b = 20;
	System.out.println(p+b);
	
	
	}
}
