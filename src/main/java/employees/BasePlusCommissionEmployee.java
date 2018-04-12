package employees;

import java.util.Date;

public class BasePlusCommissionEmployee extends CommissionedEmployee implements IPayable {

    private double baseSalary;


    public BasePlusCommissionEmployee(String firstName, String lastName,String socialSecurityNumber
            ,double baseSalary){
        super(firstName,lastName,socialSecurityNumber,baseSalary);
        this.baseSalary = baseSalary;



    }
    public double getBaseSalary(){
        return baseSalary;
    }

    @Override
    double calculateEarnings(){
        return baseSalary + super.calculateEarnings();
    }

    @Override
    public String toString() {
        return super.toString() + "BasePlusCommissionEmployee{" +
                "baseSalary=" + baseSalary +
                '}';
    }
}
