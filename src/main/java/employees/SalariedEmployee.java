package employees;

public class SalariedEmployee extends Employee implements IPayable {

    private double weeklySalary;
    private HireDate hireDate;


    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);
        this.weeklySalary = weeklySalary;


    }

    public double getWeeklySalary() {
        return weeklySalary;

    }
    @Override
    double calculateEarnings(){
        return weeklySalary;
    }

    @Override
    public String toString() {
        return super.toString() + weeklySalary;
    }

    @Override
    public double setPaymentAmount() {
        return 0;
    }
}