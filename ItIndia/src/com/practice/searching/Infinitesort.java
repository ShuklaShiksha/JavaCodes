package com.practice.searching;

public class Infinitesort {
//given infinite  size sorted array, need o find x element
//  10,20,40,80,90,100,120,140 x=100	
	static int search(int arr[], int x) {
		if(arr[0]==x) {
			return 0;
		}
		int i=1;
		while(arr[i]<x) {
			i=i*2;
		}
		if(arr[i]==x) {
			return i;
		}
		else {
			return binarySearch(arr,i/2,i,x);
		}
	}

private static int binarySearch(int[] arr, int l, int r, int x) {
	// TODO Auto-generated method stub
	
	while(l<=r) {
		int mid=l+(r-l)/2;
		if(arr[mid]==x) {
			return mid;
		}
		else if(arr[mid]>x) {
			
			return binarySearch(arr,l,mid-1,x);
		}
		else {
			return binarySearch(arr,mid+1,r,x);
		}
	}
	return -1;
}
public static void main(String[] args) {
	int arr[] = new int[]{3, 5, 7, 9, 10, 90,
            100, 130, 140, 160, 170};
	int x=100;
	System.out.println(search(arr,x));
}
}
