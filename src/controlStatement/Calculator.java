package controlStatement;

import java.util.Scanner;

public class Calculator {
	
	public void add() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number");
		int fno=sc.nextInt();
		System.out.println("Enter Second Number");
		int sno=sc.nextInt();
		int sum=fno+sno;
		System.out.println("Addition of First and Second number is "+sum);
		
	}


	public void sub() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number");
		int fno=sc.nextInt();
		System.out.println("Enter Second Number");
		int sno=sc.nextInt();
		int sub=fno-sno;
		System.out.println("Substraction of First and Second number is "+sub);
		
		
	}


	public void mul() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number");
		int fno=sc.nextInt();
		System.out.println("Enter Second Number");
		int sno=sc.nextInt();
		int mul=fno*sno;
		System.out.println("Multiplication of First and Second number is "+mul);
		
	}



	public void div() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number");
		int fno=sc.nextInt();
		System.out.println("Enter Second Number");
		int sno=sc.nextInt();
		int div=fno/sno;
		System.out.println("Division of First and Second number is "+div);
		
		
	}

}

