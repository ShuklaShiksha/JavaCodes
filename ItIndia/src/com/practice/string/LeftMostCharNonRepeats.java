package com.practice.string;

public class LeftMostCharNonRepeats {
static int firstNonRepeat(String str) {
	int res=Integer.MAX_VALUE;
	int n=256;
	int nonVisited[]=new int[n];
	for(int i=0;i<256;i++) {
		nonVisited[i]=-1;
	}
	for(int i=0;i<str.length();i++) {
		if(nonVisited[str.charAt(i)]==-1) {
			nonVisited[str.charAt(i)]=i;
		}
		else {
			nonVisited[str.charAt(i)]=-2;
		}
	}
	for(int i=0;i<256;i++) {
		if(nonVisited[i]>=0) {
			res=Math.min(res,nonVisited[i]);
		}
	}
	return (res==Integer.MAX_VALUE?-1:res);
}
public static void main(String[] args) {
	String str="geekforgeek";
	int index=firstNonRepeat(str);
	if (index == -2)
        System.out.printf("Either all characters are "
            +"distinct or string is empty");
    else
        System.out.printf("First non-Repeating character"
            +" is %c",
            str.charAt(index));

}
}
