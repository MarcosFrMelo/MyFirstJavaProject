package enumerationsComposition.compositionExercise.entities;

import enumerationsComposition.compositionExercise.entities.Order;

import java.time.LocalDate;

public class Client {
    private String name;
    private String email;
    private LocalDate birthDate;
    private Order order;

    public Client() {
    }

    public Client(Order order) {
        this.order = order;
    }

    public Client(String name, String email, LocalDate birthDate) {
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
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
    public void removeOrder(){
        order = null;
    }
}
