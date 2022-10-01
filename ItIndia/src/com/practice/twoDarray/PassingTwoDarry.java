package com.practice.twoDarray;
//passing 2d array as argument
public class PassingTwoDarry {
	static void print(int arr[][]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");

			}
		System.out.println(" ");
		}

	}
public static void main(String[] args) {
	int arr[][]= {{3,5,7},{7,9,5,3}};
	print(arr);
}
}
