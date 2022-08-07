package library.mini.project;

public class StudentVO {
	private int stdNo;
	private String stdName;
	private String stdMajor;
	private int stdAge;
	
	public StudentVO(int stdNo, String stdName, String stdMajor, int stdAge) {
		this.stdNo = stdNo;
		this.stdName = stdName;
		this.stdMajor = stdMajor;
		this.stdAge = stdAge;
	}

	public int getStdNo() {
		return stdNo;
	}

	public void setStdNo(int stdNo) {
		this.stdNo = stdNo;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public String getStdMajor() {
		return stdMajor;
	}

	public void setStdMajor(String stdMajor) {
		this.stdMajor = stdMajor;
	}

	public int getStdAge() {
		return stdAge;
	}

	public void setStdAge(int stdAge) {
		this.stdAge = stdAge;
	}	
}
