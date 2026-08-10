//merge two sorted array
package com.dsa.day1;

public class Mergetooarray {

	public static void main(String[] args) {
    int a[]= {1,3,5};
    int b[]= {6,7,9};
    int result[]=new int[a.length + b.length];
    int i,k=0;
    for(i=0; i<a.length; i++)
    {
    	 result [k]=a[i];
    	 k++; 
    }
    for(i=0; i<b.length; i++) {
    	result [k]=b[i];
    	k++;
    }
    System.out.println("merge array");
    for(Integer X: result)
    {
    	System.out.println(X+ " ");
    }
	}

}
