package enumerationsComposition.compositionExercise.entiteis;

public class Product {
    private String name;
    private Double price;

    public Product(){
    }
    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double price() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
