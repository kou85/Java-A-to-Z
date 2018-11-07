package ua.ikonovalov;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;


/**
 * Created by Ivan on 03.08.18.
 */
public class TurnArrayTest {

    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        TurnArray turnArray = new TurnArray();
        int[] input = new int[] {2, 4, 6, 8};
        int[] result = turnArray.turn(input);
        int[] expect = new int[] {8, 6, 4, 2};
        assertThat(result, is(expect));
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        TurnArray turnArray = new TurnArray();
        int[] input = new int[] {1, 3, 5, 7, 9};
        int[] result = turnArray.turn(input);
        int[] expect = new int[] {9, 7, 5, 3, 1};
        assertThat(result, is(expect));
    }
}
