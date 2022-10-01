package com.practice.sort;

public class SelectionSort {
	static void getselSort(int arr[], int n) {
		for(int i=0;i<n-1;i++) 
		{
			int min_idx=i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[min_idx]) {
					min_idx=j;
					
				}
				
					
				
			}
			
			swap(arr, min_idx,i);
			
			
		}
	}
	static void swap(int arr[],int min_idx,int i ) {
		int tem= arr[min_idx];
		 arr[min_idx]=arr[i];
		 arr[i]=tem;
	}
	static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		int arr[]= {10,5,8,20,2,18};
		int n= arr.length;
		getselSort(arr,n);
		printArray(arr);
	}

}
