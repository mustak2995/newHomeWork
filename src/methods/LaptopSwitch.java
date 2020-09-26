package methods;

import java.util.Scanner;
 class Operation{
	 public void add() {
		 Scanner sc=new Scanner (System.in);
		 System.out.println("Enter first number ");
		 int fno=sc.nextInt();
		 System.out.println("Enter Second number ");
		 int sno=sc.nextInt();
		 
		 int sum=fno+sno;
		 System.out.println("Addition of two numbers are : "+sum);
		 
		 input();
	 }
	 
	 public void sub() {
		 Scanner sc=new Scanner (System.in);
		 System.out.println("Enter first number ");
		 int fno=sc.nextInt();
		 System.out.println("Enter Second number ");
		 int sno=sc.nextInt();
		 
		 int sub=fno-sno;
		 System.out.println("Substraction of two numbers are : "+sub);
		 
		 input();
	 }
	 
	 public void mul() {
		 Scanner sc=new Scanner (System.in);
		 System.out.println("Enter first number ");
		 int fno=sc.nextInt();
		 System.out.println("Enter Second number ");
		 int sno=sc.nextInt();
		 
		 int mul=fno*sno;
		 System.out.println("Multiplication of two numbers are : "+mul);
		 
		 input();
	 }
	 public void exit()
	 {
		 System.exit(0);
	 }
	 public void input()
	 {   
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter Any Option : ");
		 
		 System.out.println("1.Add");
		 System.out.println("2.Sub");
		 System.out.println("3.Mul");
		 System.out.println("4.Quit");
		 int opti =sc.nextInt();
		 
		 switch(opti)
		 {
		 case 1:  add();
		 case 2:  sub();
		 case 3:  mul();
		 case 4:  exit();
		 default :
			 System.out.println("Invalid chioce ");
			      
		 }
	  }

	
 }

public class LaptopSwitch {

	public static void main(String[] args) {
		
		System.out.println("WELCOME");
		Scanner sc=new Scanner (System.in);
		
		 Operation op1=new Operation();
		 op1.input();

	}

}
