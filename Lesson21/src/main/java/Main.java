import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Library library = Library.of(Arrays.asList("1"), Arrays.asList("2"), "sd");
        System.out.println(library.books());
        System.out.println(library.hashCode());


        Library clone = (Library) library.clone();
        if (clone == library) {
            System.out.println("одинаковые");
        }
        System.out.println(clone.hashCode());

        Data data = new Data();
        System.out.println(data.hashCode());
        Data data2 = new Data();
        System.out.println(data2.hashCode());
        System.out.println(data2.toString());
        System.out.println(data.equals(data2));
        MyData myData = new MyData();
        System.out.println(myData.hashCode());

        String date = "2023-01-02";
        LocalDate localDate = LocalDate.parse(date, DateTimeFormatter.ISO_LOCAL_DATE);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("EEEE");
        System.out.println(localDate.format(dateTimeFormatter));

    }
}

record Data() {
}

class MyData {
}
