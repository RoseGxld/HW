package employees;

public abstract class Employee implements IPayable {
    private static int count = 0;
    private String firstName;
    private String lastName;
    private final String socialSecurityNumber;
    abstract double calculateEarnings();


    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        count++;

        System.out.printf("Constructed employee %s %s |  count=%d%n", firstName, lastName, count);
    }

    //getter but no setter
    public static int getCount() {
        return count;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLasstName() {
        return lastName;
    }

    public void setLasstName(String lasstName) {
        this.lastName = lasstName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
