package com.practice.string;

public class LexographicRankOfString {
static int fac(int n) {
	if(n==0)return 1;
	int partialAns=fac(n-1);
	return n*partialAns;
}
static int findRank(char str[]) {
	int max_char=256;
	int count[]=new int[max_char];
	int rank=1;
	int n=str.length;
	int mul=fac(n);
	for(int i=0;i<n;i++) {
	  count[str[i]]++;	
	}
	return mul;
}
public static void main(String[] args) {
	char str[]="string".toCharArray();
	System.out.println(findRank(str));
}
}
