package enumerationsComposition.compositionExercise.entiteis;

import java.sql.Time;
import java.time.LocalDate;

public class Client {
    private String name;
    private String email;
    private LocalDate birthDate;
    private Order order;

    public Client() {
    }

    public Client(String name, String email, LocalDate birthDate) {
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Client:" + "\n" +
                "name:" + name + "\n" +
                "email:" + email + "\n" +
                "birthDate:" + birthDate + "\n";
    }

    public String toStingTwo(){
        return "\n\torder:" + order + "\n";
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
