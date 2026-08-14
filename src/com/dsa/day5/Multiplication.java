package com.dsa.day5;

import java.util.Scanner;

public class Multiplication {
   int a[][]=new int[3][3];
   int b[][]=new int[3][3];
   int c[][]=new int[3][3];
   int i,j,k;
   int sum=0;
   void set(Scanner sc)
   {
	   System.out.println("enter matrix element");
	   for(i=0; i<=2; i++)
	   {
		   for(j=0; j<=2; j++)
		   {
			   a[i][j]=sc.nextInt();
		   }
	   }
	   System.out.println("Enter second matrix:");
	    for(i=0; i<3; i++)
	    {
	        for(j=0; j<3; j++)
	        {
	            b[i][j] = sc.nextInt();
	        }
	    }
   }
   void multiply()
   {
	   for(i=0; i<=2; i++)
	   {
		   for(j=0; j<=2; j++)
		   {
			   sum=0;
			   for(k=0; k<=2; k++)
			   {
				   sum = sum + a[i][k] * b[k][j];
			   }
			   c[i][j]=sum;
		   }
	   
		   }
   }
   void display()
   {
	   System.out.println("Result:");
	   for(i=0; i<3; i++)
	   {
		   for(j=0; j<3; j++)
		   {
			   System.out.println(c[i][j]+ " ");
		   }
	   }
   }
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Multiplication ob=new Multiplication();
		ob.set(sc);
		ob.multiply();
		ob.display();
	}

}
