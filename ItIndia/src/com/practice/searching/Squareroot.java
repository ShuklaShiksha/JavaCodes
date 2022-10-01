package com.practice.searching;

public class Squareroot {
 static int root( int x) {
	 int l=1;
	 int r=x;
	 int ans=-1;
	 if(x==0|| x==1) {
		 return x;
	 }
	 while(l<=r) {
		 int mid=l+(r-l)/2;
		 if(mid*mid==x) {
			 return (int)mid;
		 }
		 if(mid*mid<x) {
			 l=mid+1;
			 ans=mid;
		 }
		 else {
			 r=mid-1;
		 }
	 }
	 return (int)ans;
 }
 public static void main(String[] args) {
	 int x=4;
	 System.out.println(root(x));
 }
}
