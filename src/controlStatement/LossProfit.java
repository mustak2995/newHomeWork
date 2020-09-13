package controlStatement;
import java.util.Scanner;
public class LossProfit {

	public static void main(String[] args) {
			
			int purchase, selling, profit;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter purchase amount");
			purchase=sc.nextInt();
			System.out.println("Enter selling amount");
			selling =sc.nextInt();
			
			if(purchase<selling)
			{
				System.out.println("Profit");
			}
			else if(purchase>selling)
			{
				System.out.println("Loss");
			}
			else
			{
				System.out.println("Neither loss nor Profit");
			}
		}

	}