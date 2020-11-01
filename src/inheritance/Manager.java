package inheritance;

public class Manager extends Worker {

	private String department;
	public void setDepartment(String department)
	{
		this.department=department;
	}
	public String getDepartment() {
		return department;
	}
}
