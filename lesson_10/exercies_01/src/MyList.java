public class MyList<E> {
    private int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }
    public MyList(int capacity) {
        this.elements = new Object[capacity];
    }
    public void add(int index, E element) {
        if(index<0 || index > size){
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        ensureCapacity(size + 1);
        System.arraycopy(elements, index, elements, index + 1, size - index);
        elements[index] = element;
        size++;
    }
    public boolean add(E e) {
        ensureCapacity(size + 1);
        elements[size++] = e;
        return true;
    }

    public E remove(int index) {
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        E removedElement = (E) elements[index];
        int numMoved = size - index - 1;
        if(numMoved > 0){
            System.arraycopy(elements, index + 1, elements, index, numMoved);
        }
        elements[--size] = null;
        return removedElement;
    }

    public int size(){
        return size;
    }

    public E clone(){
        MyList<E> newList = new MyList<>(elements.length);
        for(int i = 0; i < size; i++){
            newList.add((E) elements[i]);
        }
        return (E) newList;
    }

    public boolean contains(E e){
        return indexOf(e) >= 0;
    }

    public int indexOf(E o){
        for(int i = 0; i < size; i++){
            if(o.equals(elements[i])){
                return i;
            }
        }
        return -1;
    }
    public void ensureCapacity(int minCapacity) {
        if (minCapacity > elements.length) {
            int newCapacity = Math.max(minCapacity, elements.length * 2);
            Object[] newElement = new Object[newCapacity];
            System.arraycopy(elements, 0, newElement, 0, size);
            elements = newElement;
        }
    }
    public E get(int i){
        if(i < 0 || i >= size){
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + size);
        }
        return (E) elements[i];
    }

    public void clear(){
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }
}
