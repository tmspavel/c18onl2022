package simple_flowers;

import static simple_flowers.Flower.getCount;
import static simple_flowers.FlowerType.ROSE;

public class Main {
    /**
     * Задача2: Цветочный магазин.
     * * Создать класс "Flower", который содержит переменные имя и стоимость, гет сет и toString (lombok подключаем)
     * * Необходимо:
     * * 1) собрать 5 букетов (используем массив) с определением их стоимости, т.е создаем класс Bouquet,
     * * который содержит массив объектов Flower, который инициализируется через конструктор, а также метод по вычислению стоимости.
     * * 2) вывести на консоль информацию по каждому букету.
     * * 3*звездочка) Подсчитать количество всех проданных цветов.
     * * Пояснения решения:
     * * Создать класс FlowerMarket, который содержит метод public Bouquet getBouquet(String... flowers),
     * * Создать enum FlowerType c константами названия цветов.
     * * Для создания букета в метод getBouquet нужно передавать константы через запятую(ROSE, ROSE, ROSE, ROSE, ROSE)
     * * По названию константы enam создать объект класса Flower и поместить в массив,
     * * для передачи его в класс букета.
     * * Также в енам константах необходимо создать переменную cost(стоимость) типа int и прописать стоимость каждого цветка, гет, сет, конструктор!
     * * ROSE - 15
     * * LILY - 7
     * * ASTER - 5
     * * HERBERA - 5
     * * TULIP - 8
     * * CARNATION - 11
     *
     * @param args
     */
    public static void main(String[] args) {
        FlowerMarket flowerMarket = new FlowerMarket();
        Bouquet[] bouquets = new Bouquet[5];
        bouquets[0] = flowerMarket.getBouquet(ROSE, ROSE, ROSE);
        for (Bouquet bouquet : bouquets) {
            System.out.println(bouquet);
            System.out.println("стоимость букета " + bouquet.getPrice());
            System.out.println("количество проданных цветов " + getCount());
        }
        System.out.println("выручка за день ");
    }
}
