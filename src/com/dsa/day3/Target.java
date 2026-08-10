//two sum array
package com.dsa.day3;

import java.util.Scanner;

public class Target {

	public static void main(String[] args) {
		int a[]= {1,2,3,7,8};
		int i,j,target;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value for target");
		target=sc.nextInt();
		boolean found=false;
		for(i=0; i<a.length; i++)
		{
		for(j=i+1; j<a.length; j++)
		{
			if(a[i]+a[j]==target)
			{
				System.out.println("index"+i+" and index"+j+" having element equal to target"+target);
				found=true;
				break;
			}
		}
			
		}
		if(!found)
		{
			System.out.println("no index found equal to element");
		}
	}

}
