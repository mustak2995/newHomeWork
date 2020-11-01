package inheritance;

public class Vehicle {

	public static void main(String[] args) {
		
		int discount=35;
		Bike b1=new Bike();
		b1.setVname("Splendar");
		b1.setServiceStationName("Jalgaon");
		b1.setvModelNumber(123);
		b1.setPrice(230000);
		
		        System.out.println("Vehicle Name : "+b1.getVname());
			    System.out.println("Service Station Name : "+b1.getServiceStationName());
				System.out.println("Model Number : "+b1.getvModelNumber());
				System.out.println("Vehicle Price : "+b1.getPrice());
				System.out.println("Discount on vehicle is : "+discount+"%");
				
				
	 

	}

	

}
