package enumerationsComposition.compositionExercise.entiteis;

public class OrderItem {
    private Integer quantity;
    private Product product;
    private Double total = product().getPrice() * quantity;
    public OrderItem(){
    }
    public OrderItem(Integer quantity, Product product) {
        this.quantity = quantity;
        this.product = product;
        this.total = product().getPrice() * quantity;
    }
    public Product product() {
        return product;
    }

    public Integer quantity() {
        return quantity;
    }

    public OrderItem setQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "quantity:" + quantity + "\n" +
                "total:" + total + "\n" +
                "\n\tproduct:" + product;
    }
}
