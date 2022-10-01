package com.practice.string;
//given two string,check if they are rotstor of each other
public class TwoStringRotator {
static boolean areRotation(String str1,String str2) {
	if(str1.length()!=str2.length()) return false;
	str1=str1+str2;
	
	return (str1.indexOf(str2)>=0);
}
public static void main(String[] args) {

	String str1="abcd";
	String str2="cdab";
	System.out.println(areRotation(str1,str2));
}
}
