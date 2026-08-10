//logic for reversing array using 2 pointer approch
package com.dsa.day3;

import java.util.Scanner;

public class reversing {
	int i;

       int a[]= new int [5];
       void set(Scanner sc)
       {
	 for(i=0; i<a.length; i++)
	 {
		 a[i] =sc.nextInt();
	 }
	
       }
       void reverse() {
    	   int f=0 ,l=a.length-1,temp;
    	   while(f<=1)
    	   {
    		   temp = a[f];
    		   a[f] = a[l];
    		   a[l] =temp;
    		   f++;
    		   l--;
    	   }
       }
       void show() {
    	   for(i=0; i<a.length; i++)
    	   {
    		   System.out.println(a[i]);
    	   }
       }
	public static void main(String[] args) {
		reversing r= new reversing();
     Scanner sc= new Scanner(System.in);
    
     r.set(sc);
     r.reverse();
     r.show();
     sc.close();
     
	}

}
