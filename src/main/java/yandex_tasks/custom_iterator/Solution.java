package yandex_tasks.custom_iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Solution {
}

class CustomIterator {
    Iterator collection;

    public void Iterator(Iterator<Integer> collection) {
        this.collection = collection;
    }

    int next() {
        while(collection.hasNext()) {
            int next = (int) collection.next();
            if (next % 2 == 0) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    boolean hasNext() {
        try {
            return collection.hasNext();
        } catch (NoSuchElementException ex) {
            return false;
        }
    }
}