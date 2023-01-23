//import static java.util.Objects.nonNull;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public record Library(List<String> books,
//                      List<String> readers,
//                      String name
//) implements Cloneable {
//
//    public Library(List<String> books, List<String> readers, String name) {
//        this.books = nonNull(books) ? books : new ArrayList<>();
//        this.readers = nonNull(readers) ? readers : new ArrayList<>();
//        this.name = name;
//    }
//
//    @Override
//    public List<String> books() {
//        return books;
//    }
//
//    @Override
//    public List<String> readers() {
//        return readers;
//    }
//
//    @Override
//    protected Library clone() throws CloneNotSupportedException {
//        return (Library) super.clone();
//    }
//
//    public static Library of(List<String> books,
//                             List<String> readers,
//                             String name) {
//        return new Library(books, readers, name);
//    }
//}
