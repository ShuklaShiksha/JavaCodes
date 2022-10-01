package com.practice.sorting.comparator;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
	

		 public static void main(String[] args) {
			Point[] arr= {new Point(10,20),new Point(3,12),new Point(5,7)};
			Arrays.sort(arr,new custom_comparator());
			System.out.println();
			for(int i=0;i<arr.length;i++) {
				System.out.println(arr[i].x+" "+arr[i].y);

			}
		 }
		}