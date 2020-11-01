package inheritance;
//hirearchical inheritance
public class Teacher extends Person {
	String teacherName,teacherAddress;
	int teacherAge,teacherSal;
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public String getTeacherAddress() {
		return teacherAddress;
	}
	public void setTeacherAddress(String teacherAddress) {
		this.teacherAddress = teacherAddress;
	}
	public int getTeacherAge() {
		return teacherAge;
	}
	public void setTeacherAge(int teacherAge) {
		this.teacherAge = teacherAge;
	}
	public int getTeacherSal() {
		return teacherSal;
	}
	public void setTeacherSal(int teacherSal) {
		this.teacherSal = teacherSal;
	}

}
