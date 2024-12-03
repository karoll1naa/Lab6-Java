package Gemstone;

import java.util.*;

public class CollectionSet<T extends Stone> implements Set<T> {
    private LinkedList<T> internalList;

    public CollectionSet() {
        this.internalList = new LinkedList<>();
    }

    public CollectionSet(T stone) {
        this();
        if (stone != null) {
            this.add(stone);
        }
    }

    public CollectionSet(Collection<? extends T> stones) {
        this();
        if (stones != null) {
            this.addAll(stones);
        }
    }

    @Override
    public int size() {
        return internalList.size();
    }

    @Override
    public boolean isEmpty() {
        return internalList.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return internalList.contains(o);
    }

    @Override
    public Iterator<T> iterator() {
        return internalList.iterator();
    }

    @Override
    public Object[] toArray() {
        return internalList.toArray();
    }

    @Override
    public <U> U[] toArray(U[] a) {
        return internalList.toArray(a);
    }

    @Override
    public boolean add(T t) {
        if (t == null || internalList.contains(t)) {
            return false;
        }
        return internalList.add(t);
    }

    @Override
    public boolean remove(Object o) {
        return internalList.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return internalList.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        boolean isChanged = false;
        for (T t : c) {
            if (this.add(t)) {
                isChanged = true;
            }
        }
        return isChanged;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return internalList.retainAll(c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return internalList.removeAll(c);
    }

    @Override
    public void clear() {
        internalList.clear();
    }

    @Override
    public String toString() {
        return internalList.toString();
    }
}
