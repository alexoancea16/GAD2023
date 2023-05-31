package generics.GenericLinked;

class GenericList<T> implements IGenericList<T> {
    private IGenericNode<T> head;

    @Override
    public void insert(T element) {
        IGenericNode<T> newNode = new GenericNode<>(element);
        if (head == null) {
            head = newNode;
        } else {
            IGenericNode<T> currentNode = head;
            while (currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(newNode);
        }
    }

    @Override
    public void println() {
        IGenericNode<T> currentNode = head;
        while (currentNode != null) {
            System.out.println(currentNode.getValue());
            currentNode = currentNode.getNext();
        }
    }
}
