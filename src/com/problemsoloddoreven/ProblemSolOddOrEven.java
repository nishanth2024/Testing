package com.problemsoloddoreven;

import java.util.Scanner;

public class ProblemSolOddOrEven {

	public static void main(String[] args) {
	/*	System.out.println("type the number");
		Scanner abc = new Scanner (System.in);
		int m = abc.nextInt();
		System.out.println("the value is"+" "+m);
		if(m%2 == 0) {
			System.out.println("even");
		}else {
			System.out.println("odd");
		}*/
		System.out.println("-------------------------------------");
		
		// without using conditional statement 
		  // but using looping statement
		
		System.out.println("enter the value below");
		Scanner ccc = new Scanner (System.in);
		 int o = ccc.nextInt();
		int i;
		for(i =o; o%2==0; i++ ) {
			System.out.println("even");
			break;
		}
		System.out.println();
		int j;
		for(j=o%2 ; j-1==0; j++) {
		System.out.println("odd");
		break;
		} 
		
		
		
	}
}
