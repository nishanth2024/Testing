package com.polymorpisum;

public class Employee {

	public void employDetails ( String name ) {
	 System.out.println(name);	
	}
	
	public void employDetails ( byte age, short height, int salary) {
		 System.out.println(age + " " + height + " " + salary);	
		}
	
	public void employDetails ( long marks, long income, int rank ) {
		 System.out.println  (marks + " " + income + " " + rank);
		}
	
	public void employDetails ( int marks, float income, long rank,  float j ) {
		 System.out.println  (marks + " " + income + " " + rank + " "+ j);	
	
	}
	
	public void employDetails (float a, float b,float c, float d ){
		 System.out.println(a+" "+b+" "+c+" "+d);	
		}
	
	public void employDetails (int a, int b,int c, int  d , int e){
		 System.out.println(a+" "+b+" "+c+" "+d);
	}	 
	
		
	public static void main(String[] args) {
		
		Employee obj = new Employee ();

		obj.employDetails("nishanth");
		obj.employDetails("michael");
		obj.employDetails("polymorphisum");
		obj.employDetails(9, 6, 9);
		obj.employDetails(67, 9.6f, 89, 67 );
		obj.employDetails(87, 1.23f, 189, 90 );
		obj.employDetails(1.2f, 6.0f,7.4f,8.9f);
		obj.employDetails(87, 45, 34);
		obj.employDetails(87, 34, 87, 69, 65);
		obj.employDetails(244, 567, 98, 987, 765);
}
}