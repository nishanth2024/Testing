package com.throwandthrows;

public class ThrowAndThrows {

	public  void  abc (int a) throws Exception {
		if(a>=18) {
		throw new Exception("408 error you can vote");	
		}else {
		System.out.println("you can't vote");	
		}
	}
	public static void main(String[] args) throws Exception {
		ThrowAndThrows call = new ThrowAndThrows ();
		call.abc(20);
	}
}


