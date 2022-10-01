package com.practice.mathematics;

import java.util.ArrayList;

public class QuadraticRoots {
static ArrayList<Integer> rootsquad(int a,int b, int c) {
	ArrayList<Integer> roots=new ArrayList<>();
	double d=b*b-4*a*c;
	if(d<0) {
		roots.add(-1);
		
	}
	else {
		double dr=Math.sqrt(d);
		double root1=(-b+dr)/2*a;
		double root2=(-b-dr)/2*a;
		roots.add((int)(Math.max(root1, root2)));
		roots.add((int)(Math.min(root1, root2)));

		
	}
	return roots;
	
}
	
public static void main(String[] args) {
	int a=6;
	int b=11;
	int c=-35;
	System.out.println(rootsquad(a,b,c));
}
}
