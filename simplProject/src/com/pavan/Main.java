package com.pavan;

import java.util.ArrayList;
class A{
	transient Object arr[];
	Object arr1;
	A(int k){
		arr=new Object[k];
	}
}
public class Main {
	public static void main(String[] args) {
	    A a=new A(5);
	    Object k[]=a.arr;
	    k[0]=3;
	    
	}

}
