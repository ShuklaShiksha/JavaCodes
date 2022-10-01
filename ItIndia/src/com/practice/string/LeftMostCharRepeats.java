package com.practice.string;

public class LeftMostCharRepeats {
  static int firstRepeating(String str) {
	  int n=256;
	  int res=Integer.MAX_VALUE;
	  int visited[]=new int[n];
	  for(int i=0;i<n;i++) {
		  visited[i]=-1;
	  }
	  for(int i=str.length()-1;i>=0;i--) {
		  if(visited[str.charAt(i)]==-1) {
		     visited[str.charAt(i)]=i;
		  }
		  else {
			  res=visited[str.charAt(i)];
		  }
	  }
	  return (res==Integer.MAX_VALUE)?-1:res;
  }
  public static void main(String[] args) {
	  String str="geeksforgeek";
	 // System.out.println(firstRepeating(str));
	  int index = firstRepeating(str);
	    if (index == -1)
	        System.out.printf("Either all characters are "
	            +"distinct or string is empty");
	    else
	        System.out.printf("First Repeating character"
	            +" is %c",
	            str.charAt(index));
  }
}
