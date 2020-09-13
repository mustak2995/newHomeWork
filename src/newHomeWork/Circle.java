package newHomeWork;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius of circle");
		int radius=sc.nextInt();
		float pi=3.14f,area, perimeter;
		area=(pi*radius*radius);
		perimeter=pi*radius;
		
		System.out.println("Area of circle is = "+area);
		System.out.println("Perimeter of circle is = "+perimeter);
	}

}
