package p7;

import lombok.ToString;

@ToString
class Key implements Comparable<Key> {
    String key;

    Key(String key) {
        this.key = key;
    }

    @Override
    public int hashCode() {
        return (int) key.charAt(0);
    }

    @Override
    public boolean equals(Object o) {
        return key.equals(((Key) o).key);
    }

    @Override
    public int compareTo(Key o) {
        return key.compareTo(o.key);
    }
}