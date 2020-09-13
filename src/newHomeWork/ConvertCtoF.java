package newHomeWork;

import java.util.Scanner;

public class ConvertCtoF {

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Temperature in celcius");
		int tempr=sc.nextInt();
        int far=tempr*(9/5)+32;
        System.out.println("Convert Temperature to Fahrenheit is = "+far+"F");
     
      System.out.println("Enter Temperature in Farhenheit");
	    far=sc.nextInt();
        tempr= (int) ((far-32)*.5556);
        System.out.println("Convert  Fahrenheit to Temperature is = "+tempr+"C");
	}

}
