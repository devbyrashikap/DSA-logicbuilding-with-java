package com.dsa.day4;

import java.util.Scanner;

public class AddMatrix {
	 int a[][]=new int[2][3];
     int b[][]=new int[2][3];
     int c[][]=new int[2][3];
     int i,j;
void set(Scanner sc)
{
	System.out.println("Enter the value of matrix A");
	for(i=0; i<2; i++)
	{
		for(j=0; j<3; j++)
		{
			a[i][j]=sc.nextInt();
		}
	}
	System.out.println("Enter the value of matrix B");
	for(i=0; i<2 ;i++)
	{
		for(j=0; j<3; j++)
		{
			b[i][j]=sc.nextInt();
			
		}
	}
}
void show()
{
	System.out.println("the matrix A element");
	for(i=0; i<2; i++)
	{
		for(j=0; j<3; j++)
		{
			System.out.println(a[i][j]+"\t");
		}
		System.out.println();
	}
	System.out.println("the  matrix B element");
	for(i=0; i<2; i++);
	{
		for(j=0; j<3; j++)
		{
			System.out.println(b[i][j]+"\t");
		}
		System.out.println();
	}
	System.out.println("sum of two matrix");
	for(i=0; i<2; i++);
	{
		for(j=0; j<3; j++)
		{
			c[i][j]=a[i][j]+b[i][j];
			System.out.println(c[i][j]+"\t");
		}
		System.out.println();
}
}
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    AddMatrix ob=new  AddMatrix();
    ob.set(sc);
    ob.show();
    
	}

}
