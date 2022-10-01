package com.practice.array;

public class SwapElement {
    public static void main(String [] args) {
    	
    	
    	
    	//with using 3 rd var
    	int a=20,b=10;
    	int temp;
    	temp=a;
    	a=b;
    	b=temp;
    	System.out.println(a+" "+b);
    	//without using 3rd variable
    	int x=40,y=50;
    	x=x+y;
    	y=x-y;
    	x=x-y;
    	System.out.println(x+" "+y);

    	
    }
}
