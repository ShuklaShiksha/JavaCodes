package com.practice.sort;

import java.util.Arrays;

public class Insertion {
   static void insert(int arr[]) {
	   for(int i=0;i<arr.length-1;i++) {
		   for(int j=i+1;j>0;j--) {
			   if(arr[j-1]>arr[j]) {
				   int temp=arr[j];
				   arr[j]=arr[j-1];
				   arr[j-1]=temp;
			   }
			   else {
				   break;
			   }
		   }
	   }
	 
   }
   public static void main(String[] args) {
	   int arr[]= {4,5,1,2,3};
	   insert(arr);
	   System.out.println(Arrays.toString(arr));
   }
}
