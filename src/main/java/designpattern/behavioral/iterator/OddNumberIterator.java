package designpattern.behavioral.iterator;

import java.util.Iterator;

public class OddNumberIterator implements Iterator<Integer> {
    private Integer value = 0;

    public OddNumberIterator(Integer value) {
        if(value % 2 == 0) {
            value--;
        }
        this.value = value;
    }

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        return value += 2;
    }
}
