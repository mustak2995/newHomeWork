package newHomeWork;

import java.util.Scanner;

public class EquilateralTriangle {

	public static void main(String[] args) {
		
		int side;
		float area;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the side of Equilateral traiangle");
		side=sc.nextInt();
		area=(float) (((3*3.14)/4)*side*side);
		System.out.println("Area of Equilateral triangle is " +area);
	}

}
