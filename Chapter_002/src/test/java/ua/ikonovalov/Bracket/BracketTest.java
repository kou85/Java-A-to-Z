package ua.ikonovalov.Bracket;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


/**
 * Class CheckBracketsTest.
 *
 * @author Konovalov.
 * @since 20.04.2017.
 * @version 1.0.
 */
public class BracketTest {
    /**
     * Testing method checkSymbol.
     */
    @Test
    public void whenAddStringLineAndCheckThatResultTrueAndFalse() {
        Bracket testBrackets = new Bracket();
        boolean result = testBrackets.testBracket("(()())()()()()");
        boolean resultTwo = testBrackets.testBracket(")(((((()))))");
        boolean resultTree = testBrackets.testBracket("())())");
        boolean resultFour = testBrackets.testBracket("()()()");
        boolean resultFive = testBrackets.testBracket("()()()((()(((())))(())()))");
        assertThat(result, is(true));
        assertThat(resultTwo, is(false));
        assertThat(resultTree, is(false));
        assertThat(resultFour, is(true));
        assertThat(resultFive, is(true));

    }


}
