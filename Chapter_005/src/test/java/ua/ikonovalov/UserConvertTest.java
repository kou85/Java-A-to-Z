package ua.ikonovalov;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Strong on 08.06.17.
 *
 */
public class UserConvertTest {

    private List<User> testListUser;
    private UserConvert testConvert;

    @Before
    public void infoTest() {
        User userOne = new User(0, "userOneName", "userOneCity");
        User userTwo = new User(2, "userTwoName", "userTwoCity");
        User userThree = new User(3, "userThreeName", "userThreeCity");
        testListUser = new ArrayList<>();
        testConvert = new UserConvert();

    }

    private HashMap<Integer, User> expectedResult() {
        User userOne = new User(0, "userOneName", "userOneCity");
        HashMap<Integer, User> expectedHashMap = new HashMap<>();
        expectedHashMap.put(userOne.getId(), userOne);
        return expectedHashMap;
    }


    @Test
    public void userConvertToMap(){

        User userOne = new User(0, "userOneName", "userOneCity");
        User userTwo = new User(2, "userTwoName", "userTwoCity");
        List <User> testListUser = new ArrayList<>();
        testListUser.add(userOne);
        testListUser.add(userTwo);

        assertThat(expectedResult(), is(testConvert.process(testListUser)));


    }
    @Test
    public void userConvertToMap1() {

        User userTwo = new User(2, "userTwoName", "userTwoCity");
        User userThree = new User(3, "userThreeName", "userThreeCity");
        List <User> testListUser = new ArrayList<>();
        testListUser.add(userTwo);
        testListUser.add(userThree);
        assertThat(testListUser.get(0), is (userTwo));
    }
}
