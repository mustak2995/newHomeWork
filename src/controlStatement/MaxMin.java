package controlStatement;

import java.util.Scanner;

public class MaxMin {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first no.");
		int first=sc.nextInt();
		System.out.println("Enter second no.");
		int second=sc.nextInt();
		if(first>second)
		{
			System.out.println("First number is maximum");
		}
		else
		{
			System.out.println("Second number is Maximum");
		}
	}

}
