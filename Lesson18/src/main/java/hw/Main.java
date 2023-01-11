package hw;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();
        try {
            System.out.println("Введите цифру 1 или 2");
            System.out.println("Результат:" + service.getValue());
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception exception) {
            System.out.println("Не корректные данные");
        }
    }
}
