package com.conditionalstatement;

import java.util.Scanner;

public class ConditionalstateSwitchCalculator {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner (System.in);
		
		System.out.println("calaulator");
		System.out.println("---------------------------------------------------------");
		System.out.println("Enter the value no.1");
		int a = obj.nextInt();
		System.out.println("Enter the opertor");
		char p = obj.next().charAt(0);
		System.out.println("Enter the value no.2");
		int b = obj.nextInt();
		char operator = (p);
		   
		//  p = '+';
		switch (p) {
		
		case '+':
		  
			int c = a + b;
		System.out.println(a+" "+"+"+b+" "+"="+" "+c);
		break;
		case '*':
			int w = a * b;
			System.out.println(a+" "+"*"+b+" "+"="+" "+w);
			break;
		case '-':
			int m = a - b;
			System.out.println(a+" "+"-"+b+" "+"="+" "+m);	
			break;
		case '/':
			int l = a / b;
			System.out.println(a+" "+"/"+b+" "+"="+" "+l);
			break;
	 default :
		 System.out.println(" the operator you applyed is not matched please use (+,-,*,/) any one of this operators");
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
