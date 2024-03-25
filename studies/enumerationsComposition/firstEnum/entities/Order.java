package enumerationsComposition.firstEnum.entities;

import java.time.LocalDateTime;
import java.util.Date;

import enumerationsComposition.compositionExercise.entities.OrderItem;
import enumerationsComposition.firstEnum.entities.enums.OrderStatus;

public class Order {

    private Integer id;
    private Date moment;
    private OrderStatus status;
    private OrderItem orderItem;

    public Order() {
    }

    public Order(Integer id, Date moment, OrderStatus status) {
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

    public Date getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
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

    public String getOrderStatus() {
    }
}