package com.practice.searching;

public class CountOccurance {
//in sorted array with repetation count occurance of elements
	//2,3,3,3,3,6,7
	static void countOcc(int arr[],int x) {
		int l=0;
		int r=arr.length-1;
		int x1=firstocc(arr,l,r,x);
		int y=lastocc(arr,l,r,x);
		int z=x1-y+1;;
		System.out.println("count of repeted elements "+z);
	}

private static int lastocc(int[] arr, int l, int r, int x) {
		// TODO Auto-generated method stub
	 int pos=-1;
	 while(l<=r) {
		 int mid=l+(r-l)/2;
		 if(arr[mid]>x) {
			 r=mid-1;
		 }
		 else if(arr[mid]<x){
			l=mid+1; 
		 }
		 else {
			 pos=mid;
			 r=mid-1;
		 }
	 }
		return pos;
	}

private static int firstocc(int[] arr, int l, int r, int x) {
	// TODO Auto-generated method stub
	int pos=-1;
	 while(l<=r) {
		 int mid=l+(r-l)/2;
		 if(arr[mid]>x) {
			 r=mid-1;
		 }
		 else if(arr[mid]<x){
			l=mid+1; 
		 }
		 else {
			 pos=mid;
			 l=mid+1;
		 }
	 }
		return pos;
	
}
public static void main(String[] args) {
	int arr[]= {2,3,3,3,3,3,8};
	int x=3;
	countOcc(arr,x);
}
}
