package inheritance;

public class Test {

	public static void main(String[] args) {
		
		Department dp=new Department();
		dp.setDepartmentName("Computer");
		dp.setHODName("M.S.Tamboli");
		System.out.println("Department Name is :"+dp.getDepartmentName());
		System.out.println("HOD Name is :"+dp.getHODName());
		StaffMember st=new StaffMember();
		st.setMemberName("Anil");
		st.setMemberQualification("MBA");
		System.out.println("Staff Member Name is : "+st.getMemberName());
		System.out.println("Member Qualification is : "+st.getMemberQualification());
	}

}
