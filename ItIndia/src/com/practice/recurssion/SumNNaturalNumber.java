package com.practice.recurssion;
//time complexity is equal to no of nodes, space complexity is equal to height of tree
public class SumNNaturalNumber {
static int sumNatural(int n) {
	if(n==1) {//0 is not base condition bcz 0 is not natural number so we need to stop at 1
		return 1;
	}
	int sum=sumNatural(n-1);
	return n+sum;
}
	
	
public static void main(String[] args) {
	int n=5;
	System.out.print(sumNatural(n));
}
}
