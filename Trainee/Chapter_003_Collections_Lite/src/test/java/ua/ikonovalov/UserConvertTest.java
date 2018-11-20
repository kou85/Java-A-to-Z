package ua.ikonovalov;

import org.junit.Test;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * class UserConvertTest
 * @author ikonovalov
 * @since  20.11.18.
 * @version 1.0
 */
public class UserConvertTest {
    @Test
    public void whenArrayListConvertToMap() {
        UserConvert convert = new UserConvert();
        List<User> user = new ArrayList<>();
        user.add(new User(1, "Ivan", "Smolensk"));
        user.add(new User(2, "Dima", "Moskov"));
        user.add(new User(3, "Petro", "Krakov"));
        user.add(new User(4, "Inna", "Praga"));
        HashMap<Integer, User> result = convert.process(user);
        assertThat(result.get(1).getName(), is("Ivan"));
        assertThat(result.get(1).getCity(), is("Smolensk"));
        assertThat(result.get(3).getName(), is("Petro"));
        assertThat(result.get(4).getCity(), is("Praga"));


    }
}
