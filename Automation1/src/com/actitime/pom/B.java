package com.actitime.pom;

public class B {

	public static void main(String[] args) {
       A a1 = new A(10);
       int v = a1.getValue();
       System.out.println(v);
       
       a1.setValue(20);
       System.out.println(a1.getValue());
       
       a1.setValue(30);
       System.out.println(a1.getValue());
	}

}
