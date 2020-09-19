package loopStatement;

import java.util.Scanner;

public class MenuPrimeEvenOdd {
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	public void prime()
	{
		boolean flag=false;
		for(int i=1;i<=num/2;i++)
		{
			if(num%i==0)
			{
				flag=true;
				
			}
		}
		if(!flag)
		
			System.out.println(num + " is a Prime Number ");
		else
			System.out.println(num + " is not a Prime Number");

	}
		


	public void evenOdd()
	{ 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Source  number ");
		int src=sc.nextInt();
		System.out.println("Enter Destination  number ");
		int des=sc.nextInt();
		for(int i=src;i<=des;i++)
		{
			
			if(i%2==0)
			{
				System.out.print(i+ " is Even ");
			}
			else
			{
				System.out.println(i+ " is odd ");
			}
		}
}
}
