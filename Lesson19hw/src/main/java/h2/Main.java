package h2;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class Main {
    //https://skillbox.ru/media/code/java-stream-api-kopilka-retseptov/
    public static void main(String[] args) {
        Library library = new Library();
        library.getBooks().add(new Book("sdf", "sdf", 21341));
        Book book1 = new Book("sdf", "sdf", 21341);
        library.getBooks().add(book1);
        library.getBooks().add(new Book("bb", "234", 21341));
        library.getBooks().add(new Book("bwe", "64", 21341));
        Reader reader1 = new Reader("asd", "asdasd", true);
        reader1.setBooks(Arrays.asList(book1));
        library.getReaders().add(reader1);


        //Получить список всех книг библиотеки, отсортированных по году издания.
        doWithoutLambda(library.getBooks());
        List list = library.getBooks().stream()
                .sorted(Comparator.comparing(Book::getIssueYear))
                .collect(Collectors.toList());

        //Требуется создать список рассылки (объекты типа EmailAddress) из адресов всех читателей библиотеки. При этом флаг согласия на рассылку учитывать не будем: библиотека закрывается, так что хотим оповестить всех.
        {
            List<EmailAddress> addresses = new ArrayList<>();
            for (Reader reader : library.getReaders()) {
                addresses.add(new EmailAddress(reader.getEmail()));
            }
        }
        {
            List<EmailAddress> addresses = library.getReaders().stream()
                    .map(Reader::getEmail)
                    .map(EmailAddress::new)
                    .collect(Collectors.toList());
        }

        //Снова нужно получить список рассылки. Но на этот раз включаем в него только адреса читателей, которые согласились на рассылку. Дополнительно нужно проверить, что читатель взял из библиотеки больше одной книги.
        {
            List<EmailAddress> addresses = new ArrayList<>();
            for (Reader reader : library.getReaders()) {
                if (reader.getBooks().size() > 1 && reader.isSubscriber())
                    addresses.add(new EmailAddress(reader.getEmail()));
            }
        }
        {
            List<EmailAddress> addresses = library.getReaders().stream()
                    .filter(Reader::isSubscriber)
                    .filter(reader -> reader.getBooks().size() > 1)
                    .map(Reader::getEmail)
                    .map(email -> new EmailAddress(email))
                    .toList();
        }
        //Получить список всех книг, взятых читателями. Список не должен содержать дубликатов (книг одного автора, с одинаковым названием и годом издания).
        Set<Book> result = new LinkedHashSet<>();
        for (Reader reader : library.getReaders()) {
            result.addAll(reader.getBooks());
        }
        List<Book> bookList = library.getReaders().stream()
                .flatMap(reader -> reader.getBooks().stream())
                .distinct()
                .toList();

//        Проверить, взял ли кто-то из читателей библиотеки какие-нибудь книги Пушкина.
        checkAuthorBooks(library);
        boolean match = library.getReaders().stream()
                .flatMap(reader -> reader.getBooks().stream())
                .anyMatch(book -> "Пушкин".equals(book.getAuthor()));

        //Узнать наибольшее число книг, которое сейчас на руках у читателя.
        {
            int max = 0;
            for (Reader reader : library.getReaders()) {
                if (reader.getBooks().size() > max) {
                    max = reader.getBooks().size();
                }
            }
        }
        {
            Integer reduce = library.getReaders().stream()
                    .map(reader -> reader.getBooks().size())
                    .reduce(0, (max, size) -> size > max ? size : max);
        }
        //Теперь нужно не просто отправить письма всем, кто согласился на рассылку, — будем рассылать разные тексты двум группам:
        //
        //тем, у кого взято меньше двух книг, просто расскажем о новинках библиотеки;
        //тем, у кого две книги и больше, напомним о том, что их нужно вернуть в срок.
        //То есть надо написать метод, который вернёт два списка адресов (типа EmailAddress): с пометкой OK — если книг не больше двух, или TOO_MUCH — если их две и больше. Порядок групп не важен.
        method(library);
        {
            Map<String, List<EmailAddress>> map = library.getReaders().stream()
                    .filter(Reader::isSubscriber)
                    .collect(Collectors.groupingBy(r -> r.getBooks().size() > 2 ? "TOO_MUCH" : "OK",
                            Collectors.mapping(r -> new EmailAddress(r.getEmail()), Collectors.toList())));

            for (Map.Entry<String, List<EmailAddress>> entry : map.entrySet()) {
                String emails = entry.getValue().stream()
                        .map(EmailAddress::getEmail)
                        .collect(joining(","));
                System.out.println(entry.getKey() + " - " + emails);
            }


            map.values().stream()
                    .flatMap(Collection::stream)
                    .map(EmailAddress::getEmail)
                    .forEach(System.out::println);
        }
        //Если нужны не адреса, а просто списки читателей в каждой группе:
        Map<String, List<Reader>> readerstMap = library.getReaders().stream()
                .filter(Reader::isSubscriber)
                .collect(groupingBy(r -> r.getBooks().size() > 2 ? "TOO_MUCH" : "OK"));
        //Если для каждой группы нужны ФИО читателей из этой группы, перечисленные через запятую. И ещё каждый такой список ФИО нужно обернуть фигурными скобками.
        {
            Map<String, String> readersFIOMap = library.getReaders().stream()
                    .filter(Reader::isSubscriber)
                    .collect(groupingBy(r -> r.getBooks().size() > 2 ? "TOO_MUCH" : "OK",
                            mapping(Reader::getFio, joining(", ", "{", "}"))));
            String readersFios = readersFIOMap.get("OK");
            System.out.println(readersFios);
        }
    }

    private static Map<String, List<EmailAddress>> method(Library library) {

        Map<String, List<EmailAddress>> result = new HashMap<>();
        for (Reader reader : library.getReaders()) {
            if (reader.isSubscriber()) {
                if (reader.getBooks().size() > 2) {
                    if (!result.containsKey("TOO_MUCH")) {
                        result.put("TOO_MUCH", new ArrayList<>());
                    }
                    result.get("TOO_MUCH").add(new EmailAddress(reader.getEmail()));
                } else {
                    if (!result.containsKey("OK")) {
                        result.put("OK", new ArrayList<>());
                    }
                    result.get("OK").add(new EmailAddress(reader.getEmail()));
                }
            }
        }
        return result;
    }

    private static boolean checkAuthorBooks(Library library) {
        boolean result = false;
        for (Reader reader : library.getReaders()) {
            for (Book book : reader.getBooks()) {
                if ("Пушкин".equals(book.getAuthor())) {
//                    result = true;
//                    break;
                    return true;
                }
            }
        }
        return result;
    }


    public static List<Book> doWithoutLambda(List<Book> books) {
        List<Book> tempBooks = new ArrayList<>(books);
        tempBooks.sort(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getIssueYear().compareTo(o2.getIssueYear());
            }
        });
        return tempBooks;
    }

}
