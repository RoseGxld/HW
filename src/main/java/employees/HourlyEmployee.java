package employees;

public class HourlyEmployee extends Employee implements IPayable{
    private double wage;
    private double hours;
    private HireDate hireDate;


    public HourlyEmployee(String firstName, String lastName, final String socialSecurityNumber,
                          double wage, double hours) {
        super(firstName, lastName, socialSecurityNumber);
        this.wage = wage;
        this.hours = hours;


    }

    public double getWage() {
        return wage;
    }

    public double getHours() {
        return hours;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    double calculateEarnings(){
        return wage * hours;
    }


    @Override
    public String toString() {
        return super.toString() + wage + hours;
    }

    @Override
    public double setPaymentAmount() {
        return 0;
    }
}

