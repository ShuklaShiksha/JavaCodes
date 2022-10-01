package com.practice.array;
//N-bonacci numbers.print first M N-bonacci numbers
public class FirstmNbonacci {
	static void binocciSeries(int N,int M) {
		
		int[] arr= new int[8];
		for(int i=0;i<M;i++) {
			arr[i]=0;
		}
		arr[N]=1;
		arr[N-1]=1;
		//sliding technique
		for(int i=N+1;i<M;i++) {
			arr[i]=2*arr[i-1]-arr[i-N-1];
		}
		//printing array
		for(int i=0;i<M;i++) {
			System.out.println(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		int N=3;
		int M=8;
		
		binocciSeries(N,M);
	}
	
	
	
	

}
