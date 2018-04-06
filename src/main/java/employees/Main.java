package employees;

public class Main {
    public static void main(String[] args) {

        Employee employee1 = new HourlyEmployee("Dwayne","Rose",
                "111-65-6544",11.50,56.5);



        Employee employee2 = new SalariedEmployee("Derrick","Jones","111-22-3333",300.0);


        Employee employee3 = new CommissionedEmployee("Erica","Saunders",
                "111-22-9999",450.0,50.0);


        Employee employee4 = new BasePlusCommissionEmployee("The","Goat",
                "111-22-9999",60.0,350.0,35.0);

        Employee[] staff = new Employee[]{employee1,employee2,employee3,employee4};

        for(Employee staffmember: staff){
            System.out.println(staffmember.calculateEarnings() + staffmember.setPaymentAmount()
            );
        }


    }
}
