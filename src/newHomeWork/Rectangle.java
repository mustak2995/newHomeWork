package newHomeWork;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Length of Rectangle");
		int len=sc.nextInt();
		System.out.println("Enter the Width of Rectangle");
		int wd=sc.nextInt();
		float area,peri;
		area=len*wd;
		peri=2*(len+wd);
		
		System.out.println("Area of rectangle is "+area);
		System.out.println("perimeter of rectangle is "+peri);
	}

}