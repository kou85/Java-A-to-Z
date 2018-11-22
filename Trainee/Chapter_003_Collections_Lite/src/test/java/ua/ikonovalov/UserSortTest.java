package ua.ikonovalov;
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
    @Test
    public void whenInArrayListToSortTreeSet() {
        UserSort sort = new UserSort();
        List<User> user = new ArrayList<>();
        user.add(new User("Ivan", 22));
        user.add(new User("Dima", 54));
        user.add(new User("Petro", 17));
        user.add(new User("Inna", 21));

        List<User> expect = new ArrayList<>();
        expect.add(new User("Petro", 17));
        expect.add(new User("Inna", 21));
        expect.add(new User("Ivan", 22));
        expect.add(new User("Dima", 54));

        assertThat(sort.sort(user).toString(), is(expect.toString()));
    }

}
