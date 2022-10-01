package com.practice.twoDarray;
//print boundry element-first row,last column, last row, first column
public class BoundaryElement {
	static void printBound(int[][] arr,int r, int c) {
		if(r==1) {
			for(int i=0;i<c;i++) {
				System.out.println(arr[0][i]+"");
				
			}
		}
		else if(c==1) {
			for(int i=0;i<r;i++) {
				System.out.println(arr[i][0]+"");

			}
		}
		else {
			//top row
		for(int i=0;i<c;i++) {
			System.out.println(arr[0][i]+"");

		}
		//right column
		for(int i=1;i<r;i++) {
			System.out.println(arr[i][c-1]+"");

		}
		//bottom row
		for(int i=c-2;i>=0;i--) {
			System.out.println(arr[r-1][i]+"");

		}
		//left column
		for(int i=r-2;i>=1;i--) {
			System.out.println(arr[i][0]+"");

		}
		
		}	
	}
public static void main(String[] args) {
	int r=4;
	int c=4;
	int arr[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
	printBound(arr,r,c);
}
}
