package p4;

import lombok.AllArgsConstructor;

import java.util.Iterator;

@AllArgsConstructor
public class MyIterable<T> implements Iterable {

    private T name;


    @Override
    public Iterator iterator() {
        return new Iterator() {//как курсор

            private int count;

            @Override
            public boolean hasNext() {
                return count < 10;
            }

            @Override
            public Object next() {
                count++;
                return name;
            }
        };
    }
}
