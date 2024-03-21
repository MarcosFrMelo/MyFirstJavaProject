package dataBaseStudies.entiteis;

public class Person {
    private String name;
    private String nacionality;
    private Character sex;
    private Integer age;
    private Float height;
    private Float weight;

    public Person(String name, String nacionality, Character sex, Integer age, Float height, Float weight) {
        this.name = name;
        this.nacionality = nacionality;
        this.sex = sex;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNacionality() {
        return nacionality;
    }

    public void setNacionality(String nacionality) {
        this.nacionality = nacionality;
    }

    public Character getSex() {
        return sex;
    }

    public void setSex(Character sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Person" +
                "name: " + name + "\n" +
                "nacionality: " + nacionality + '\n' +
                "sex: " + sex + "\n" +
                "age: " + age + "\n" +
                "height: " + height + "\n" +
                "weight: " + weight + "\n";
    }
}
