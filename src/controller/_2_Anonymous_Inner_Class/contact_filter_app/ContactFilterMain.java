package controller._2_Anonymous_Inner_Class.contact_filter_app;

import java.util.Arrays;
import java.util.List;

public class ContactFilterMain {
    public static void main(String[] args) {
        ContactService contactService = new ContactService();
        List<Contact> allContacts = new Contact().getContactList();
        List<Contact> contactAged20To35 = contactService.findContacts(allContacts, new ContactFilterCriteria() {
            @Override
            public boolean match(Contact contact) {
                return 20 >= contact.getAge() && contact.getAge() <= 35;
            }
        });

        System.out.println(Arrays.toString(contactAged20To35.toArray()));


        List<Contact> contactMaleAged20To35 = contactService.findContacts(allContacts, new ContactFilterCriteria() {
            @Override
            public boolean match(Contact contact) {
                return 20 >= contact.getAge() && contact.getAge() <= 35
                        && contact.getGender() == Gender.MALE;
            }
        });

        System.out.println(Arrays.toString(contactMaleAged20To35.toArray()));


        List<Contact> contactFemaleAged20To35 = contactService.findContacts(allContacts, (Contact contact) ->  {
                return 20 >= contact.getAge() && contact.getAge() <= 35
                        && contact.getGender() == Gender.FEMALE;
            });

        System.out.println(Arrays.toString(contactFemaleAged20To35.toArray()));

    }
}
