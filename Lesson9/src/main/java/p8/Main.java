package p8;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Book book = new Book(33, "Война и мир", "Толстой", 1863);
        book.setPerson(new Person("123"));
        System.out.println(book);
//        try {
        Book clone = book.clone();
        System.out.println(clone);
//            Book book1 = new Book(book.getName(), book.getAuthor(), book.getYear());

//            System.out.println(clone);
//            System.out.println(book == clone);
//            System.out.println(book.equals(clone));
//        } catch (Exception exception) {
//            System.out.println(exception);
//        }


    }
}
