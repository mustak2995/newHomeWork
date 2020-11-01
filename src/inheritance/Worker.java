package inheritance;

public class Worker {

	public static void main(String[] args) {
	
		Employee e1=new Employee();
		e1.setAddress("Erandol");
		e1.setAge(35);
		e1.setName("Jitu");
		e1.setPhoneNumber(0123456);
		e1.setSalary(12000);
		Manager d1=new Manager();
		d1.setDepartment("Computer");
		System.out.println("Name : "+e1.getName());
		System.out.println("Age : "+e1.getAge());
		System.out.println("Address : "+e1.getAddress());
		System.out.println("PhoneNumber : "+e1.getPhoneNumber());
		System.out.println("Salary : "+e1.getSalary());
		System.out.println("Department : "+d1.getDepartment());
	}

}
