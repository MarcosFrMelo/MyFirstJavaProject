package enumerationsComposition.compositionExercise.entities;

import enumerationsComposition.firstEnum.entiteis.enums.OrderStatus;

import java.time.LocalDateTime;

public class Order {
    private LocalDateTime moment;
    private OrderStatus orderStatus;
    private OrderItem orderItem;

    public Order(LocalDateTime moment, OrderItem orderItem, OrderStatus orderStatus) {
        this.moment = moment;
        this.orderItem = orderItem;
        this.orderStatus = orderStatus;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public OrderItem getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(OrderItem orderItem) {
        this.orderItem = orderItem;
    }

    @Override
    public String toString() {
        return "moment:" + moment + "\n" +
                "orderStatus:" + orderStatus + "\n" +
                "\n\torderItem:" + orderItem;
    }
}
