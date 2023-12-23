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
    }

    public void subTotal(){
        total = quantity * product.price();
    }

    public Integer quantity() {
        return quantity;
    }

    public OrderItem setQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    public Product product() {
        return product;
    }

    public OrderItem setProduct(Product product) {
        this.product = product;
        return this;
    }
}
