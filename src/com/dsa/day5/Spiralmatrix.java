package com.dsa.day5;

public class Spiralmatrix {

	public static void main(String[] args) {
    int a[][]= { {1,2,3} , {4,5,6} ,{7,8,9} };
    int top=0, bottom=a.length-1;
    int left=0, right=a.length-1;
    int i,j;
    while(top<=bottom && left<=right)
    {
    	for(j=left; j<=right; j++)
    	{
    		System.out.println(a[top][j]);
    	}
    	top++;
    	for(i=top; i<=bottom; i++)
    	{
    		System.out.println(a[i][right]);
    		right--;
    		if(top<=bottom)
    		{
    		for(j=right; j>=left; j--)
    		{
    			System.out.println(a[bottom][j]);
    		}
    		bottom--;
    		}
    		if(left<=right)
    		{
    			for(i=bottom; i>=top; i--)
    			{
    				System.out.println(a[i][left]);
    			}
    			left++;
    		}
    		}
    	}
    }
	}


