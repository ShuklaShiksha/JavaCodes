package com.practice.searching;

public class RoatedSortedArraySearch {
//given a sorted rotated array of distint element need to fing x element
	static int roatatate(int arr[], int x) {
	 int l=0;
	 int r=arr.length-1;
	 while(l<=r) {
		 int mid=l+(r-l)/2;
		 if(arr[mid]==x) {
			 return mid;
		 }
		 else if(arr[mid]>=arr[l]) {
			 if(x>=arr[l] && x<=arr[mid] ){
				 r=mid-1;
			 }
			 else {
				 l=mid+1;
			 }
		 }
		 else {
			 if(x>=arr[mid] && x<=arr[r]) {
				 l=mid+1;
			 }
			 else {
				 r=mid-1;
			 }
		 }
		 
	 }
	return -1;
	}
	public static void main(String[] args) {
		int arr[]= {7,8,0,1,2,3,4,5,6};
		int x=5;
		System.out.println(roatatate(arr,x));
	}
}
