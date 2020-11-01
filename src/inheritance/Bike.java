package inheritance;

public class Bike extends Vehicle {
	
	String vname,serviceStationName;
	int vModelNumber,price;
	
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}
	public String getServiceStationName() {
		return serviceStationName;
	}
	public void setServiceStationName(String serviceStationName) {
		this.serviceStationName = serviceStationName;
	}
	public int getvModelNumber() {
		return vModelNumber;
	}
	public void setvModelNumber(int vModelNumber) {
		this.vModelNumber = vModelNumber;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;}
	
	

}
