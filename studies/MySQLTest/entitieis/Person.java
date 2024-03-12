package MySQLTest.entitieis;

public class Person {
    private String name;
    private Integer age;
    private Float height;
    private Float weight;
    private String sex;
    private String nacionality;

    public Person() {
    }

    public Person(String name, Integer age, Float height, String sex) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Float getHeight() {
        return height;
    }

    public String getSex() {
        return sex;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public String getNacionality() {
        return nacionality;
    }

    public void setNacionality(String nacionality) {
        this.nacionality = nacionality;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person" +
                "name: " + name +
                "age " + age +
                "height: " + height +
                "sex: " + sex +
                "Weight: " + weight;
    }
}
