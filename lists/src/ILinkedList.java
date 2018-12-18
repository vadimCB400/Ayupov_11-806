import java.util.Iterator;

public interface ILinkedList<T>{
    void add(T element);

    void add(T element, int position);

    Node<T> get(int position);

    int size();

    Node<T>[] toArray();

    boolean contains(T element);

    void remove(int position);

    void addAll(ILinkedList<T> elements);

    void addAll(ILinkedList<T> elements, int position);

    Iterator<Node<T>> getIterator();
}
