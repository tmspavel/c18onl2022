//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.function.Function;
//import lombok.NonNull;
//import test.Person;
//
//public class Main<sealed> {
//
//    public static void main(String[] args) throws CloneNotSupportedException {
//
//        Library library1 = new Library(new ArrayList<>(), new ArrayList<>(), "");
//
//        Library library = Library.of(Arrays.asList("1"), Arrays.asList("2"), "sd");
//        System.out.println(library.books());
//        System.out.println(library.hashCode());
//
//        var clone = library.clone();
//        if (clone == library) {
//            System.out.println("одинаковые");
//        }
//        System.out.println(clone.hashCode());
//
//        Data data = new Data("asdsa", 4);
//        System.out.println(data.hashCode());
//        Data data2 = new Data("sdf", 1);
//
//        System.out.println(new DataEmpty().hashCode());
//
//        System.out.println(data2.hashCode());
//        System.out.println(data2.toString());
//        System.out.println(data.equals(data2));
//        MyData myData = new MyData();
//        System.out.println(myData.hashCode());
//
//        String date = "2023-01-02";
//        LocalDate localDate = LocalDate.parse(date, DateTimeFormatter.ISO_LOCAL_DATE);
//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("EEEE");
//        System.out.println(localDate.format(dateTimeFormatter));
//
//        String message = "Some message…..";
//
//        Function<String, String> append = (@NonNull var string) -> string + " Text";
//        String appendedString = append.apply("Some");
//        System.out.println(appendedString);
//
//        extracted();
//
//        Person person = new Person();
//
//
//    }
//
//    private static Data extracted() {
//        System.out.println("sdf");
//        return new Data("asdfd", 3);
//    }
//}
//
//record DataEmpty() {
//
//}
//
//record Data(String name, int counter) {
//
//}
//
//class MyData {
//
//}
