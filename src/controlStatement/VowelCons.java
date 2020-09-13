package controlStatement;
import java.util.Scanner;
public class VowelCons {

	public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter any character");
			char ch=sc.next().charAt(0);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			
			
					System.out.println(ch +" Character is vowel");
			
			else
			{
				System.out.println(ch +" character is Consonant");
			}

		
	//----------------------------------------------------------------------------------------
		
		Scanner scs=new Scanner(System.in);
		System.out.println("Enter any character");
		char ch1 = scs.next().charAt(0);
		 switch(ch1)
		 {
		 case 'a':
		 case 'A':
		 case 'e':
		 case 'E':	 
		 case 'i':
		 case 'I':
		 case 'o':
		 case 'O':
		 case 'u':
		 case 'U':
			 System.out.println(ch1+" character is vowel");
			 break;
		default :
			System.out.println(ch1+" character is consonant");
		 }
	}
	}

