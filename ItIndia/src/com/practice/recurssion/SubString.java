package com.practice.recurssion;

public class SubString {
static void powerset(String str,int i,String curr) {
	if(i==str.length()) {
		System.out.println(curr);
		return;
	}
	powerset(str,i+1,curr+str.charAt(i));//include
	powerset(str,i+1,curr);//exclude
}
public static void main(String[] args) {
	String str="abc";
	String curr="";
	int i=0;
	powerset(str,i, curr);
	
}
}
