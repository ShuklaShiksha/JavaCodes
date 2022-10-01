package com.practice.array;

public class ReverseArray {
	static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
     public static void main(String [] args) {
    	 int arr[]= {5,9,7,3,8};
    	 int low=0;
    	 int high=arr.length-1;
    	 while(low<high) {
    		 int temp=arr[low];
    		 arr[low]=arr[high];
    		 arr[high]=temp;
    		 low++;
    		 high--;
    	 }
    	 printArray(arr);
     }
}
