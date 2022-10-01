package com.practice.sorting.comparator;

import java.util.Comparator;

public class custom_comparator implements Comparator<Point>{
	

		@Override
		public int compare(Point a, Point b) {
			// TODO Auto-generated method stub
			return a.x-b.x;
		}
		
	}


