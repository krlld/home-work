package lesson13.task4;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class CustomArrayList<T> implements Iterable<T> {
    private Object[] data;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public CustomArrayList() {
        data = new Object[DEFAULT_CAPACITY];
    }

    public CustomArrayList(int capacity) {
        data = new Object[capacity];
    }

    public void add(T element) {
        checkSize();
        data[size] = element;
        size++;

    }

    public void add(T element, int index) throws ArrayIndexOutOfBoundsException {
        checkIndex(index);
        checkSize();
        for (int i = size; i > index; i--) {
            data[i] = data[i - 1];
        }
        data[index] = element;
        size++;
    }

    public void remove(int index) throws ArrayIndexOutOfBoundsException {
        checkIndex(index);
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        size--;
    }

    public T get(int index) throws ArrayIndexOutOfBoundsException {
        checkIndex(index);
        return (T) data[index];
    }

    public boolean isContains(Object obj) {
        for (Object item : data) {
            if (item.equals(obj)) {
                return true;
            }
        }
        return false;
    }

    public void clear() {
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void checkIndex(int index) throws ArrayIndexOutOfBoundsException {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    private void checkSize() {
        if (size == data.length) {
            grove();
        }
    }

    private void grove() {
        Object[] buf = new Object[data.length * 3 / 2 + 1];
        for (int i = 0; i < size; i++) {
            buf[i] = data[i];
        }
        data = buf;
    }

    private class IteratorImpl implements Iterator<T> {
        private int counter = 0;

        /**
         * Returns {@code true} if the iteration has more elements.
         * (In other words, returns {@code true} if {@link #next} would
         * return an element rather than throwing an exception.)
         *
         * @return {@code true} if the iteration has more elements
         */
        @Override
        public boolean hasNext() {
            return counter != size;
        }

        /**
         * Returns the next element in the iteration.
         *
         * @return the next element in the iteration
         * @throws NoSuchElementException if the iteration has no more elements
         */
        @Override
        public T next() {
            if (counter >= size) {
                throw new NoSuchElementException();
            }
            return (T) data[counter++];
        }
    }

    /**
     * Returns an iterator over elements of type {@code T}.
     *
     * @return an Iterator.
     */
    @Override
    public Iterator<T> iterator() {
        return new IteratorImpl();
    }
}
