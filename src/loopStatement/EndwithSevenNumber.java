package loopStatement;

import java.util.Scanner;

public class EndwithSevenNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter source number");
		int src=sc.nextInt();
		System.out.println("Enter Destination  number");
		int des=sc.nextInt();
		for(int i=src;i<=des;i++)
		{
			if(i%10==7)
			{
				System.out.println("End with seven number is "+i);
			}
		}

	}

}
