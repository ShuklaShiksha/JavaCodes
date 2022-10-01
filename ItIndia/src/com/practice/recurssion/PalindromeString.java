package com.practice.recurssion;

public class PalindromeString {
	
//static boolean palindromeRecur(String s,int l, int r) {
//	//base cond
//	if(l>=r) return true;
//	if(s.charAt(l)!=s.charAt(r)) return false; //here no of nodes become half and height of tree .so tc and sc=O(n/2)=O(n)
//	
//	return palindromeRecur(s,l+1,r-1) ;
//}
//static boolean isPalindrome(String s) {
//	return palindromeRecur(s,0,s.length()-1) ;
//}
//public static void main(String[] args) {
//	String s="RADAR";
//	 if (isPalindrome(s))
//         System.out.println("Yes");
//     else
//         System.out.println("No");
	static boolean recursive(String str, int l, int r) {
		if(l>=r) return true;
		if(str.charAt(l)!=str.charAt(r)) {
			return false;
		}
		
		return recursive(str,l+1,r-1);
	}

	
	public static void main(String[] args) {
		String str="abba";
		int l=0;
		int r=str.length()-1;
		System.out.println(recursive(str,l,r));
		
	}
 }


