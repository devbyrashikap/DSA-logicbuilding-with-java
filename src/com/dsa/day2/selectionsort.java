package com.dsa.day2;

public class selectionsort {

	public static void main(String[] args) {
    int a[]= {12,34,56,1,6,5};
    int i,j,temp;
    for(i=0; i<a.length; i++)
    {
    	int min=i;
    	for(j=i+1; j<a.length; j++)
    	{
    		if(a[j]<a[min])
    		{
    			min=j;
    		}
    	}
    	temp =a[i];
    	a[i] = a[min];
    	a[min] =temp;
    }
     System.out.println("sorted array");
     for(Integer x: a)
     {
    	 System.out.println(x+" ");
     }
	}

}
