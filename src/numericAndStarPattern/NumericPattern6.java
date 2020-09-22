package numericAndStarPattern;

public class NumericPattern6 {
	public static void main(String []args) {
	
	for(int i=1;i<=4;i++)
	{
		for(int k=i;k>=1;k--)
		{
			System.out.print(k+ " ");
		}
		
		for(int l=2;l<=i;l++)
		{
			System.out.print(l+ " ");
		}
		System.out.println();
	}
	
  }

}/*
1 
2 1 2 
3 2 1 2 3 
4 3 2 1 2 3 4 
*/
