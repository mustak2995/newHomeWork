package loopStatement;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
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
