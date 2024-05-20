package controller._2_Anonymous_Inner_Class.person_filter_app;

import java.util.ArrayList;
import java.util.List;


public class Person_Filter_App {

    public interface Filterable {
        boolean apply(Person person);
    }

    public List<Person> filter(List<Person> personList, Filterable filterable) {
        List<Person> filteredPersonList = new ArrayList<>();

        for(Person person: personList) {
            if (filterable.apply(person)) {
                filteredPersonList.add(person);
            }
        }
        return filteredPersonList;
    }

    public List<Person> personOlderThan30() {
        return filter(new Person().loadPersons(), new Filterable() {
            @Override
            public boolean apply(Person person) {
                return person.getAge() > 30;
            }
        });
    }
}
