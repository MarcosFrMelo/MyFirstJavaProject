package enumerationsComposition.compositionExercise.entiteis;

public class OrderItem {
    private Integer quantity;
    private Product product;
    private Double total = (this.quantity * product().getPrice());
    public OrderItem(){
    }
    public OrderItem(Integer quantity, Product product) {
        this.quantity = quantity;
        this.product = product;
    }
    public void setTotal(int quantity){
        this.total = product.getPrice() * quantity;
    }
    public Product product() {
        return product;
    }

    @Override
    public String toString() {
        return "OrderItem:" + "\n" +
                "quantity:" + quantity + "\n" +
                "product:" + product + "\n" +
                "total:" + total;
    }
}
