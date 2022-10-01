package com.practice.sort;

public class BubbleSort {
	
  static void getsort(int[] arr, int n) {
	  for(int i=0;i<n-1;i++) {
		  boolean m=false;
		  for(int j=0;j<n-i-1;j++) {
			 if(arr[j]>arr[j+1]) {
				 int temp=arr[j];
				 arr[j]=arr[j+1];
				 arr[j+1]=temp;
			 }
		  }
	  }
  }
	static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
  
  public static void main(String[] args) {
	  int arr[]= {2,10,8,7};
	  int n=arr.length;
	  getsort(arr,n);
	  printArray(arr);
  }
}
