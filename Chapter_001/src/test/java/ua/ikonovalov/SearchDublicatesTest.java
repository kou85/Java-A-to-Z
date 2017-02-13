package ua.ikonovalov;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


/**
* Test.
* @author Ivan Konovalov.
* @version 1.0.
* @since 16.12.2016.
*/
/**
 * Test class for class SearchDublicates.
 */
public class SearchDublicatesTest {

    /**
    * Testing method findDublicatesRemove().
    */
    @Test
    public void whenTheStringArraySearchDublicates() {
        SearchDublicates arr = new SearchDublicates();
        String[] tempArray = {"One", "Two", "One", "Three", "Three", "Four"};
        boolean result = arr.findDublicates(tempArray);
        boolean expectResult = true;
        assertThat(result, is(expectResult));
    }
 }