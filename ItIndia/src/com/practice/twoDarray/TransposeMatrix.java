package com.practice.twoDarray;

public class TransposeMatrix {
	static void transpose(int[][]arr,int n) {
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {//swap(arr[i][j],arr[j][i])
				int tem=arr[i][j];
			    arr[i][j]=arr[j][i];
			    arr[j][i]=tem;
			}
		}
	}
	
	
public static void main(String[] args) {
	int n=4;
	int arr[][]= {{1,2,3,4},
			      {5,6,7,8},
			      {9,10,11,12},
			      {13,14,15,16}};
	transpose(arr,n);
    System.out.println("modified array:- " );

	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
		    System.out.print(arr[i][j]+" ");
		   

		}
		System.out.print("\n " );
	}
}
}
