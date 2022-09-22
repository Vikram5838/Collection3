package col3;

public class Employee {
	private String name;
	private int regNo;
	private boolean isMale;
	private int age;
	private String designation;
	
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRegNo() {
		return regNo;
	}
	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}
	public boolean isMale() {
		return isMale;
	}
	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Employee(String name, int regNo, boolean isMale, int age, String designation) {
		super();
		this.name = name;
		this.regNo = regNo;
		this.isMale = isMale;
		this.age = age;
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", regNo=" + regNo + ", isMale=" + isMale + ", age=" + age + ", designation="
				+ designation + "]";
	}
	

}
