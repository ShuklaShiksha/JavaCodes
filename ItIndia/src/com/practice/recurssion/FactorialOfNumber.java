package com.practice.recurssion;
//eg-main executed some space given, then y then x, these x and y still occupy memory bcz they are still not over.x is over when x return. similary y over when it return and 
//then main will be over.these function call keep occupying space in the memory called as func stack.inside stack we push elem and pop elem out{LIFO}
//recursion take some space inside memory, extra space due to internal stack.

public class FactorialOfNumber {
	
  static int recursion(int n) {
	if(n==0) {
		return 1;
	}
	int half=recursion(n-1);
	return n*half;
	
  }
public static void main(String[] args) {
	int n=3;
	System.out.println(recursion(n));
}
}
