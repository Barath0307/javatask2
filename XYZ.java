package com.task2;

import java.util.Scanner;

public class XYZ {

	public static void main(String[] args) {
		int n;
		float t=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many Product : ");
		n=sc.nextInt();
		Product p1[]=new Product[n];
		for (int i=0; i<n;i++)
		{
			p1[i]=new Product();
			p1[i].accept();
		}
		for (int i=0; i<n;i++)
		{
			p1[i].display();
		}
		for (int i=0; i<n;i++)
		{
			t=t+p1[i].total;
			System.out.println("Total Amount : "+t);
		}
	}

}
