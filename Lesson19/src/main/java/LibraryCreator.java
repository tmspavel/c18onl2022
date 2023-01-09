import lombok.experimental.UtilityClass;

import java.awt.print.Book;
import java.util.Arrays;
import java.util.List;

@UtilityClass
public class LibraryCreator {

    public static List<?> createLibraries(Type type) {
        return switch (type) {
            case BOOK -> Arrays.asList(new Book());
            case LIBRARY -> Arrays.asList(new Library());
        };


//        List<Library> libraries = new ArrayList<>();
//        libraries.add(new Library());
//        return libraries;
    }

    enum Type {
        LIBRARY, BOOK
    }
}

