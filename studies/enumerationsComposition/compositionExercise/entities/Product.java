package enumerationsComposition.compositionExercise.entities;

public class Product {
    private String productName;
    private Double price;
    public Product(String productName, Double price) {
        this.productName = productName;
        this.price = price;
    }

    public Double getPrice(){
        return this.price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;

    }


    @Override
    public String toString() {
        return  "product name:" + productName + '\n' +
                "price:" + price;
    }
}
