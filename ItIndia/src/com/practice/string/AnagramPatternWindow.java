package com.practice.string;

public class AnagramPatternWindow {
	static boolean compare(int countText[],int countPat[]) {
		for(int i=0;i<256;i++) {
			if(countText[i]!=countPat[i]) {
				return false;
			}
		}
		return true;
	}
static void isAnagramPresent(String txt,String pat) {
	int n=256;
	int countText[]= new int[n];//initialize as zero
	int countPat[]=new int[n];//initialize as zero
	for(int i=0;i<pat.length();i++) {
		(countText[txt.charAt(i)])++;
		(countPat[pat.charAt(i)])++;
	}
	for(int i=pat.length();i<txt.length();i++) {
		if(compare(countText,countPat)) {//compare count of current window
			System.out.println("found at index"+(i-pat.length()));
		}
		(countText[txt.charAt(i)])++;//add current character to current window
		(countPat[txt.charAt(i-pat.length())])--;//remove first character of previous window(3-3)
	}
		if(compare(countText,countPat)) {
			System.out.println("found at index"+(txt.length()-pat.length()));
		}
	
	
}
public static void main(String[] args) {
	String txt="geeksforgeeks";
	String pat="egek";
	isAnagramPresent(txt,pat);
}
}
