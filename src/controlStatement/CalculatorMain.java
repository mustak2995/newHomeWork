package controlStatement;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		int ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("Enter your choice");
		ch=sc.nextInt();
		int fno, sno;
		switch(ch)
		{
		case 1:
			Calculator cl=new Calculator();
			
			cl.add();
			
			System.out.println("Enter your choice again");
			ch=sc.nextInt();

		case 2:
			Calculator c2=new Calculator();
			c2.sub();
			System.out.println("Enter your choice again");
			ch=sc.nextInt();
			
		case 3:
			Calculator c3=new Calculator();
			c3.mul();
			System.out.println("Enter your choice again");
			ch=sc.nextInt();
			
		case 4:
			Calculator c4=new Calculator();
			c4.div();
			System.out.println("Enter your choice again");
			ch=sc.nextInt();
			
		default :
			System.out.println("invalid choice");
			break;
		}

	}

}

