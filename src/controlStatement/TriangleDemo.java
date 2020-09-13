package controlStatement;
import java.util.Scanner;
public class TriangleDemo {

	public static void main(String[] args) {
			int side1,side2,side3;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter first side of triangle");
			side1=sc.nextInt();
			System.out.println("Enter Second side of triangle");
			side2=sc.nextInt();
			System.out.println("Enter Third side of triangle");
			side3=sc.nextInt();
			
			if(side1==side2&&side2==side3&&side3==side1)
			{
				System.out.println("Triangle is Equilateral");
			}
			else if(side1==side2||side2==side3||side1==side3)
			{
				System.out.println("Triangle is Isosceles");
			}
			else {
				System.out.println("Triangle is Scalene");
			}
		}

	}
