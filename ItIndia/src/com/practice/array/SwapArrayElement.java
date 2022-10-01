package com.practice.array;
//swap array element
public class SwapArrayElement {
	static void getInterchange(int arr[], int i, int j) {
		if(i<0 || i>arr.length-1)
			return ;
		if(j<0 || j>arr.length-1)
			return ;			
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;

		
	}
	static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
//		System.out.println("");
//		
		
		
	}
	
	public static void main(String [] args) {
		int arr[]= {5,20,12,20,8};
		
		
		int i=2;
		int j=0;
		getInterchange(arr,i,j);
		printArray(arr);
	}
}

