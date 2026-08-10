package com.dsa.day2;

public class Bubblesort {

	public static void main(String[] args) {
    int a[]= {50,70,30,20,10,40,90};
    int i,j,temp;
    for(i=0; i<a.length; i++)
    {
    	boolean swapped=false;
    	for(j=0; j<a.length-1-i; j++)
    	{
    		if(a[j]<a[j+1])
    		{
    			temp = a[j];
    			a[j] = a[j+1];
    			a[j+1]= temp;
    			swapped=true;
    		}
    	}
    	if(!swapped)
    	{
    		break;
    	}
    }
    for(Integer x: a)
    {
    	System.out.println(x+ "  ");
    }
	}

}
