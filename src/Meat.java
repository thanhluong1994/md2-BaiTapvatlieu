import java.time.LocalDate;

public class Meat extends Material{
    private double weight;
    public Meat(String m1, String thit_ga, LocalDate localDate, int cost, int weight){
    }
    public Meat(String id, String name, String manufacturingDate, int cost, double weight){
        super(id,name, LocalDate.parse(manufacturingDate),cost);
        this.weight=weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getAmount() {
        double result=cost*weight;
        return result;
    }

    @Override
    public LocalDate getExpiryDate() {
        LocalDate result=manufacturingDate.minusDays(7);
        return result;
    }
}
