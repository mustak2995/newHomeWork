package loopStatement;

public class DifferentLoop {

	public static void main(String[] args) {
		
		int i;
		for(i=1;i<=10;i++)
		{
			System.out.print(" "+i);
		}
		System.out.println("\n---------------------FOR---------------------------");
		
		int j=1;
		while(j<=10)
		{
			System.out.print(" "+j);
			j++;
		}
		System.out.println("\n------------------WHILE------------------------------");
		int k=1;
		do
		{
			System.out.print(" "+k);
			k++;
		}
		while(k<=10);
		System.out.println("\n-------------------DO-WHILE--------------------------");
	}

}
