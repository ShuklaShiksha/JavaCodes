 package com.practice.searching;

public class PeakElememt {
	static int peak(int arr[] , int n) {
		int l=0;
		int r=n-1;
		while(l<=r) {
			int mid=l+(r-l)/2;
			if(mid>0 && mid<n-1) {
				if(arr[mid]>=arr[mid-1] && arr[mid]>=arr[mid+1]) {
					return arr[mid];
				}
				else if(arr[mid-1]>arr[mid]) {
					 r=mid-1;
				}
				else {
					  l=mid+1;
				}
			}
			//corner case
			else if(mid==0){
				if(arr[0]>arr[1]) {
					return arr[0];
				}
				else {
					return arr[1];
				}
			}
			else if(mid==n-1) {
				if(arr[n-1]>arr[n-2]){
					return arr[n-1];
				}
				else {
					return arr[n-2];
				}
			}
	}
		return -1;
 
}
	public static void main(String[] args) {
        int[] arr = { 9,6,3 };
		int n=arr.length;
		System.out.println(peak(arr,n));
		
	}
}
