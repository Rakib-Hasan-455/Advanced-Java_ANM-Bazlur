package controller._2_Anonymous_Inner_Class.person_filter_app;

import java.util.ArrayList;
import java.util.List;

public class Person {
    String name;
    int age;
    String address;

    public Person() {
    }

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Person setAge(int age) {
        this.age = age;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public Person setAddress(String address) {
        this.address = address;
        return this;
    }

    public List<Person> loadPersons() {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Rakib", 30, "Baridhara"));
        personList.add(new Person("Bulbul", 40, "Jamuna"));
        personList.add(new Person("Shahriar", 40, "Kuril"));
        return personList;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
