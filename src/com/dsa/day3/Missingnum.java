//missing number
package com.dsa.day3;

public class Missingnum {

	public static void main(String[] args) {
     int a[]= {1,2,4,5};
     int n, totalsum=0, arraysum=0 , i , missingno; 
     n=a[a.length-1];
     totalsum =n*(n+1)/2;
     for(i=0; i<a.length; i++)
     {
    	 arraysum = 	arraysum + a[i];
     }
     missingno= totalsum - arraysum;
     System.out.println("missing no"+missingno);
	}

}
