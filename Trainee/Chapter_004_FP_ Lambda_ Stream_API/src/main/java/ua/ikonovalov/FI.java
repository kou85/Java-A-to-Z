package ua.ikonovalov;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Method is sort String to descending used to Lambda
 * @author ikonovalov
 * @since 06.04.20.
 */

public class FI {
    public static void main(String[] args) {
        String[] atts = {
                "image1",
                "image13",
                "image112"
        };
        Comparator<String> sortStringDescending = (left, right)  -> {
            System.out.println("compare - " + left.length() + " : " + right.length());
            return right.length() - left.length();
        };
        Arrays.sort(atts, sortStringDescending);
    }
}
