package javaOopStudies.employeeSalary.entitieis;

import java.text.DecimalFormat;

public class Employees {
    private float salary;
    private String name;
    private int id;

    public Employees() {
    }

    public Employees(float salary, String name, int id) {
        this.salary = salary;
        this.name = name;
        this.id = id;
    }

    public void increaseSalary(double percent) {
        salary = (float) (salary + ((salary * percent) / 100));
    }

    public void decreaseSalary(double percent) {
        salary = (float) (salary - ((salary * percent) / 100));
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {

        return  "<----------------------->\n" +
                "name:" + name + "\n" +
                "id:" + id + "\n" +
                "salary:R$:" + salary + "\n" +
                "<----------------------->\n";
    }
}