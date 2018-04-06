package employees;

public class Invoice implements IPayable {

    private String partNumber;
    private String partDescription;
    private int Quantity;
    private double pricePerItem;

    public Invoice(String partDescription, String partNumber, int Quantity, double pricePerItem){
        this.partDescription = partDescription;
        this.partNumber = partNumber;
        this.Quantity = Quantity;
        this.pricePerItem = pricePerItem;
    }

    @Override
    public double setPaymentAmount() {
        return 0.0;
    }


}
