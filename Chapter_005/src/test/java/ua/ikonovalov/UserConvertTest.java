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
 */
public class UserConvertTest {
    private User userOne;
    private User userTwo;
    private User userThree;
    int userOneId = 0;
    String userOneName = "userOneName";
    String userOneCity = "userOneCity";
    int userTwoId = 1;
    String userTwoName = "userTwoName";
    String userTwoCity = "userTwoCity";
    int userThreeId = 2;
    String userThreeName = "userThreeName";
    String userThreeCity = "userThreeCity";
    private List<User> testListUser;
    private UserConvert testConvert;

    @Before
    public void infoTest() {
        userOne = new User(userOneId, userOneName, userOneCity);
        userTwo = new User(userTwoId, userTwoName, userTwoCity);
        userThree = new User(userThreeId, userThreeName, userThreeCity);
        testListUser = new ArrayList<>();
        testConvert = new UserConvert();

    }

    private HashMap<Integer, User> expectedResult() {
        HashMap<Integer, User> expectedHashMap = new HashMap<>();
        expectedHashMap.put(userOne.getId(), userOne);
        expectedHashMap.put(userTwo.getId(), userTwo);
        expectedHashMap.put(userThree.getId(), userThree);
        return expectedHashMap;

    }


    @Test
    public void userConvertToMap(){

        testListUser.add(userOne);
        testListUser.add(userTwo);
        testListUser.add(userThree);
        assertThat(expectedResult(), is(testConvert.process(testListUser)));


    }
    @Test
    public void userConvertTest1() {

        testListUser.add(userTwo);
        testListUser.add(userThree);
        assertThat(expectedResult().get(1), is (userTwo));
    }
}
