package h2;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books;
    private List<Reader> readers;


//    public Library() {
////        init();
//    }

//    private void init() {
//        books = new ArrayList<>();
//        books.add(new Book("Оруэлл", "1984", 2021));
//        //и так далее для других книг
//
//        readers = new ArrayList<>();
//        Reader reader = new Reader("Иванов Иван Иванович", "ivanov.email@test.ru", true);
//        reader.getBooks().add(books.get(1));
//        readers.add(reader);
//        //и так далее для других читателей
//
//        //и так далее для других читателей и взятых книг
//    }


    public List<Book> getBooks() {
        if (books == null) {
            books = new ArrayList<>();
        }
        return books;
    }

    public List<Reader> getReaders() {
        if (readers == null) {
            readers = new ArrayList<>();
        }
        return readers;
    }
}
