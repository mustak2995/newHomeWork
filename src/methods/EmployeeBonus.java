package methods;

import java.util.Scanner;

class BonusCalculator
{
	public int calculate(int salary, int yearOfService)
	{
		int totalsalaryWithBonus=0;
		if(yearOfService>5)
			totalsalaryWithBonus=salary+(salary*35/100);
		
		else
			totalsalaryWithBonus=salary+(salary*15/100);
		
		return totalsalaryWithBonus;
	}
}
public class EmployeeBonus 
{
	public static void main(String []args)
	{
		BonusCalculator bonusCalculator = new BonusCalculator();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your salary");
		int salary = scanner.nextInt();
		System.out.println("Enter Year Of Service");
		int yearOfService = scanner.nextInt();
		int totalsalaryWithBonus = bonusCalculator.calculate(salary, yearOfService);
		System.out.println("your total Salary with Bonus is:-"+totalsalaryWithBonus);
	}
}