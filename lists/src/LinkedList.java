import java.util.Iterator;

public class LinkedList<T> implements ILinkedList {
    private Node<T> header;
    private Node<T> last;
    private int size = 0;

    @Override
    public void add(Object value) {
        Node node = new Node<T>();
        node.setValue(value);

        if (size == 0) {
            header = node;
        } else {
            last.setNext(node);
        }
        last = node;
        size++;
    }

    @Override
    public void add(Object element, int position) {
        Node newNode = new Node();
        newNode.setValue(element);
        newNode.setNext(get(position));
        if (position == 0) {
            header = newNode;
        } else {
            get(position - 1).setNext(newNode);
        }

        size++;
    }

    @Override
    public Node get(int position) {
        int count = 0;
        Node currentNode = header;
        while (count < position) {
            currentNode = currentNode.getNext();
            count++;
        }
        return (Node<T>) currentNode.getValue();
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Node[] toArray() {
        Node[] nodeArray = new Node[size];
        int i = 0;
        Iterator<Node<T>> nodeIterator = getIterator();
        while (nodeIterator.hasNext()) {
            nodeArray[i] = nodeIterator.next();
            i++;
        }
        return nodeArray;
    }

    @Override
    public boolean contains(Object element) {
        Node currentNode = header;
        while (currentNode.getNext() != null) {
            if (currentNode.getValue().equals(element)) {
                return true;
            }
            currentNode = currentNode.getNext();
        }
        return false;
    }

    @Override
    public void remove(int position) {
        if (position == 0) {
            header = header.getNext();
        } else {
            Node node = get(position - 1);
            node.setNext(get(position).getNext());
        }
        size--;
    }

    @Override
    public void addAll(ILinkedList elements) {
        Node node = get(size() - 1);
        node.setNext(elements.get(0));

        size += elements.size() - 1;
    }

    @Override
    public void addAll(ILinkedList elements, int position) {
        elements.get(elements.size()-1).setNext(get(position));
        if (position != 0) {
            get(position - 1).setNext(elements.get(0));
        } else {
            header = elements.get(0);
        }

        size += elements.size() - 1;
    }

    @Override
    public Iterator<Node<T>> getIterator() {
        return new NodeIterator();
    }

    class NodeIterator implements Iterator<Node<T>> {
        private int count = 0;

        @Override
        public boolean hasNext() {
            return count < size;
        }

        @Override
        public Node<T> next() {
            return get(count++);
        }
    }
}
