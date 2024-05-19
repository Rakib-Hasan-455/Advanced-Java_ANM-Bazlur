package controller._2_Anonymous_Inner_Class.contact_filter_app;

import java.util.ArrayList;
import java.util.List;

public class ContactService {
    /**
     * code repeat bad practice
     * @param contacts
     * @return
     */
    public List<Contact> findContactAgedBetween18And25(List<Contact> contacts) {
        List<Contact> filteredContactList = new ArrayList<>();

        for(Contact contact: contacts) {
            if(18 >= contact.getAge() && contact.getAge() <= 25) {
                filteredContactList.add(contact);
            }
        }

        return filteredContactList;
    }

    /**
     * bad practice
     * @param contacts
     * @return
     */
    public List<Contact> findContactMaleAgedBetween18And25(List<Contact> contacts) {
        List<Contact> filteredContactList = new ArrayList<>();

        for(Contact contact: contacts) {
            if(18 >= contact.getAge() && contact.getAge() <= 25
            && contact.getGender() == Gender.MALE) {
                filteredContactList.add(contact);
            }
        }

        return filteredContactList;
    }

    /**
     * good practice
     * @param contacts
     * @return
     */
    public List<Contact> findContacts(List<Contact> contacts, ContactFilterCriteria criteria) {
        List<Contact> filteredContactList = new ArrayList<>();

        for(Contact contact: contacts) {
            if(criteria.match(contact)) {
                filteredContactList.add(contact);
            }
        }

        return filteredContactList;
    }


}
