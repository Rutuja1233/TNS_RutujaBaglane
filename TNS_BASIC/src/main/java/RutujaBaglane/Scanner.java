package RutujaBaglane;


public class Scanner {
	private String name;
	private int income;
	private String gender;
	private int age;
	private int tax;
	public String getName() {
		return name;
	}
	public void setName(String name) {                   //getter and setter
		this.name = name;
	}
	public int getIncome() {
		return income;
	}
	public void setIncome(int income) {
		this.income = income;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getTax() {
		return tax;
	}
	public void setTax(int tax) {
		this.tax = tax;
	}

	@Override
	public String toString() {
		return "Scanner [name=" + name + ", income=" + income + ", gender=" + gender + ", age=" + age + ", tax=" + tax
				+ "]";
	}                                                          //generate string from source
		
	}
	


