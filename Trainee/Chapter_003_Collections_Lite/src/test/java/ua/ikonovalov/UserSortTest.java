package ua.ikonovalov;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Set;
import java.util.List;
import java.util.TreeSet;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * class UserSortTest
 * @author ikonovalov
 * @since  22.11.18.
 * @version 1.0
 */
public class UserSortTest {

    private final UserSort sort = new UserSort();
    private final List<User> user = new ArrayList<>();
    private final List<User> expect = new ArrayList<>();

    @Before
    public void inputAndExpectUsers() {
        user.add(new User("Ivanna", 22));
        user.add(new User("Dmitriy", 54));
        user.add(new User("Petro", 17));
        user.add(new User("Inna", 21));

    }

    /**
     * Method add users to ArrayList converts to Set and sorts Age
     */
    @Test
    public void whenInArrayListToSortAgeTreeSet() {
        expect.add(new User("Petro", 17));
        expect.add(new User("Inna", 21));
        expect.add(new User("Ivanna", 22));
        expect.add(new User("Dmitriy", 54));

        assertThat(sort.sort(user).toString(), is(expect.toString()));
    }

    /**
     * Method add users to ArrayList and sorts the length of the name
     */
    @Test
    public void whenInArrayListToSortNameForLength() {
        expect.add(new User("Inna", 21));
        expect.add(new User("Petro", 17));
        expect.add(new User("Ivanna", 22));
        expect.add(new User("Dmitriy", 54));

        assertThat(sort.sortNameLength(user).toString(), is(expect.toString()));
    }

    /**
     * Method add users to ArrayList and sorts the name and after the Age
     */
    @Test
    public void whenInArrayListToSortNameAndAge() {
        user.add(new User("Dmitriy", 15));

        expect.add(new User("Dmitriy", 15));
        expect.add(new User("Dmitriy", 54));
        expect.add(new User("Inna", 21));
        expect.add(new User("Ivanna", 22));
        expect.add(new User("Petro", 17));
        assertThat(sort.sortByAllFields(user).toString(), is(expect.toString()));
    }

}
