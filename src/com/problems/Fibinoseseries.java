package com.problems;

public class Fibinoseseries {

	public static void main(String[] args) {
		
		int a[] = new int[10];
		a[0]=0;
		a[1]=1;                                      //fibinociseries
		int i, num;
		
		for(i=2; i<a.length; i++) {
			a[i]=a[i-1]+a[i-2];
			num = a[i];
			System.out.println(num);
		}
	}
}
