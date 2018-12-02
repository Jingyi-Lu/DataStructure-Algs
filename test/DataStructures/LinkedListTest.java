package DataStructures;

import org.junit.Assert;
import org.junit.Test;

/**
 * LinkedList Tester.
 *
 * @author Jingyi Lu
 * @version 1.0
 * @since <pre>Dec 2, 2018</pre>
 */
public class LinkedListTest {
    LinkedList<Integer> list;

    /**
     * Method: set(Object[] array)
     */
    @Test
    public void testSet() throws Exception {
        list = new LinkedList<>();
        list.set(new Integer[]{1, 3, 4, 6});
        Assert.assertTrue(list.get(0) == 1);
        Assert.assertTrue(list.get(3) == 6);
    }

    /**
     * Method: add(T item)
     */
    @Test
    public void testAdd() throws Exception {
        list = new LinkedList<>();
        list.set(new Integer[]{1, 3, 4, 6});
        Assert.assertTrue(list.get(0) == 1);
        Assert.assertTrue(list.get(3) == 6);
        list.add(5);
        Assert.assertTrue(list.get(4) == 5);
        list.add(new LinkedList<Integer>(0, new LinkedList<Integer>(7)));
        Assert.assertTrue(list.get(5) == 0);
        Assert.assertTrue(list.get(6) == 7);
    }

} 
