package decorator;

public class App {

    public static void main(String[] args) {
        // Гадание на Таро
        Service taro = new decorator.Divination("Таро", 1000);
        Service chakra = new decorator.Chakra(taro);
        Service aura = new decorator.Aura(chakra);

        // И общая стоимость
        System.out.println(aura.getPrice());
        System.out.println(aura.getLabel());
    }
}
