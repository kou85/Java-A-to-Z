package ua.ikonovalov;

import org.junit.Before;
import org.junit.Test;

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


    @Before
    public void infoTest() {
        userOne = new User(userOneId, userOneName, userOneCity);
        userTwo = new User(userTwoId, userTwoName, userTwoCity);
        userThree = new User(userThreeId, userThreeName, userThreeCity);

    }
    @Test
    public void userConvertToMap(){

        UserConvert user = new UserConvert();

    }
}
