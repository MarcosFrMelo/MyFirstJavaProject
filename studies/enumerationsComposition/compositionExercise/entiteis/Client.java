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
}
