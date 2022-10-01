package com.practice.array;
//program to track elements where no greater element on right side
public class Leaders {
	
	static void leaderBoss(int arr[], int n) {
		int currentLeadr=arr[n-1];
		System.out.print(currentLeadr+" ");
		for(int i=n-2;i>=0;i--) {
			if(currentLeadr<arr[i]) {
				
				currentLeadr=arr[i];
				System.out.print(currentLeadr+" ");	
			}
		}
		
	}
   public static void main(String[] args) {
	   int arr[]= {7,10,4,10,6,5,2};
	   int n=arr.length;
	   leaderBoss(arr,n);
	   
   }
}
