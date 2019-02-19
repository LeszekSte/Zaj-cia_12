package Cwiczenie_2;

public class Product {

    private String firstName;
    private String lastName;
    private int age;
    private String pesel;

    public Product(String firstName, String lastName, int age, String pesel) {
        this(firstName, lastName, age);
        this.pesel = pesel;
    }

    public Product(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return firstName + ";"+ lastName + ";"+ age;

    }
}
