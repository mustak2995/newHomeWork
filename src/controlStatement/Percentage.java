package controlStatement;

import java.util.Scanner;

public class Percentage {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter percentage");
		int percent=sc.nextInt();
		if(percent<=100&&percent>=81)
		{
			System.out.println("Grade 'A' ");
		}
		else if(percent<=80&&percent>=71)
		{
			System.out.println("Grade 'B' ");
		}
		else if(percent<=70&&percent>=61)
		{
			System.out.println("Grade 'C' ");
		}
		else if(percent<=60&&percent>=51)
		{
			System.out.println("Grade 'D' ");
		}
		else if(percent<=50&&percent>=40)
		{
			System.out.println("Grade 'E' ");
		}
		else
		{
			System.out.println("Grade 'F' ");
		}

	}

}
