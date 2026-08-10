package com.dsa.day2;

public class Insertionsort {

	public static void main(String[] args) {
    int a[]= {90,50,40,80,30,20};
    int i,j,key;
  
    for(i=1; i<a.length; i++)
    {
    	  key=a[i];
    	  j=i-1;
  while(j>=0 && a[j]>key)
  {
	  a[j+1]=a[j];
	  j--;
  }
  a[j+1]=key;
    }
    for(Integer x:a)
    {
    	System.out.println(x+ " ");
    }
	}

}