package loopStatement;

import java.util.Scanner;

public class SumofDigits {

	public static void main(String[] args) {
		int sum=0,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		while(num !=0)
		{
		    sum=sum+num%10;
			num=num/10;
			 count=count+1;
		}
		System.out.println("Sum of all Digits are " +sum);
		System.out.println("Counts of all Digits are " +count);
	}

}
