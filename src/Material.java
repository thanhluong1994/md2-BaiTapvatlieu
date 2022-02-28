import java.time.LocalDate;

public abstract class Material {
    String id;
    String name;
    LocalDate manufacturingDate;
    int cost;
    public Material() {
    }
    public Material(String id,String name,LocalDate manufacturingDate,int cost){
        this.id=id;
        this.name=name;
        this.cost=cost;
        this.manufacturingDate=manufacturingDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public LocalDate getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(LocalDate manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public abstract double getAmount();

    public abstract LocalDate getExpiryDate();
}

