package enumerationsComposition.compositionExercise.entiteis;

public class Product {
    private String productName;
    private Double price;

    public Double getPrice(){
        return this.price;
    }

    public Product(String productName, Double price) {
        this.productName = productName;
        this.price = price;
    }

    @Override
    public String toString() {
        return  "product name:" + productName + '\n' +
                "price:" + price;
    }
}
