package com.scannerclass;

import java.util.Scanner;

public class ScannerLearning {

	public static void main(String[] args) {
			
	Scanner amazon = new Scanner (System.in);	
	
	System.out.println(" Welcome to Amazon Mobile.com ");
		
	System.out.println("Search   our   mobile   brands   below.");
	
	 String search = amazon.nextLine();
	 
	System.out.println("Sorry the product you searched is not available! ");
	System.out.println("But you can buy any 2 available products listed below");
	System.out.println("----------");
	System.out.println("1.old nokia keypad set 20% discount");
	System.out.println("2.micromax 4G 10% discount");
	System.out.println("3.KARBON smartphone 10% discount");
	System.out.println("4.LAVA 40% discount");
	System.out.println("5.Tataindicom lanline 30% discount");
	System.out.println("----------");
	System.out.println("type any 2 brands which is available right now");
	String brandName = amazon.nextLine();
	System.out.println("The product you selected price  RS; 5000");
	String brandName2 = amazon.nextLine();
	System.out.println("The product you selected price  RS; 3000");
	System.out.println("------------------------------------------");
	System.out.println("you can also mention the length  of the mobile below");
	float length = amazon.nextFloat();
	System.out.println("you can also mention the breath  of the mobile below");
	float breath = amazon.nextFloat();
	System.out.println("phone length"+length+" "+"breath"+breath);
	System.out.println("finilize your product no.1 name below");
	
	String brandName3 = amazon.nextLine();
	String n = amazon.nextLine();
	System.out.println("the product no.1 you finilised is"+" "+n);
	System.out.println("-----------------------------------------------------------");
	System.out.println("finilize your product no.2 name below");
	String n2 = amazon.next();
	System.out.println("the product no.2 you finilised is"+" "+n2);
	System.out.println("-----------------------------------------------------------");
	System.out.println("Enter the quantity of "+" "+n+" "+" below.");
	   int  q1  = amazon.nextInt();
	   System.out.println("-----------------------------------------------------------");   
	   System.out.println("Enter the quantity of "+" "+n2+" "+" below."); 
	   int q2 = amazon.nextInt();
	   System.out.println("-----------------------------------------------------------");
    System.out.println("The quantity of the product "+" "+n+" "+"is"+" "+q1+" "+"and"+n2+" "+"is"+" "+q2);
    System.out.println("-----------------------------------------------------------");
    System.out.println("calculate your products below");
    System.out.println("enter the price of the product no.1 below");
	int a= amazon.nextInt();
	System.out.println("enter the quantity of the product no.1 below");
	int a2 = amazon.nextInt();
	int aa = a*a2;
	System.out.println("-----------------------------------------------------------");
	System.out.println("enter the price of the product no.2 below");
	int b =amazon.nextInt();
	System.out.println("enter the quantity of the product no.2 below");
	int b2 = amazon.nextInt();
	int bb =b*b2;
	System.out.println("-----------------------------------------------------------");
	System.out.println("TOTAL cost is");
	
	int c1 = aa+bb;
	System.out.println("RS;"+" "+c1);
	}
	
	
	
	
	
	
}
