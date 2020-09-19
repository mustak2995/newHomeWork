package loopStatement;

import java.util.Scanner;

public class TableOfNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter of any Number ");
		int num=sc.nextInt();
		System.out.println("Table of given number is ");
		for(int i=1;i<=10;i++)
		{
			System.out.println(" "+ num*i);
		}

	}

}
