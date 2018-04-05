package employees;

public class CommissionedEmployee extends Employee {

    private double grossSales;
    private double commissionRate;

    public CommissionedEmployee(String firstName,String lastName, String socialSecurityNumber, double grossSales, double commissionRate){
        super(firstName,lastName,socialSecurityNumber);
        this.commissionRate = commissionRate;
        this.grossSales = grossSales;
    }
    @Override
    public double calculateEarnings(){
        return commissionRate/100 * grossSales;
    }

    @Override
    public String toString() {
        return super.toString() + "CommissionedEmployee{" +
                "grossSales=" + grossSales +
                ", commissionRate=" + commissionRate +
                '}';
    }
}



