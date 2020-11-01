package inheritance;

public class Triangle extends Rectangle {

	int side1,side2,side3;

	
	public int  area(int side1,int side2,int side3) {
		int area=side1*side2*side3;
		System.out.println("Area of Triangle is : "+area);
		return area;
	}
}
