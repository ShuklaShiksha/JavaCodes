package com.practice.searching;

public class BinarySearchIteative {
 //t.c=s.c=0(logn) and sorted array
	static int sort(int arr[], int l, int r, int x) {
		while(l<=r) {
			int mid=l+(r-l)/2;
			if(arr[mid]==x) {
				return mid;
			}
			if(arr[mid]>x) {
				r=mid-1;
			}
			l=mid+1;
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[]= {2,3,4,10,40};
		int l=0;
		int r=arr.length-1;
		int x=40;
		System.out.println(sort(arr,l,r,x));
	}
}
