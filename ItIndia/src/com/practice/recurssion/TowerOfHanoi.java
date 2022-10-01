package com.practice.recurssion;

public class TowerOfHanoi {
static void tOhanoi(int n, char from_rod, char to_rod, char aux_rod) {
	if(n==1) {
		System.out.println("move disc 1"+" from rod"+from_rod+ " to rod"+ to_rod);
		return;

	}
	tOhanoi(n-1,from_rod,aux_rod,to_rod);
	System.out.println("move disc"+n+" from rod"	+from_rod+ " to rod"+ to_rod);
	tOhanoi(n-1,aux_rod,to_rod,from_rod);
			 
}
public static void main(String[] args) {
	int n=4;//no of disc
	tOhanoi(n,'A','C','B');//names of rod a b and c
}
}
