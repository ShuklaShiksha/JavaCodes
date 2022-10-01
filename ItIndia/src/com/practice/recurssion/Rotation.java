package com.practice.recurssion;

public class Rotation {
static void printarr(int arr[]) {
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]+" ");
	}
}
static void rotate(int arr[], int l, int r) {
	if(l>=r) return;
	int temp=arr[l];
	arr[l]=arr[r];
	arr[r]=temp;
	rotate(arr,l+1,r-1);
	printarr(arr);
}
public static void main(String[] args) {
	int arr[]= {1,2,3,4};
	int l=0;
	int r=arr.length-1;
	rotate(arr,l,r);
}
}
