package controlStatement;

import java.util.*;
public class UpperLower
{
	public static void main(String[] args)
	{
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any character");
		ch = sc.next().charAt(0);
		if(ch >= 65 && ch <= 90)
		{
			System.out.println("uppercase");
		}
		else if(ch >= 97 && ch <= 122) {
			System.out.println("Lowercase");}
		
		else if(ch >= 48 && ch <= 57) {
			System.out.println("numeric");}
		
		else
			System.out.println("Symbol");
	}
}
