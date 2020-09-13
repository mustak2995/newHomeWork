package controlStatement;
import java.util.Scanner;
public class MaximumNumber {

	public static void main(String[] args) {
			int no1,no2,no3,max;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enetr first number");
			no1=sc.nextInt();
			System.out.println("Enetr second  number");
			no2=sc.nextInt();
			System.out.println("Enetr third number");
			no3=sc.nextInt();
			
			if(no1>no2)
			{
				if(no1>no3)
				{
					max=no1;
					
				}
				else {
					max=no3;
				}
			}
			else {
				if(no2>no3)
				{
					max=no2;
					
				}
				else
				{
					max=no3;
				}
			}
			System.out.println("Maximum among all three numbers = "+max);
		}
			
		}

