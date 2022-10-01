package com.practice.mathematics;

public class AbsoluteValue {
static int absolute(int n) {
	if(n>0) return n;
	else
		return n*(-1);
}
	
public static void main(String[] args) {
	int n=-45;
	System.out.println(absolute(n));
}
}
