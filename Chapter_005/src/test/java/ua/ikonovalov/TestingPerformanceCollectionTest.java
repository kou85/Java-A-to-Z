package ua.ikonovalov;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.TreeSet;



import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Class TestingPerformanceCollectionTest.
 *
 * @author ua.ikonovalov.
 * @since 04.05.2017.
 * @version 1.0.
 */
public class TestingPerformanceCollectionTest {

    
    /**
     * A variable number of items added to the collection.
     */
    private final int elementAdd = 3_000;

    /**
     * A variable number of elements removed from the collection.
     */
    private final int elementRemove = 2_800;

    /**
     * The string value of the element added to the collection.
     */
    private String lineTest = "elementTest";

    /**
     * Test collection ArrayList.
     */
    private ArrayList<String> testArrayList;

    /**
     * Test collection LinkedList.
     */
    private LinkedList<String> testLinkedList;

    /**
     * Test collection TreeSet.
     */
    private TreeSet<String> testTreeSet;

    /**
     * An instance of the class.
     */
    private TestingPerformanceCollection TestingPerformanceCollection;

    /**
     * The element of the collection to the test.
     */
    private String testExpectedElement;

    /**
     * Variable time adding items.
     */
    private long testTimeAdd;

    /**
     * Variable time remove items.
     */
    private long testTimeDelete;

    /**
     * The transition to the next line.
     */
    private String enter = System.getProperty("line.separator");

    /**
     * The method initializes a string with the transition to the next.
     * @param message Line.
     */
    private void message(String message) {
        System.out.printf("%s%s", message, enter);
    }

    /**
     * The class contains the initialize and instance of the class for tests.
     */
    @Before
    public  void infoForTest() {
        testArrayList = new ArrayList<>();
        testLinkedList = new LinkedList<>();
        testTreeSet = new TreeSet<>();
        TestingPerformanceCollection = new TestingPerformanceCollection();
        testExpectedElement = String.format("%s - %s", lineTest, elementRemove);

    }

    /**
     * Test class CollectionTest, c ArrayList collection and check the
     * remaining number of items after adding and removing.
     * @throws Exception Exception when errors test.
     */
    @Test
    public void whenUsedArrayListCollectionAddAndRemove() throws Exception {
        message("Time adding and delete ArrayList elements: ");
        testTimeAdd = TestingPerformanceCollection.add(testArrayList, lineTest, elementAdd);
        testTimeDelete = TestingPerformanceCollection.delete(testArrayList, elementRemove);
        System.out.println(String.format("Adding : %s ms", testTimeAdd));
        System.out.println(String.format("Delete : %s ms %s", testTimeDelete, enter));
        assertThat(testArrayList.size(), is(elementAdd - elementRemove));
    }

    /**
     * Test class CollectionTest, c LinkedList collection and check the
     * remaining number of items after adding and removing.
     * @throws Exception Exception when errors test.
     */
    @Test
    public void whenUsedLinkedListCollectionAddAndRemove() throws Exception {
        message("Time adding and delete LinkedList elements: ");
        testTimeAdd = TestingPerformanceCollection.add(testLinkedList, lineTest, elementAdd);
        testTimeDelete = TestingPerformanceCollection.delete(testLinkedList, elementRemove);
        System.out.println(String.format("Adding : %s ms", testTimeAdd));
        System.out.println(String.format("Delete : %s ms %s", testTimeDelete, enter));
        assertThat(testLinkedList.size(), is(elementAdd - elementRemove));
    }

    /**
     * Test class CollectionTest, c TreeSet collection and check the
     * remaining number of items after adding and removing.
     * @throws Exception Exception when errors test.
     */
    @Test
    public void whenUsedTreeSetCollectionAddAndRemove() throws Exception {
        message("Time adding and delete TreeSet elements: ");
        testTimeAdd = TestingPerformanceCollection.add(testTreeSet, lineTest, elementAdd);
        testTimeDelete = TestingPerformanceCollection.delete(testTreeSet, elementRemove);
        System.out.println(String.format("Adding : %s ms", testTimeAdd));
        System.out.println(String.format("Delete : %s ms %s", testTimeDelete, enter));
        assertThat(testTreeSet.size(), is(elementAdd - elementRemove));
    }

    /**
     * Test class CollectionTest, c ArrayList collection and check the
     * element with index zero and after removal of the elements.
     * @throws Exception Exception when errors test.
     */
    @Test
    public void whenUsedArrayListCollectionAddAndRemoveElements() throws Exception {
        testTimeAdd = TestingPerformanceCollection.add(testArrayList, lineTest, elementAdd);
        testTimeDelete = TestingPerformanceCollection.delete(testArrayList, elementRemove);
        assertThat(testArrayList.get(0), is(testExpectedElement));
    }

    /**
     * Test class CollectionTest, c LinkedList collection and check the
     * element with index zero and after removal of the elements.
     * @throws Exception Exception when errors test.
     */
    @Test
    public void whenUsedLinkedListCollectionAddAndRemoveElements() throws Exception {
        testTimeAdd = TestingPerformanceCollection.add(testLinkedList, lineTest, elementAdd);
        testTimeDelete = TestingPerformanceCollection.delete(testLinkedList, elementRemove);
        assertThat(testLinkedList.get(0), is(testExpectedElement));
    }

}