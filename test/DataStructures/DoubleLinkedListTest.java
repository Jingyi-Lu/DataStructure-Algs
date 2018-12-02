package DataStructures;

import org.junit.Assert;
import org.junit.Test;

/**
 * DoubleLinkedList Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Dec 3, 2018</pre>
 */
public class DoubleLinkedListTest {

    /**
     * Method: set(Object[] array)
     */
    @Test
    public void testSet() throws Exception {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.set(new Integer[]{4,3,2,1});
        Assert.assertTrue(list.item == 4);
        Assert.assertTrue(list.pre == null);
        list = list.post;
        Assert.assertTrue(list.item == 3);
        Assert.assertTrue(list.pre.post == list);
        Assert.assertTrue(4 == ((DoubleLinkedList<Integer>) list.pre).item);
    }
} 
