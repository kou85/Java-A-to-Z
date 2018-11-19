package ua.ikonovalov;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * @author Konovalov
 * @version 1
 * @since 14.11.18
 */
public class PhoneDictionaryTest {
    PhoneDictionary phones = new PhoneDictionary();

    @Before
    public void start() {
        phones.add(new Person("Василий", "Али", "88885647829", "Кутузовка"));
        phones.add(new Person("Иван", "Лебедев", "85387373783", "Смоленск"));
    }

    @Test
    public void whenFindByName() {
        List <Person> persons = phones.find("Василий");
        assertThat(persons.iterator().next().getSurname(), is("Али"));
    }

    @Test
    public void whenFindByLiterals() {
        List <Person> persons = phones.find("а");
        assertThat(persons.iterator().next().getSurname(), is("Али"));
    }
}
