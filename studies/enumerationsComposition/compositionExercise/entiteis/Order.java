package enumerationsComposition.compositionExercise.entiteis;

import enumerationsComposition.firstEnum.entiteis.enums.OrderStatus;

import java.sql.Time;
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

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Override
    public String toString() {
        return "moment:" + moment + "\n" +
                "orderStatus:" + orderStatus + "\n" +
                "\n\torderItem:" + orderItem;
    }
}
