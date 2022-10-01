package com.practice.recurssion;

public class NthPowerOfX {
static long betterPowerRec(long x,long n) {
	//base cond
	if(n==0) return 1;
	long temp=betterPowerRec(x,n/2); //here rec(3,5)-rec(3,2)-rec(3,0), so number of nodes and height reduces
	                                 //n+n/2+n/4+....+1=n+n/2+n/2^2+....n/n^k=|n/n^|1=k=log2base n
	                                 //t.c=s.c=o(logn)
	if(n%2==1) {
		return temp*temp*x;
	}
	else {
	return temp*temp;
	}
}

public static void main(String[] args) {
	long n=5;
	long x=3;
//	System.out.println(powerRecu(x,n));
	//forLooppower(x,n);
	System.out.println(betterPowerRec(x,n));
}
}


//1)
//static long powerRecu(int x, int n) {
//if(n==0)
//	return 1;
//long parans=powerRecu(x,n-1);        //here no of nodes is n therefore t.c=o(n) also s.c=o(n) as height of tree is n
//return x*parans;
//
//}

//2)

//static void forLooppower(int x, int n) {
//long mul=1;
//for(int i=0;i<n;i++) {
//	mul=mul*x;
//}
//System.out.println(mul);
//}