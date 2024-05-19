package controller._2_Anonymous_Inner_Class.contact_filter_app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Contact {

    private String name;
    private String email;
    private int age;
    private Gender gender;

    public Contact(String name, String email, int age, Gender gender) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.gender = gender;
    }

    public Contact() {
    }

    public String getName() {
        return name;
    }

    public Contact setName(String name) {
        this.name = name;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Contact setEmail(String email) {
        this.email = email;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Contact setAge(int age) {
        this.age = age;
        return this;
    }

    public Gender getGender() {
        return gender;
    }

    public Contact setGender(Gender gender) {
        this.gender = gender;
        return this;
    }

    public List<Contact> getContactList() {
        List<Contact> contacts = new ArrayList<>();
        Random random = new Random();
        String[] names = { "Alice", "Bob", "Charlie", "David", "Eve", "Frank", "Grace", "Henry", "Ivy", "Jack" };
        String[] emails = { "alice@example.com", "bob@example.com", "charlie@example.com", "david@example.com", "eve@example.com", "frank@example.com", "grace@example.com", "henry@example.com", "ivy@example.com", "jack@example.com" };

        for (int i = 0; i < 10; i++) {
            String name = names[random.nextInt(names.length)];
            String email = emails[random.nextInt(emails.length)];
            int age = random.nextInt(50) + 15; // Random age between 20 and 69
            Gender gender = random.nextBoolean() ? Gender.MALE : Gender.FEMALE;
            contacts.add(new Contact(name, email, age, gender));
        }

        return contacts;
    }

    List<Contact> generateContactList() {
        return Arrays.asList(new Contact("Will Smith", "A@gmail.com", 40, Gender.MALE),
                new Contact("Ellen", "A@gmail.com", 30, Gender.FEMALE),
                new Contact("Nuhash Smith", "Asd@gmail.com", 45, Gender.MALE),
                new Contact("Dalia", "Asd@gmail.com", 25, Gender.FEMALE));
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
