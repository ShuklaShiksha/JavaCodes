package com.practice.twoDarray;

public class SortedSearchMatrix {
 static void sorted(int arr[][], int r, int c, int x) {
	 int i=0;
	 int j=c-1;
	 while(i<r && j>=0) {
		 if(arr[i][j]==x) {
			 System.out.println("found at "+i+" "+j);
			 return;
		 }
		 else if(arr[i][j]>x) {
			 j--;
		 }
		 else {
			 i++;
		 }
	 }
	 System.out.println("not found");
 }
	public static void main(String[] args) {
		int arr[][]= {{1,2,3,4},
				      {5,6,7,8},{9,10,11,12}};
			int r=3, c=4;	      
            int x=7;
            sorted(arr,r,c,x);
		
		
	}
}
