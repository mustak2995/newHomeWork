package controlStatement;

import java.util.Scanner;

public class NegOrPos {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number");
		int no=sc.nextInt();
		if(no>0)
		{
			System.out.println("Number is Positive");
		}
		else if(no<0)
		{
			System.out.println("Number is negative ");
		}
		else
		{
			System.out.println("Number is Zero");
		}

	}

}
