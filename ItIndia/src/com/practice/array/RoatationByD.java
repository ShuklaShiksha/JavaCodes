package com.practice.array;

public class RoatationByD {
	static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		}
	
	static void leftRotation(int arr[],int d) {
		int n=arr.length;
		reverse(arr,0,d-1);
		reverse(arr,d,n-1);
		reverse(arr,0,n-1);
	}
	static void reverse(int arr[], int low,int high) {
		while(low<high) {
			
		int temp=arr[low];
		arr[low]=arr[high];
		arr[high]=temp;
		low++;
		high--;
		
		}
		
	}
	
	public static void main(String[] args) {
		int arr[]= {5,8,9,2,4};
		int d=3;
		
		int n=arr.length;
		leftRotation(arr,d);
		
		printArray(arr);
	}
	
	
	

}
