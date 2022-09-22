package col3;

public class Students {
	private String name;
	private int regno;
	private boolean isMale;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRegno() {
		return regno;
	}
	public void setRegno(int regno) {
		this.regno = regno;
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
	public Students(String name, int regno, boolean isMale, int age) {
		super();
		this.name = name;
		this.regno = regno;
		this.isMale = isMale;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Students [name=" + name + ", regno=" + regno + ", isMale=" + isMale + ", age=" + age + "]";
	}
	

}
