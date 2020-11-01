package inheritance;
//hirearchical inheritance
public class Student extends Person {
	String studName ,studAddress;
	int studRoll,studMarks;
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public String getStudAddress() {
		return studAddress;
	}
	public void setStudAddress(String studAddress) {
		this.studAddress = studAddress;
	}
	public int getStudRoll() {
		return studRoll;
	}
	public void setStudRoll(int studRoll) {
		this.studRoll = studRoll;
	}
	public int getStudMarks() {
		return studMarks;
	}
	public void setStudMarks(int studMarks) {
		this.studMarks = studMarks;
	}

}
