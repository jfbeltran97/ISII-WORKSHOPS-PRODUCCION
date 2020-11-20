package ec.edu.espol.workshops.second;

/**
 * This class is used to create a customer.
 * 
 * @author Ana Carrión
 *
 */
public class Customer {

    public static final int MAX_AGE = 80;
    public static final char MALE = 'M';
    public static final char FEMALE = 'F';

    private int age;
    private char sex;
    private boolean isMarried;
    private String license;

    public Customer(int age, char sex, boolean isMarried, String license) {
        this.setAge(age);
        this.setSex(sex);
        this.isMarried = isMarried;
        this.license = license;
    }

    public Customer(int age, char sex, boolean isMarried, String license, boolean throwExceptions)
            throws IllegalArgumentException {
        this(age, sex, isMarried, license);
        if ((age > MAX_AGE || !Validator.isLicenseValid(license)) && throwExceptions)
            throw new IllegalArgumentException("Customer data is not valid");
    }

    /**
     * Getter
     *
     * @return The age of the customer.
     */
    public int getAge() {
        return age;
    }

    /**
     * Setter
     *
     * @param age It is the age of the customer.
     */
    public void setAge(int age) {
        if (age > 0)
            this.age = age;
    }

    /**
     * Getter
     *
     * @return The sex of the customer.
     */
    public char getSex() {
        return sex;
    }

    /**
     * Setter
     *
     * @param sex It is the sex of the customer.
     */
    public void setSex(char sex) {
        char upperCaseSex = Character.toUpperCase(sex);
        if (upperCaseSex == MALE || upperCaseSex == FEMALE)
            this.sex = sex;
    }

    /**
     * Getter
     *
     * @return true if the customer is married, false otherwise.
     */
    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean isMarried) {
        this.isMarried = isMarried;
    }

    public boolean ageBetween(int lowerBound, int upperBound) {
        return this.age >= lowerBound && this.age < upperBound;
    }

    /**
     * Define what is the gender of the customer
     *
     * @return true if the customer is male, false otherwise.
     */
    public boolean isMale() {
        return this.sex == MALE;
    }

    /**
     * Define what is the gender of the customer
     *
     * @return true if the customer is female, false otherwise.
     */
    public boolean isFemale() {
        return this.sex == FEMALE;
    }

    /**
     * Check if the customer meets the requirements
     *
     * @return true if the customer meets the requirements, false otherwise.
     */
    public boolean isValid() {
        return (this.sex == MALE || this.sex == FEMALE) && this.age >= 18 && this.age <= MAX_AGE && Validator.isLicenseValid(this.license);
    }
}
