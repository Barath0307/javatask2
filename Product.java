package com.task2;

import java.util.Scanner;

public class Product {
	String productname;
	int pid, quantity;
	float price, total;
	void accept()
	{
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the Product Name : ");
			productname=sc.next();
			System.out.println("Enter pid : ");
			pid=sc.nextInt();
			System.out.println("Enter quantity : ");
			quantity=sc.nextInt();
			System.out.println("Enter price : ");
			price=sc.nextFloat();
		}catch(Exception e) {}
		}
	void display()
{
		total= price*quantity;
		System.out.println("Productname : "+productname+"\npid : "+pid+"\nquantity : "+quantity+"\nprice : "+price+"\nTotal Amount : "+total);;
		}
}