package enumerationsComposition.compositionExercise.entiteis;

public class OrderItem {
    private Integer quantity;
    private Product product;
    private Double total;
    public OrderItem(){
    }
    public OrderItem(Integer quantity, Product product) {
        this.quantity = quantity;
        this.product = product;
        this.total = product.getPrice() * quantity;
    }
    public Product product() {
        return product;
    }

    @Override
    public String toString() {
        return "quantity:" + quantity + "\n" +
                "total:" + total + "\n" +
                "\n\tproduct:" + product;
    }
}
