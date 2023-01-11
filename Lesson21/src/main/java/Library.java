import java.util.List;

public record Library(List<String> books,
                      List<String> readers,
                      String name
) implements Cloneable {
    @Override
    public List<String> books() {
        return books;
    }

    @Override
    public List<String> readers() {
        return readers;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static Library of(List<String> books,
                             List<String> readers,
                             String name) {
        return new Library(books, readers, name);
    }
}