package com.practice.recurssion;

public class JosephusProblem {
static int joscircular(int n, int k) {
	if(n==1) return 0;
	else{
		return (joscircular(n-1,k)+k)%n;
	}
}
	
public static void main(String[] args) {
	int n=5;
	int k=3;
	System.out.println(joscircular(n,k));
}
}
