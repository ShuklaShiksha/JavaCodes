package com.practice.array;
//area to trap rain water'
public class TrappingRainWater {
	static int getWater(int heights[]) {
		
		int n= heights.length;
		//base case
		if(n<=2) {
			return 0;
		}
		int area=0;
		
		int lMax[]=new int[n];
	    lMax[0]=heights[0];
	    
	    
	    for(int i=1;i<n;i++)
	    	lMax[i]=Math.max(heights[i],lMax[i-1] );
	    int rMax[]=new int[n];
	    rMax[n-1]=heights[n-1];
	    for(int i=n-2;i>=0;i--)
	    	rMax[i]=Math.max(heights[i],rMax[i+1]);
	     
	    for(int i=1;i<n;i++) {
	    	area+=+Math.min(lMax[i],rMax[i])-heights[i];
	    }
    	System.out.println(area);

		return area;
	    
	}
	


  public static void main(String[] args) {
	  int heights[]= {3,0,1,2,5};
	  
	  getWater(heights);
  }
}
