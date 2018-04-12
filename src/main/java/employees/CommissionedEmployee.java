package employees;

import java.util.Date;

public class CommissionedEmployee extends Employee implements IPayable {

    private double grossSales;
    private double commissionRate;


    public CommissionedEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales){
        super(firstName, lastName, socialSecurityNumber);
        this.commissionRate = commissionRate;
        this.grossSales = grossSales;

    }

    @Override
    double calculateEarnings(){
        return commissionRate/100 * grossSales;
    }

    @Override
    public String toString() {
        return super.toString() + "CommissionedEmployee{" +
                "grossSales=" + grossSales +
                ", commissionRate=" + commissionRate +
                '}';
    }

    @Override
    public double setPaymentAmount() {
        return 0;
    }
}



