package employees;

public class BasePlusCommissionEmployee extends CommissionedEmployee {

    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName,String socialSecurityNumber ,double commissionRate,double grossSales, double baseSalary){
        super(firstName,lastName,socialSecurityNumber,commissionRate,grossSales);
        this.baseSalary = baseSalary;


    }
    public double getBaseSalary(){
        return baseSalary;
    }

    @Override
    public double calculateEarnings(){
        return baseSalary + super.calculateEarnings();
    }

    @Override
    public String toString() {
        return super.toString() + "BasePlusCommissionEmployee{" +
                "baseSalary=" + baseSalary +
                '}';
    }
}
