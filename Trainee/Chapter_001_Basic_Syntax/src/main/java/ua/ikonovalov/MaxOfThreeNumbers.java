package ua.ikonovalov;

/**
 * Created by Ivan on 01.08.18.
 */
public class MaxOfThreeNumbers {

    /**
     *
     * @param first
     * @param second
     * @param three
     * @return
     */
    public int maxThreeNumbers(int first, int second, int three) {
        MaxOfTwoNumbers maxOfTwoNumbers = new MaxOfTwoNumbers();
        int temp = maxOfTwoNumbers.maxOfTwoNumbers(first, second);
        return maxOfTwoNumbers.maxOfTwoNumbers(temp, three);

    }
}
