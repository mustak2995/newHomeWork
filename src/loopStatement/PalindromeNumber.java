package loopStatement;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Number");
		int no=sc.nextInt();
		int rev=0;
		int org=no;
		while(no!=0)
		{
			int rem=no%10;
			 rev=(rev*10)+rem;
			 no=no/10;
		}
		if(org==rev)
		{
			System.out.println("Number is Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}

	}

}
