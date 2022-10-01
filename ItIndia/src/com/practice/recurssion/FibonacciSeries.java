package com.practice.recurssion;
//height of tree is n . so s.c=o(n), number of nodes=1+2+4+8+....n=2^n-1.so t.c=o(2^n)
public class FibonacciSeries {
	//nth term fibonacci 
	static int sumNatural(int n) {
		if(n==1) {
			return 1;
		}
		if(n==2) {
			return 1;
		}
		int fib=sumNatural(n-1);
		int fib2=sumNatural(n-2);
		return fib+fib2;
		
	}
public static void main(String[] args) {
	int n=7;
	
	System.out.println(sumNatural(n));
}
}
