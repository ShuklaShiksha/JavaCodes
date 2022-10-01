package com.practice.string;

public class AnagramString {
static boolean areAnagram(char[] str1, char[] str2) {
	if(str1.length!=str2.length) {
		return false;
	}
	int count[] =new  int[256];
	for(int i=0;i<str1.length;i++) {
		count[str1[i]]++;
	}
	for(int i=0;i<str2.length;i++) {
		count[str2[i]]--;
	}
	for(int i=0;i<256;i++) {
		if(count[i]!=0) {
			return false;
		}
	}
	return true;
}
public static void main(String[] args) {
	char str1[]="geeksforgeeks".toCharArray();
	char str2[]="forgeeksgeeks".toCharArray();
	//function call
	if(areAnagram(str1,str2)) {
		System.out.print("anagram");
	}
	else {
		System.out.print("not anagram");

	}
}
}
