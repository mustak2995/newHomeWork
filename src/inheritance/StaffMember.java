package inheritance;

public class StaffMember extends Department {
	String memberName,memberQualification;

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberQualification() {
		return memberQualification;
	}

	public void setMemberQualification(String memberQualification) {
		this.memberQualification = memberQualification;
	}
	

}
