package DataStructures;

/**
 * Jingyi Lu 12/2/2018
 */
public class LinkedList<T> extends List{
    public T item;
    public LinkedList next;

    LinkedList() {

    }

    LinkedList(T item){
        this.item = item;
    }

    LinkedList(T item, LinkedList<T> next){
        this.item = item;
        this.next = next;
    }

    /**
     * @param array
     * parse an array to a linkedlist O(n)
     */
    @Override
    public void set(Object[] array) {
        if (array.length == 0) return;
        LinkedList<T> current = this;
        current.item = (T) array[0];
        for (int i = 1; i < array.length; i++) {
            current.next = new LinkedList(array[i]);
            current = current.next;
        }
    }

    /**
     * @param index
     * return the index th item O(index)
     */
    public T get(int index){
        LinkedList<T> current = this;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.item;
    }

    /**
     * @param item
     * add an item to the tail O(n)
     */
    public void add(T item){
        LinkedList current = this;
        while (current.next != null) current = current.next;
        current.next = new LinkedList(item);
    }

    /**
     * @param list
     * add a list to the tail O(n)
     */
    public void add(LinkedList<T> list){
        LinkedList current = this;
        while (current.next != null) current = current.next;
        current.next = list;
    }
}
