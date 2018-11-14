package ua.ikonovalov;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Strong on 14.11.18.
 */
public class PhoneDictionary {
    private List<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */
    public List<Person> find(String key) {
        List<Person> result = new ArrayList<>();
        for (Person value : persons) {
            if (value.getName().contains(key) || value.getSurname().contains(key) || value.getAddress().contains(key) || value.getPhone().contains(key)) {
                result.add(value);
            }  value = null;
        }
        return result;
    }
}
