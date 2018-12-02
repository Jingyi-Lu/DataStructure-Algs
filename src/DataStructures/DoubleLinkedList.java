package DataStructures;

/**
 * Jingyi Lu 12/2/2018
 */
public class DoubleLinkedList<T> extends List{
    public DoubleLinkedList pre;
    public DoubleLinkedList post;
    public T item;

    public DoubleLinkedList() {

    }

    public DoubleLinkedList(T item){
        this.item = item;
    }

    @Override
    public void set(Object[] array) {
        if (array.length == 0) return;
        DoubleLinkedList<T> current = this;
        DoubleLinkedList<T> last = null;
        current.item = (T) array[0];
        for (int i = 1; i < array.length; i++) {
            current.post = new DoubleLinkedList(array[i]);
            current.pre = last;
            last = current;
            current = current.post;
        }
    }
}
