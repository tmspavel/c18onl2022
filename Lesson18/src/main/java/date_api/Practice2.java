package date_api;

import lombok.SneakyThrows;

import java.util.Date;

public class Practice2 {

    @SneakyThrows
    public static void main(String[] args) {
        {
            System.out.println("1вариант");
            //сравнение дат
            Date date1 = new Date();
            Date date2 = new Date();
            System.out.println(date1.getTime() - date2.getTime());//0
            System.out.println(date2.getTime() > date1.getTime());//false
            System.out.println(date1.compareTo(date2) == 0);//true
        }
//
        {
            System.out.println("2вариант");
            //сравнение дат
            Date date1 = new Date();
            Thread.sleep(100);
            Date date2 = new Date();
            System.out.println(date2.getTime() - date1.getTime());
            System.out.println(date2.getTime() > date1.getTime());
        }
//
//        {
//            System.out.println("3вариант");
        //сравнение дат
        Date date1 = new Date();
        Thread.sleep(100);
        Date date2 = new Date();
        System.out.println(date2.getTime() - date1.getTime());

        System.out.println(date2.after(date1));//true
        System.out.println(date1.before(date2));//true
    }

    //
    {
//            System.out.println("4вариант");
//            //сравнение дат
        Date date1 = new Date();
        Date date2 = new Date();
//        date1.getTime() == date2.getTime()
        System.out.println(date2.equals(date1));//true
//
    }
//
//        Date date = new Date();
//        date.setYear(2017);


//    }

}
