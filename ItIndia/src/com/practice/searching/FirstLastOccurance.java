package com.practice.searching;

import java.util.Arrays;

public class FirstLastOccurance {
  static int[] occuran(int arr[],int x) {
	  int l=0, r=arr.length-1;
	  int ans[]=new int[2];
	  ans[0]= firstoccur(arr,l,r,x);
	  ans[1]=lastoccur(arr,l,r,x);
	return ans;
  }

private static int firstoccur(int [] arr, int l, int r, int x) {
	// TODO Auto-generated method stub
	int pos=-1;
	while(l<=r) {
	int mid=l+(r-l)/2;
	if(arr[mid]>x) {
		r=mid-1;
	}
	else if(arr[mid]<x) {
		l=mid+1;
	}
	else {
		pos=mid;
		r=mid-1;
	}
   }
	return pos;

}
private static int lastoccur(int[] arr, int l, int r, int x) {
	// TODO Auto-generated method stub
	int pos=-1;
  while(l<=r) {
	int mid=l+(r-l)/2;
	if(arr[mid]>x) {
		r=mid-1;
	}
	else if(arr[mid]<x) {
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
	int arr[]= {5,7,7,7,7,8,9,15};
	int x=7;
	occuran(arr,x);
	System.out.println(Arrays.toString(occuran(arr,x)));
}
}