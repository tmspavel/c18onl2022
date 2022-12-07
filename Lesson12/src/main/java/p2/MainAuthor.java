package p2;

import lombok.SneakyThrows;

public class MainAuthor {
    @SneakyThrows
    public static void main(String[] args) {
        Author alex = new Author("Alex", 23);
        Author alexClone = (Author) alex.clone();

        System.out.println(alex);
        System.out.println(alexClone);
        alex.setAge(25);

        System.out.println(alex);
        System.out.println(alexClone);
        System.out.println(alex == alexClone);
        System.out.println(alex.hashCode());
        System.out.println(alexClone.hashCode());
        System.out.println(alex.hashCode() == alexClone.hashCode());
        System.out.println(alex.equals(alexClone));
//        если по иквалсу равны то и хешкоды равны
//        если по иквалсу не равны то хешкоды могут быть одинаковыми а может и нет
//        но хешкоды не равны, то мы  можем сказать, что они не экваваленты(false).
    }
}
