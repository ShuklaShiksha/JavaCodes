package com.practice.twoDarray;

public class SnakePattern {
	static void printSnake(int arr[][],int r,int c) {
		for(int i=0;i<r;i++) {
			if(i%2==0) {
				for(int j=0;j<c;j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println(" ");
				
				}
		  else {
				for(int j=c-1;j>=0;j--) {
					System.out.print(arr[i][j]+" ");

				}
				System.out.println(" ");

			}
		}
	}
	public static void main(String[] main) {
	int r=3;
	int c=4;
    int arr[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
    printSnake(arr,r,c);
	}
	
}
