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
 * Test class for class RemoveDublicates.
 */
public class RemoveDublicatesTest {

    /**
    * Testing method findDublicatesRemove().
    */
    @Test
    public void whenTheStringArrayRemoveDublicates() {
        RemoveDublicates arr = new RemoveDublicates();
        String[] tempArray = {"One", "Two", "One", "Three", "Three", "Four"};
        String[] result = arr.findDublicatesRemove(tempArray);
        String[] expectResult = {"One", "Two", "Three", "Four"};
        assertThat(result, is(expectResult));
    }
 }