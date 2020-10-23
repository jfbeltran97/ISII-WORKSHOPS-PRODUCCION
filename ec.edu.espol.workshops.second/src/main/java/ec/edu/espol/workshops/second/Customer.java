package ec.edu.espol.workshops.second;

public class Customer {
	public static final char MALE = 'M';
	public static final char FEMALE = 'F';
	public static final int MAX_AGE = 80;

	private int age;
	private char sex;
	private boolean isMarried;
	private String license;
	
	public Customer(int age, char sex, boolean isMarried, String license) throws Exception {
		if (age > MAX_AGE || !Validator.isLicenseValid(license))
			throw new Exception("Customer data is not valid");
		this.age  = age;
		this.sex = sex;
		this.isMarried = isMarried;
		this.license = license;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 0) this.age = age;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		char upperCaseSex = Character.toUpperCase(sex);
		if (upperCaseSex == MALE || upperCaseSex == FEMALE)
			this.sex = sex;
	}

	public boolean isMarried() {
		return isMarried;
	}

	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}
	
	public boolean ageBetween(int lowerBound, int upperBound) {
		return this.age >= lowerBound && this.age < upperBound;
	}
	
	public boolean isMale() {
		return this.sex == MALE;
	}
	
	public boolean isFemale() {
		return this.sex == FEMALE;
	}
	
	public boolean isValid() {
		return this.age <= MAX_AGE && Validator.isLicenseValid(this.license);
	}
	
}
