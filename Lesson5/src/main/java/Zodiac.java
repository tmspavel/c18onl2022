public class Zodiac {
    //4) Дано 2 числа, день и месяц рождения.
    // Написать программу, которая определяет знак зодиака человека.
    public String getZodiacName(int month, int day) {
        //логика

//        Овен (21 марта – 20 апреля)
//        Телец (21 апреля – 21 мая) ...
//        Близнецы (22 мая – 21 июня) ...
//        Рак (22 июня – 22 июля) ...
//        Лев (23 июля – 21 августа) ...
//        Дева (22 августа – 23 сентября) ...
//        Весы (24 сентября – 23 октября) ...
//        Скорпион (24 октября – 23 ноября)
//        Стрелец (23 ноября — 22 декабря)
//        Козерог (23 декабря — 20 января)
//        Водолей (21 января — 19 февраля)
//        Рыбы (20 февраля — 20 марта)

        String result = null;
        if (month == 1 && checkDay(day, 21, 31) || month == 2 && checkDay(day, 1, 19)) {
            result = "Водолей";
        } else if (month == 2 && checkDay(day, 20, 29) || month == 3 && checkDay(day, 1, 20)) {
            result = "Рыбы";
        }
        return result;
    }

    public String getZodiacNameSecond(int month, int day) {
        switch (month) {
            case Constants.JANUARY:
                return checkDay(day, 21, 31) ? "водолей" : checkDay(day, 1, 20) ? "Козерог" : null;
//            if (checkDay(day, 21, 31)) {
//                return "водолей";
//            } else if (checkDay(day, 1, 20)) {
//                return "Козерог";
//            } else {
//                return null;
//            }
            case 2:
                return checkDay(day, 1, 19) ? "водолей" : checkDay(day, 20, 29) ? "Рыбы" : null;
            //и т.д
            case 12:
        }
        return null;
    }

    private boolean checkDay(int day, int from, int to) {
        return day >= from && day <= to;
    }
}
