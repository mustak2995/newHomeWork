package loopStatement;

import java.util.Scanner;

public class MenuDemo {

	public static void main(String[] args) {

		System.out.println("Enter your choice");
		System.out.println("1. All Prime Number");
		System.out.println("2. Even or Odd Number");
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		switch(num)
		{
		 case 1:
			  MenuPrimeEvenOdd mpe1=new MenuPrimeEvenOdd();
			  mpe1.evenOdd();
			  System.out.println("Again Enter your choice");
				 num=sc.nextInt();
		case 2:
			  MenuPrimeEvenOdd mpe=new MenuPrimeEvenOdd();
			  mpe.prime();
			  System.out.println("Again Enter your choice");
				 num=sc.nextInt();
			  
		  
		default:
			System.out.println("Invalid choice");
		}

	}

}
