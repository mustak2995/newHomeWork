package newHomeWork;

import java.util.Scanner;

public class AddSubMulDivRem {

	public static void main(String[] args) {
		
		int firstno,secondno,sum,sub,mul,div,rem;
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter first no.");
		firstno=sc.nextInt();
		System.out.println("Enter second no.");
		secondno=sc.nextInt();
		
		sum=firstno+secondno;
		sub=firstno-secondno;
		mul=firstno*secondno;
		div=firstno/secondno;
		rem=firstno%secondno;
		
		System.out.println("Addition of first and second no. is "+ sum);
		System.out.println("Substraction of first and second no. is "+ sub);
		System.out.println("Multiplication of first and second no. is "+ mul);
		System.out.println("Division of first and second no. is "+ div);
		System.out.println("Remainder of first and second no. is "+ rem);
	}

}
