package p2;

public class BookMain {
    public static void main(String[] args) throws CloneNotSupportedException {


        Book book1 = new Book("книга", new Author("Толстой", 23));
        Object clone = book1.clone();
        System.out.println(clone);


//        Author author = new Author("Author", 45);
        Book book = new Book("sdfds", null);
        System.out.println(book);
        try {
            Object bookClone = bookClone(book);
        } catch (RuntimeException exception) {
            System.err.println("Unexpected error " + exception);
        } catch (Exception e) {
            System.out.println("Exception");
        }

//        System.out.println(bookClone);
//        author.setName("new");
//        System.out.println(book);
//        System.out.println(bookClone);
    }

    private static Object bookClone(Book book) throws Exception {
//        try {
//            Object bookClone = book.clone();
        if (5 > 2) {
            throw new RuntimeException("my CloneNotSupportedException");
        } else {
            throw new Exception("asd");
        }
//        } catch (CloneNotSupportedException exception) {
//            System.out.println("Unexpected error " + exception);
//            exception.printStackTrace();
//            return null;
//        }
//        return null;
    }
}
