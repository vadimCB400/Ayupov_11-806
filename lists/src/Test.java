import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class Test {
    LinkedList<String> linkedList;

    @Before
    public void setUp() {
        linkedList = new LinkedList<>();

        linkedList.add("1");
        linkedList.add("2");
        linkedList.add("3");
    }

    @Test
    public void testGetOn0() {
        String expected = "1";
        String actual = (String) linkedList.get(0).getValue();
        assertEquals(expected, actual);
    }

    @Test
    public void testContainsOn4() {
        assertFalse(linkedList.contains("4"));
    }

    @Test
    public void testContainsOn1() {
        assertTrue(linkedList.contains("1"));
    }

    @Test
    public void testSize() {
        int expected = 3;
        int actual = linkedList.size();
        assertEquals(expected, actual);
    }

    @Test
    public void testAddPositionOn1() {
        linkedList.add("a", 1);
        String expected = "a";
        String actual = (String) linkedList.get(1).getValue();
        assertEquals(expected, actual);
    }
}