package com.practice.array;
//program to move zeroes to end of array 
public class MovingZeroes {
	
	static void swap(int arr[], int i, int count) {
		if(i<0 || i>arr.length-1)
			return;
		if(count<0 || count>arr.length-1)
			return;
		int temp=arr[i];
		arr[i]=arr[count];
		arr[count]=temp;
	}
	static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
      public static void main(String [] args) {
    	  int arr[]= {10,5,0,0,7,0};
    	  int count=0;
    	  for(int i=0;i<arr.length;i++) {
    	  if (arr[i]!=0) {
    		  swap(arr,i,count);
    		  count++;
    	  }
    	 
    	  
    	  
         }
    	  printArray(arr);
    	  
    }

}