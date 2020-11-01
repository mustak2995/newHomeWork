package inheritance;
//hirearchical inheritance
public class Person {

	public static void main(String[] args) {
		
		Teacher te=new Teacher();
		te.setTeacherName("V.B.Kolte");
		te.setTeacherAddress("Jalgaon");
		te.setTeacherAge(35);
		te.setTeacherSal(35000);
		System.out.println("Teacher Name is : "+te.getTeacherName());
		System.out.println("Teacher Address is : "+te.getTeacherAddress());
		System.out.println("Teacher Age is : "+te.getTeacherAge());
		System.out.println("Teacher Salary is : "+te.getTeacherSal());
		System.out.println("----------------------------------");
		Student st=new Student();
		st.setStudAddress("Erandol");
		st.setStudMarks(89);
		st.setStudName("Rizwan");
		st.setStudRoll(12);
		System.out.println("Student Address is :"+st.getStudAddress());
		System.out.println("Student Marks is : "+st.getStudMarks());
		System.out.println("Student Name is : "+st.getStudName());
		System.out.println("Student Roll Number is : "+st.getStudRoll());
	}

}
