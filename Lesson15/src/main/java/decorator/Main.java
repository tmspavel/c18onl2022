package decorator;

public class Main {
    /**
     * https://codernet.ru/articles/drugoe/dekorator_java_primer_patterna_shablon_proektirovaniya_na_yazyike_java/
     *
     * @param args
     */
    public static void main(String[] args) {

        Bike standardBike = new StandardBike();
        System.out.println("Скорость стандартного мотоцикла - " + standardBike.getSpeed());
        System.out.println("Стандартный мотоцикл может принимать вес - " + standardBike.getHisWeight());

        Bike sportBike = new SportBike(standardBike);
        System.out.println("Спорт байк " + sportBike.getSpeed());
    }
}
