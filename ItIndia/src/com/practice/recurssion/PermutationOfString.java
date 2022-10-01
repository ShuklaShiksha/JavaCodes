package com.practice.recurssion;

public class PermutationOfString {
	static void permute(String str,int l, int r) {
		if(l==r) {
			System.out.println(str);
			return;
		}
		for(int i=l;i<=r;i++) {
			str=swap(str,l,i);
			 permute(str,l+1,r);
			 str=swap(str,l,i);
			 
		}
	}
	static String swap(String str, int i, int j) {
		char temp;
		char[] arr=str.toCharArray();
		temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		return String.valueOf(arr);
		
	}
public static void main(String[] args) {
	String str="abc";
	int l=0;
	int r=str.length()-1;
	permute(str,l,r);
}
}
//t.c=O(n*n*!) s.c-O(r-l)