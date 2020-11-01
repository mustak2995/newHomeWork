package inheritance;

public class Rectangle extends Square {

	int length,breadth;

	
	public int  area(int breadth,int length) {
		
		int area=breadth*length;
		System.out.println("Area of Rectangle is : "+area);
		return area;
	}
}
