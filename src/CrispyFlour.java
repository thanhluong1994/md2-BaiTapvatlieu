import java.time.LocalDate;

public class CrispyFlour extends Material{
    private int quantity;
public CrispyFlour(){
}
public CrispyFlour(String id, String name, LocalDate manufacturingDate, int cost, int quantity){
super(id,name, LocalDate.parse(manufacturingDate),cost);
this.quantity=quantity;
}

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public double getAmount() {
    double result=quantity*cost;
        return result;
    }

    @Override
    public LocalDate getExpiryDate() {
    LocalDate result=manufacturingDate.plusYears(1);
        return result;
    }
}
