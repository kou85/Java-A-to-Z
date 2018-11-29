package ua.ikonovalov.bank;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author ikonovalov
 * @since 9.11.18.
 * @version 1.0
 */
public class UserTest {

    User first = new User("Ivan", "12345678");
    User second = new User("Ivan", "12345678");
    User third = new User("Ivan", "1234567");
    User fourth = new User (null, "12345678");
    User fifth = new User ("Misha", "123");

    @Test
    public void whenTwoEqualsThenTrue() {
        assertThat(first.equals(second), is(true));
    }

    @Test
    public void whenTwoEqualsNameButNotPassportThenFalse() {
        assertThat(first.equals(third), is(false));
    }

    @Test
    public void whenOneOfTwoNullThenFalse() {
        assertThat(fourth.equals(first), is(false));
    }

    @Test
    public void whenThoEqualsThenTrue() {
        User second = fifth;
        assertThat(fifth.equals(second), is(true));
    }
}
