package enumerationsComposition.firstEnum.entities;

import java.time.LocalDateTime;

import enumerationsComposition.compositionExercise.entities.OrderItem;
import enumerationsComposition.firstEnum.entities.enums.OrderStatus;

public class Order {

    private Integer id;
    private LocalDateTime moment;
    private OrderStatus status;
    private OrderItem orderItem;

    public Order() {
    }

    public Order(LocalDateTime moment, OrderStatus status, OrderItem orderItem) {
        this.moment = moment;
        this.status = status;
        this.orderItem = orderItem;
    }

    public Order(Integer id, LocalDateTime moment, OrderStatus status) {
        this.id = id;
        this.moment = moment;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime newPurchaseMoment) {
        this.moment = newPurchaseMoment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public String toString() {
        return "Order [id=" + id + ", moment=" + moment + ", status=" + status + "]";
    }

    public OrderItem getOrderItem() {
        return orderItem;
    }

    public OrderStatus getOrderStatus() {
        return status;
    }
}