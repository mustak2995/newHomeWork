package numericAndStarPattern;

public class NumericPattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(j%2==0)
					System.out.print("0");
				else
					System.out.print("1");
			}
			System.out.println();
		}
	}

}/*

1
10
101
1010
10101

*/
