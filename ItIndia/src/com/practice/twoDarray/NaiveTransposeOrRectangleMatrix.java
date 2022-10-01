package com.practice.twoDarray;

public class NaiveTransposeOrRectangleMatrix {
	static void transpose(int arr[][], int n ){
		int temp[][]=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				temp[j][i]=arr[i][j];
			}
		}
		for(int i=0;i<arr.length;i++) {//row-4
			for(int j=0;j<arr[i].length;j++) {//col-4
				System.out.print(temp[i][j]+" ");
			}
			System.out.println(" ");
		}
		
			}
	public static void main(String[] args) {
		int arr[][]= {{1,2,3,4},
				      {5,6,7,8},{9,10,11,12},{13,14,15,16}};
			int n=4;	      

	transpose(arr,n);
	
		
	}
}
